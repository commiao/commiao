package com.framework.common.http;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.apache.commons.httpclient.DefaultHttpMethodRetryHandler;
import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.HttpException;
import org.apache.commons.httpclient.HttpStatus;
import org.apache.commons.httpclient.NameValuePair;
import org.apache.commons.httpclient.methods.GetMethod;
import org.apache.commons.httpclient.methods.PostMethod;
import org.apache.commons.httpclient.params.HttpMethodParams;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.w3c.dom.Document;

public class HttpCommonClientHelper {
	private final static Logger LOG = LoggerFactory.getLogger(HttpCommonClientHelper.class);

	@SuppressWarnings("deprecation")
	public static String doHttp(String urlStr, String charSet, Map<String, String> parameters, String timeOut) throws Exception {
		String responseString = "";
		PostMethod xmlpost;
		int statusCode = 0;
		HttpClient httpclient = new HttpClient();
		httpclient.setConnectionTimeout(new Integer(timeOut).intValue());
		xmlpost = new PostMethod(urlStr);
		httpclient.getParams().setParameter(HttpMethodParams.HTTP_CONTENT_CHARSET, charSet);
		try {
			// 组合请求参数
			List<NameValuePair> list = new ArrayList<NameValuePair>();
			for (String key : parameters.keySet()) {
				NameValuePair nvp = new NameValuePair(key,String.valueOf(parameters.get(key)));
				list.add(nvp);
			}
			NameValuePair[] nvps = new NameValuePair[list.size()];
			xmlpost.setRequestBody(list.toArray(nvps));
			statusCode = httpclient.executeMethod(xmlpost);
			responseString = xmlpost.getResponseBodyAsString();
			if (statusCode < HttpURLConnection.HTTP_OK || statusCode >= HttpURLConnection.HTTP_MULT_CHOICE) {
				LOG.error("请求接口失败，失败码[{}]",statusCode);
			}
		} catch (IOException e) {
			LOG.error("请求接口IO异常:{}",e);
		}
		return responseString;
	}
	
	public static String useHttpClient_post(String url) {
		String responseString = "";
		String charSet = "UTF-8";
		String timeOut = "50000";
		
		HttpClient httpclient = new HttpClient(); 
		httpclient.setConnectionTimeout(new Integer(timeOut).intValue());
		PostMethod method = new PostMethod(url);
        method.getParams().setParameter(HttpMethodParams.HTTP_CONTENT_CHARSET, charSet);  
        try {  
            int statusCode = httpclient.executeMethod(method);  
  
            if (statusCode != HttpStatus.SC_OK) {  
                System.err.println("Method failed: " + method.getStatusLine());  
            }  
            byte[] responseBody = method.getResponseBody();
            responseString = new String(responseBody);
        } catch (HttpException e) {  
            System.err.println("Fatal protocol violation: " + e.getMessage());  
            e.printStackTrace();  
        } catch (IOException e) {  
            System.err.println("Fatal transport error: " + e.getMessage());  
            e.printStackTrace();  
        } finally {  
            method.releaseConnection();  
        }  
		return responseString;
	}
	
	public static String useHttpClient_get(String url) {
		String responseString = "";
		HttpClient httpclient = new HttpClient();  
        GetMethod method = new GetMethod(url);  
        method.getParams().setParameter(HttpMethodParams.RETRY_HANDLER, new DefaultHttpMethodRetryHandler(3, false));  
        try {  
            int statusCode = httpclient.executeMethod(method);  
  
            if (statusCode != HttpStatus.SC_OK) {  
                System.err.println("Method failed: " + method.getStatusLine());  
            }  
            byte[] responseBody = method.getResponseBody();
            responseString = new String(responseBody);
        } catch (HttpException e) {  
            System.err.println("Fatal protocol violation: " + e.getMessage());  
            e.printStackTrace();  
        } catch (IOException e) {  
            System.err.println("Fatal transport error: " + e.getMessage());  
            e.printStackTrace();  
        } finally {  
            method.releaseConnection();  
        }  
		return responseString;
	}
	
	public static String userHttpURlConnection(String url){
		String responseString = "";
		HttpURLConnection conn = null;  
        URL u = null;
        try {
			u = new URL(url);
			/* 
			 * 此处的urlConnection对象实际上是根据URL的请求协议(此处是http)生成的URLConnection类的子类HttpURLConnection,
			 * 故此处最好将其转化为HttpURLConnection类型的对象,以便用到HttpURLConnection更多的API.如下:
			 */ 
			conn = (HttpURLConnection) u.openConnection();
			conn.setConnectTimeout(10000);
			// 设置是否向httpUrlConnection输出，因为这个是post请求，参数要放在 http正文内，因此需要设为true, 默认情况下是false;
			conn.setDoOutput(true);

			// 设置是否从httpUrlConnection读入，默认情况下是true;
			conn.setDoInput(true);

			// Post 请求不能使用缓存
			conn.setUseCaches(false);

			// 设定传送的内容类型是可序列化的java对象 (如果不设此项,在传送序列化对象时,当WEB服务默认的不是这种类型时可能抛java.io.EOFException)
			conn.setRequestProperty("Content-type", "application/x-java-serialized-object");

			// 设定请求的方法为"POST"，默认是GET
			conn.setRequestMethod("POST");

			// 连接，从上述第2条中url.openConnection()至此的配置必须要在connect之前完成，
			conn.connect();
			
			// 此处getOutputStream会隐含的进行connect(即：如同调用上面的connect()方法，   
			// 所以在开发中不调用上述的connect()也可以)。   
			OutputStream outStrm = conn.getOutputStream(); 
			
			// 现在通过输出流对象构建对象输出流对象，以实现输出可序列化的对象。   
			ObjectOutputStream objOutputStrm = new ObjectOutputStream(outStrm);   
			  
			// 向对象输出流写出数据，这些数据将存到内存缓冲区中   
			objOutputStrm.writeObject(new String("我是测试数据"));   
			 
			// 刷新对象输出流，将任何字节都写入潜在的流中（些处为ObjectOutputStream）   
			objOutputStrm.flush();   
			 
			// 关闭流对象。此时，不能再向对象输出流写入任何数据，先前写入的数据存在于内存缓冲区中,   
			// 在调用下边的getInputStream()函数时才把准备好的http请求正式发送到服务器   
			objOutputStrm.close();   
			   
			// 调用HttpURLConnection连接对象的getInputStream()函数,   
			// 将内存缓冲区中封装好的完整的HTTP请求电文发送到服务端。   
			InputStream urlStream = conn.getInputStream(); // <===注意，实际发送请求的代码段就在这里   
			
			// 上边的conn.getInputStream()方法已调用,本次HTTP请求已结束,下边向对象输出流的输出已无意义，   
			// 既使对象输出流没有调用close()方法，下边的操作也不会向对象输出流写入任何数据.   
			// 因此，要重新发送数据时需要重新创建连接、重新设参数、重新创建流对象、重新写数据、   
			// 重新发送数据(至于是否不用重新这些操作需要再研究)   
            BufferedReader reader = new BufferedReader(new InputStreamReader(urlStream));  
            String s = "";  
            while ((s = reader.readLine()) != null) {  
            	responseString += s;  
            }  
            reader.close();  
            urlStream.close();  
            conn.disconnect();
		} catch (Exception e) {
			LOG.error("HttpURlConnection接口调用异常：{}",e);
		}
		return responseString;
	}

	public static String doPostSoap(String url, String parameters, String retMethod) throws Exception {
		String responseString = "";
		URL u = new URL(url);
		URLConnection conn = u.openConnection();
		conn.setDoOutput(true);
		conn.setRequestProperty("Content-Type", "application/soap+xml; charset=utf-8");
		PrintWriter pw = new PrintWriter(conn.getOutputStream());
		pw.println(parameters);
		pw.close();
		DocumentBuilderFactory bf = DocumentBuilderFactory.newInstance();
		DocumentBuilder db = bf.newDocumentBuilder();
		Document document = db.parse(conn.getInputStream());
		responseString = document.getElementsByTagName(retMethod).item(0).getTextContent();
		return responseString;

	}
	
	public String test(String url, String param) {
		String responseString = "";
		BufferedReader in = null;
		try {
			String urlName = url + "?" + param;
			URL u = new URL(urlName);
			// 打开和URL之间的连接
			URLConnection conn = u.openConnection();
			// 设置通用的请求属性
			conn.setRequestProperty("accept", "*/*");
			conn.setRequestProperty("connection", "Keep-Alive");
			conn.setRequestProperty("user-agent", "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1; SV1)");
			// 建立实际的连接
			conn.connect();
			if (LOG.isDebugEnabled()) {
				// 获取所有响应头字段
				Map<String, List<String>> map = conn.getHeaderFields();
				// 遍历所有的响应头字段
				for (String key : map.keySet()) {
					LOG.debug("key:[{}-{}]",key,map.get(key));
				}
			}
			// 定义BufferedReader输入流来读取URL的响应
			in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
			String line;
			while ((line = in.readLine()) != null) {
				responseString += line;
			}
		} catch (Exception e) {
			LOG.error("webservices接口调用异常:{}", e);
		}
		// 使用finally块来关闭输入流
		finally {
			try {
				if (in != null) {
					in.close();
				}
			} catch (IOException ex) {
				LOG.error("webservices接口关闭异常:{}", ex);
			}
		}
		return responseString;
	}
	public static void main(String[] args) {
		String url = "http://127.0.0.1:9080/x_test_soap/soap/test?page=1&numberperpage=10";
		long a = System.currentTimeMillis();  
		userHttpURlConnection(url);
        long b = System.currentTimeMillis();  
        System.out.println("use httpurlconnection: "+(b-a)); 
        long c = System.currentTimeMillis();  
        System.out.println(useHttpClient_get(url));  
        long d = System.currentTimeMillis();  
        System.out.println("use httpclient: "+(d-c)); 
	}
}

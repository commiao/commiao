package com.framework.common.sms;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

/**
 * 提供短信（各个短信提供商）发送类
 * add by 郑金平（2015-12-23）
 *
 */
public class SMSSender {
	Logger logger = LoggerFactory.getLogger(SMSSender.class);
	
	// 短信接口地址
	private String postUrl;
	// 短信接口 短信抬头内容
	private String key;
	// 短信接口 后缀信息
	private String tail="";

	private String userid;// 企业id
	private String account; // 提交账户
	private String password; // 提交账户的密码
	private String mobile; // 全部被叫号码,多个号码之间用半角逗号隔开
	private String content; // 发送内容
	private String sendTime="";// 发送时间，为空时立即发送
	private String action = "send";// 固定值
	private String extno = "";// 扩展码(非必填项)
	
	/**
	 * 把共同的部分信息通过类的构造方法注入进去，其他的可通过属性的set方法给注入进去
	 * add by 郑金平（2015-12-24）
	 * @param postUrl
	 * @param account
	 * @param password  看各个短信通道密码的需要，有的短信通道只需密码明码，有的短信通道密码需要MD5加密
	 */
	public SMSSender(String postUrl, String account, String password) {
		this.postUrl = postUrl;
		this.account = account;
		this.password = password;
	}

	/**
	 * 短信通道  发送短信之前的初始化
	 * @param key  短信标识码（企信通）必须的要
	 * @param userId 账户用户id，和信通必须要
	 * @param sendTime 短信发送时间
	 * @param extno 短信扩展码
	 * @param tail 短信接口 后缀信息
	 */
	public void send_before(String key,String userId,String sendTime,String extno,String tail) {
		//短信  标识码的设置
		if(null!=key && !"".equals(key)) {
			this.key="【"+key+"】";
		}
		//短信通道用户id
		if(null!=userId && !"".equals(userId)) {
			this.userid = userId;
		}
		//短信发送时间的设置
		if(null!=sendTime && !"".equals(sendTime)) {
			setSendTime(sendTime);
		}
		//短信扩展码的设置
		if(null!=extno && !"".equals(extno)) {
			setExtno(extno);
		}
		if(null!=tail && !"".equals(tail)) {
			setTail(tail);
		}
	}
	
	/**
	 * 新农金融使用的短信通道（和信通）
	 * @param phoneNum
	 * @param msg
	 * @return
	 */
	public int send_hxt(String phoneNum, String msg) {
		logger.info("执行（和信通）短信发送服务SMSSender，其电话号码[{}],其短信内容[{}],其key值[{}]",phoneNum,msg,key);
		try {
			StringBuilder postData = new StringBuilder();
			content = java.net.URLEncoder.encode(msg+tail, "UTF-8");
			mobile = phoneNum;
			postData.append("action").append("=").append(action).append("&");
			postData.append("userid").append("=").append(userid).append("&");
			postData.append("account").append("=").append(account).append("&");
			postData.append("password").append("=").append(password).append("&");
			postData.append("mobile").append("=").append(mobile).append("&");
			postData.append("content").append("=").append(content).append("&");
			postData.append("sendTime").append("=").append(sendTime).append("&");
			postData.append("extno").append("=").append(extno);
			logger.info("执行短信发送服务，其未转UTF8的发送内容[{}],其key值[{}]",msg,key);
			return send(postData.toString());
		} catch (Exception x) {
			logger.error("发送短信时发生异常", x);
			return -1;
		}
	}
		
	/**
	 * 另一短信通道(企信通)
	 * add by 郑金平（2015-09-08）
	 * 
	 * @param phoneNum
	 * @param msg
	 * @return
	 */
	public int send_qxt(String phoneNum, String msg) {
		logger.info("执行（企信通）短信发送服务SMSSender，其电话号码[{}],其短信内容[{}],其key值[{}]",phoneNum,msg,key);
		try {
			StringBuilder postData = new StringBuilder();
			content = java.net.URLEncoder.encode(key+msg+tail, "GBK");
			logger.info("短信发送服务过程中，发送内容经GBK转码后，key也在其前，内容为[{}]",content);
			mobile = phoneNum;
			postData.append(postUrl).append("?");
			postData.append("username").append("=").append(account).append("&");
			postData.append("passwordMd5").append("=").append(password).append("&");
			postData.append("mobile").append("=").append(mobile).append("&");
			postData.append("message").append("=").append(content).append("&");
			postData.append("Ext").append("=").append(extno);
			return getReturnData(postData.toString());
		} catch (Exception x) {
			logger.error("发送短信时发生异常", x);
			return -1;
		}
	}
	
	/**
	 * 和信通的发送请求
	 * @param postData
	 * @return
	 * @throws UnsupportedEncodingException
	 * @throws IOException
	 * @throws ParserConfigurationException
	 * @throws SAXException
	 */
	private int send(String postData) throws UnsupportedEncodingException,IOException, ParserConfigurationException, 
	SAXException {
		logger.info("请求短信接口内容[{}]", postData);
		HttpURLConnection conn = null;
		try {
			final URL url = new URL(postUrl);
			conn = (HttpURLConnection) url.openConnection();
			conn.setRequestMethod("POST");
			conn.setRequestProperty("Content-Type","application/x-www-form-urlencoded");
			conn.setRequestProperty("Connection", "Keep-Alive");
			conn.setUseCaches(false);
			conn.setDoOutput(true);
		
			conn.setRequestProperty("Content-Length", "" + postData.length());
			final OutputStreamWriter out = new OutputStreamWriter(conn.getOutputStream(), "UTF-8");
			out.write(postData);
			out.flush();
			out.close();
		
			// 获取响应状态
			if (conn.getResponseCode() != HttpURLConnection.HTTP_OK) {
				logger.error("连接短信服务器失败");
				return -1;
			}
		
			InputStream is = conn.getInputStream();
			int resultCode = parseResultCode(is);
			is.close();
		
			return resultCode;
		} finally {
			if (conn != null) {
				conn.disconnect();
			}
		}
	}
	
	/**
	 * 和信通短信返回值的xml转换
	 * @param is
	 * @return
	 * @throws ParserConfigurationException
	 * @throws SAXException
	 * @throws IOException
	 */
	private int parseResultCode(InputStream is)
			throws ParserConfigurationException, SAXException, IOException {
		final Map<String, String> map = new HashMap<String, String>();
		SAXParser saxParser = SAXParserFactory.newInstance().newSAXParser();
		saxParser.parse(is, new DefaultHandler() {

			private String tag = "";

			public void endElement(String uri, String localName, String qName)
					throws SAXException {
				tag = "";
			}

			public void startElement(String uri, String localName,String qName, Attributes attributes) throws SAXException {
				tag = qName;
			}

			public void characters(char[] ch, int start, int length)
					throws SAXException {
				if (!tag.isEmpty()) {
					map.put(tag, new String(ch, start, length));
				}
			}

		});
		final String result = map.get("returnstatus");
		logger.info("短信接口返回码[{}]描述[{}]", result, map.get("message"));
		int resultCode = 0;
		if ("Success".equals(result)) {
			resultCode = 0;
		} else {
			resultCode = 1;
		}
		return resultCode;
	}
	
	/**
	 * 企信通短信通道发送的返回码
	 * @param urlString
	 * @return
	 * @throws MalformedURLException
	 */
	protected final int getReturnData(final String urlString) throws MalformedURLException {
		logger.info("短信发送的链接内容:[{}]",urlString);
		URL url = new URL(urlString);
		HttpURLConnection connection = null;
		int name = 0;
		try {
			connection = (HttpURLConnection) url.openConnection();
			final BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));

			String line;
			final StringBuffer stringBuffer = new StringBuffer(255);

			synchronized (stringBuffer) {
				while ((line = in.readLine()) != null) {
					stringBuffer.append(line);
				}
			}
			Object obj = stringBuffer.toString();
			name = Integer.valueOf(obj.toString());
			/**
			 * >0	成功，短信批次号
			-1	账号或者密码错误
			-2	缺少企业账号
			-3	缺少密码
			-4	缺少短信内容
			-5	缺少目标号码
			-7	短信内容过长(小灵通最大56个字)
			-8	含有非法字符，第二行返回非法关键词
			-9	目标号码格式错误，或者包含错误的手机号码
			-10	超过规定发送时间，禁止提交发送
			-12	余额不足
			-14	号码超过发送数量限制
			-15	发送内容前面需加签名，例如【XXX公司】，签名必须放在最前面，如果内容的编码错误，出现乱码，识别不出签名【XXX公司】，也会返回-15
			-16	提交号码数量小于最小提交量限制
			-20	未开通接口
			-22	短信内容签名不正确
			-99	连接失败
			-100	系统内部错误
			 */
			String resultStr = "";
			if(name>0) {
				resultStr = "短信发送成功,其返回值是短信批次号！";
			}else if(name==0) {
				resultStr = "没有返回值！";
			}else {
				if(name==-1) {
					resultStr = "账号或者密码错误";
				}else if(name==-2) {
					resultStr = "缺少企业账号";
				}else if(name==-3) {
					resultStr = "缺少密码";
				}else if(name==-4) {
					resultStr = "缺少短信内容";
				}else if(name==-5) {
					resultStr = "缺少目标号码";
				}else if(name==-7) {
					resultStr = "短信内容过长(小灵通最大56个字)";
				}else if(name==-8) {
					resultStr = "含有非法字符，第二行返回非法关键词";
				}else if(name==-9) {
					resultStr = "目标号码格式错误，或者包含错误的手机号码";
				}else if(name==-10) {
					resultStr = "超过规定发送时间，禁止提交发送";
				}else if(name==-12) {
					resultStr = "余额不足";
				}else if(name==-14) {
					resultStr = "号码超过发送数量限制";				
				}else if(name==-15) {
					resultStr = "发送内容前面需加签名，例如【XXX公司】";
				}else if(name==-16) {
					resultStr = "提交号码数量小于最小提交量限制";
				}else if(name==-20) {
					resultStr = "未开通接口";
				}else if(name==-22) {
					resultStr = "短信内容签名不正确";
				}else if(name==-99) {
					resultStr = "连接失败";
				}else if(name==-100) {
					resultStr = "系统内部错误";
				}	
			}
			logger.info("返回值是[{}],其返回值的意义是[{}]",name,resultStr);
		} catch (final IOException e) {
			e.printStackTrace();
		} catch (final Exception e1) {
			e1.printStackTrace();
		} finally {
			if (connection != null) {
				connection.disconnect();
			}
		}
		return name;
	}
	
	/**
	 * 获取短信的关键字
	 * @return
	 */
	public String getKey() {
		return key;
	}

	/**
	 * 设置短信的关键字
	 * @param key
	 */
	public void setKey(String key) {
		this.key = key;
	}

	/**
	 * 获取短信后置的后缀信息
	 * @return
	 */
	public String getTail() {
		return tail;
	}

	/**
	 * 设置短信后置的后缀信息
	 * @param tail
	 */
	public void setTail(String tail) {
		this.tail = tail;
	}

	/**
	 * 获取用户id
	 * @return
	 */
	public String getUserid() {
		return userid;
	}

	/**
	 * 设置用户id
	 * @param userid
	 */
	public void setUserid(String userid) {
		this.userid = userid;
	}

	/**
	 * 获取短信发送时间
	 * @return
	 */
	public String getSendTime() {
		return sendTime;
	}

	/**
	 * 设置短信发送时间
	 * @param sendTime
	 */
	public void setSendTime(String sendTime) {
		this.sendTime = sendTime;
	}

	/**
	 * 获取短信的扩展码
	 * @return
	 */
	public String getExtno() {
		return extno;
	}

	/**
	 * 设置短信的扩展码
	 * @param extno
	 */
	public void setExtno(String extno) {
		this.extno = extno;
	}
}

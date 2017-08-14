package com.framework.common.encrypt;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.Key;
import java.security.SecureRandom;

import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.DESedeKeySpec;
import javax.crypto.spec.IvParameterSpec;

import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

@SuppressWarnings("restriction")
public class DESHelper {
	/**
	 * 密钥，长度必须是8的倍数(有向量的要24位)
	 */
	private final static String desKey = "ICHuQplJ0YR9l7XeVNKi6FMn";
	/**
	 * 向量，CBC模式，需要一个向量iv，可增加加密算法的强度
	 */
	private final static String desIv="2EDxsEfp";
	/**
	 * base64算法进行加密（默认的3DES加密方法）
	 * @param str 需要加密的字符串
	 * @return base64加密后的结果
	 */
	public static String Base64Encode(String str) {
		BASE64Encoder encoder = new BASE64Encoder();
		return encoder.encode(str.getBytes());
	}
	/**
	 * 用base64算法进行解密（默认的3DES加密方法）
	 * @param str 需要解密的字符串
	 * @return base64解密后的结果
	 * @throws IOException
	 */
	public static String Base64decode(String str) throws IOException {
		BASE64Decoder encoder = new BASE64Decoder();
		return new String(encoder.decodeBuffer(str));
	}
	
	/**
	 * 3DES 无向量加密
	 * @param input
	 * @return
	 */
	public static String DESEncode(String input){
		try {
			return byte2hex(DESEncode(input.getBytes("UTF-8"),desKey.getBytes("UTF-8")));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	/**
	 * 3DES 无向量加密
	 * @param str 数据源
	 * @param passwordKey 密钥，长度必须是8的倍数
	 * @return 返回加密后的数据
	 */
	public final static String DESEncode(String str, String passwordKey) {
		try {
			return byte2hex(DESEncode(str.getBytes("UTF-8"), passwordKey.getBytes("UTF-8")));
		} catch (Exception e) { }
		return null;
	}
	
	/**
	 * 3DES 加密
	 * @param src 数据源
	 * @param key 密钥，长度必须是8的倍数
	 * @return 返回加密后的数据
	 * @throws Exception
	 */
	public static byte[] DESEncode(byte[] src, byte[] key) throws Exception {
		// DES算法要求有一个可信任的随机数源
		SecureRandom sr = new SecureRandom();
		// 从原始密匙数据创建DESKeySpec对象
		DESKeySpec dks = new DESKeySpec(key);
		// 创建一个密匙工厂，然后用它把DESKeySpec转换成
		// 一个SecretKey对象
		SecretKeyFactory keyFactory = SecretKeyFactory.getInstance("DES");
		SecretKey securekey = keyFactory.generateSecret(dks);
		// Cipher对象实际完成加密操作
		Cipher cipher = Cipher.getInstance("DES");
		// 用密匙初始化Cipher对象
		cipher.init(Cipher.ENCRYPT_MODE, securekey, sr);
		// 现在，获取数据并加密
		// 正式执行加密操作
		return cipher.doFinal(src);
	}
	
	private static String byte2hex(byte[] b) {
		String hs = "";
		String stmp = "";
		for (int n = 0; n < b.length; n++) {
			stmp = (java.lang.Integer.toHexString(b[n] & 0XFF));
			if (stmp.length() == 1)
				hs = hs + "0" + stmp;
			else
				hs = hs + stmp;
		}
		return hs.toUpperCase();
	}
	
	/**
	 * 3DES 无向量解密
	 * @param data
	 * @return
	 * @throws Exception
	 */
	public final static String DESDecode(String str) {
		return DESDecode(str, desKey);
	}

	/**
	 * 3DES 无向量解密
	 * @param data
	 * @return
	 * @throws Exception
	 */
	public final static String DESDecode(String str, String passwd) {
		try {
			return new String(DESDecode(hex2byte(str.getBytes("UTF-8")), passwd.getBytes("UTF-8")));
		} catch (Exception e) { }
		return null;
	}
	
	/**
	 * 3DES 无向量解密
	 * @param src 数据源
	 * @param key 密钥，长度必须是8的倍数
	 * @return 返回解密后的原始数据
	 * @throws Exception
	 */
	public static byte[] DESDecode(byte[] src, byte[] key) throws Exception {
		// DES算法要求有一个可信任的随机数源
		SecureRandom sr = new SecureRandom();
		// 从原始密匙数据创建一个DESKeySpec对象
		DESKeySpec dks = new DESKeySpec(key);
		// 创建一个密匙工厂，然后用它把DESKeySpec对象转换成
		// 一个SecretKey对象
		SecretKeyFactory keyFactory = SecretKeyFactory.getInstance("DES");
		SecretKey securekey = keyFactory.generateSecret(dks);
		// Cipher对象实际完成解密操作
		Cipher cipher = Cipher.getInstance("DES");
		// 用密匙初始化Cipher对象
		cipher.init(Cipher.DECRYPT_MODE, securekey, sr);
		// 现在，获取数据并解密
		// 正式执行解密操作
		return cipher.doFinal(src);
	}
	
	private static byte[] hex2byte(byte[] b) {
		if ((b.length % 2) != 0) throw new IllegalArgumentException("长度不是偶数");
		byte[] b2 = new byte[b.length / 2];
		for (int n = 0; n < b.length; n += 2) {
			String item = new String(b, n, 2);
			b2[n / 2] = (byte) Integer.parseInt(item, 16);
		}
		return b2;
	}
	
	/**
	 * 3DES 有向量 加密
	 * @param str
	 * @return
	 * @throws Exception 
	 * @throws UnsupportedEncodingException 
	 */
	public final static String DesEncrypt(String str) throws UnsupportedEncodingException, Exception{
		return DesEncrypt(str, desKey, desIv);
	}
	
	public static String DesEncrypt(String input, String desKey, String desIv) throws UnsupportedEncodingException, Exception{
		// 转换为二进制编码格式
		return new BASE64Encoder().encode(DesEncrypt(input.getBytes("UTF-8"), desKey.getBytes("UTF-8"), desIv.getBytes("UTF-8")));
	}
	
	/**
	 * 3DES 有向量 加密
	 * @param input
	 * @param desKey 密钥
	 * @param desIv 向量
	 * @return
	 */
	public static byte[] DesEncrypt(byte[] input, byte[] desKey, byte[] desIv) throws Exception{
		// DES算法要求有一个可信任的随机数源
		SecureRandom sr = new SecureRandom();
		// 从原始密匙数据创建一个DESKeySpec对象
		DESedeKeySpec dks = new DESedeKeySpec(desKey);
		// 创建一个密匙工厂，然后用它把DESKeySpec对象转换成
		// 一个SecretKey对象
		SecretKeyFactory keyFactory = SecretKeyFactory.getInstance("DESede");
		Key key = keyFactory.generateSecret(dks);
		IvParameterSpec iv = new IvParameterSpec(desIv);
		// Cipher对象实际完成解密操作
		Cipher cipher = Cipher.getInstance("DESede/CBC/PKCS5Padding");
		// 用密匙初始化Cipher对象
		cipher.init(Cipher.ENCRYPT_MODE, key, iv, sr);
		// 现在，获取数据并加密
		// 正式执行加密操作
		byte[] array = cipher.doFinal(input);
		return array;
	}
	
	/**
	 * 3DES 有向量 解密
	 * @param str
	 * @return
	 * @throws Exception 
	 * @throws UnsupportedEncodingException 
	 */
	public static String DesDecrypt(String str) throws UnsupportedEncodingException, Exception{
		return DesDecrypt(str, desKey, desIv);
	}
	
	public static String DesDecrypt(String input,String desKey, String desIv) throws UnsupportedEncodingException, Exception{
		return new String(DesDecrypt(input, desKey.getBytes("UTF-8"), desIv.getBytes("UTF-8")), "UTF-8");
	}

	/**
	 * 3DES 有向量 解密
	 * @param input
	 * @param desKey
	 * @param desIv
	 * @return
	 */
	public static byte[] DesDecrypt(String input, byte[] desKey, byte[] desIv) throws Exception{
		// DES算法要求有一个可信任的随机数源
		SecureRandom sr = new SecureRandom();
		// 从原始密匙数据创建一个DESKeySpec对象
		DESedeKeySpec dks = new DESedeKeySpec(desKey);
		// 创建一个密匙工厂，然后用它把DESKeySpec对象转换成
		// 一个SecretKey对象
		SecretKeyFactory keyFactory = SecretKeyFactory.getInstance("DESede");
		SecretKey key = keyFactory.generateSecret(dks);
		IvParameterSpec iv = new IvParameterSpec(desIv);
		// Cipher对象实际完成解密操作
		Cipher cipher = Cipher.getInstance("DESede/CBC/PKCS5Padding");
		// 用密匙初始化Cipher对象
		cipher.init(Cipher.DECRYPT_MODE, key, iv, sr);
		// 现在，获取数据并解密
		// 正式执行解密操作
		byte[] array = cipher.doFinal(new BASE64Decoder().decodeBuffer(input));
		return array;
	}
	
}

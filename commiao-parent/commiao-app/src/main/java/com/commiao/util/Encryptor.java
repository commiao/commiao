package com.commiao.util;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * Encryptor, 用于加密字符串.
 * @author nzt
 */
public class Encryptor {
	public static void main(String[] args) {
		System.out.println(Encryptor.getMD5String("666666"));
	}

    /**
     * 生成MD5加密.
     * @param str
     *        :需要进行md5hash的字符串
     * @return :经过md5hash后的字符串
     */
    public static String getMD5String(final String str) {
        String resp;
        if (null == str || "".equals(str.trim())) {
            resp = null;
        } else {
            try {
                final byte[] res = str.getBytes("UTF-8");
                final MessageDigest md = MessageDigest.getInstance("MD5");
                // MessageDigest md =
                // MessageDigest.getInstance("MD5".toUpperCase());
                final byte[] result = md.digest(res);
                for (int i = 0; i < result.length; i++) {
                    md.update(result[i]);
                }
                final byte[] hash = md.digest();
                final StringBuilder d = new StringBuilder();
                for (int i = 0; i < hash.length; i++) {
                    final int v = hash[i] & 0xFF;
                    if (v < 16) {
                        d.append("0");
                    }
                    d.append(Integer.toString(v, 16) + "");
                    // d.append(Integer.toString(v, 16).toUpperCase() + "");
                }
                resp = d.toString();

            } catch (final UnsupportedEncodingException e) {
                resp = null;
            } catch (final NoSuchAlgorithmException e) {
                resp = null;
            }
        }
        return resp;
    }

}

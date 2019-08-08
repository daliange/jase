package com.lijie.java.gzip;


import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Base64;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;


public class Gzip {
	public static final String GZIP_ENCODE_UTF_8 = "UTF-8";

	public static byte[] compress(String str, String encoding) {
		if (str == null || str.length() == 0) {
			return null;
		}
		ByteArrayOutputStream out = new ByteArrayOutputStream();
		GZIPOutputStream gzip;
		try {
			gzip = new GZIPOutputStream(out);
			gzip.write(str.getBytes(encoding));
			gzip.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return out.toByteArray();
	}

	public static byte[] compress(String str) throws IOException {
		return compress(str, GZIP_ENCODE_UTF_8);
	}

	public static byte[] uncompress(byte[] bytes) {
		if (bytes == null || bytes.length == 0) {
			return null;
		}
		ByteArrayOutputStream out = new ByteArrayOutputStream();
		ByteArrayInputStream in = new ByteArrayInputStream(bytes);
		try {
			GZIPInputStream ungzip = new GZIPInputStream(in);
			byte[] buffer = new byte[256];
			int n;
			while ((n = ungzip.read(buffer)) >= 0) {
				out.write(buffer, 0, n);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return out.toByteArray();
	}

	public static String uncompressToString(byte[] bytes, String encoding) {
		if (bytes == null || bytes.length == 0) {
			return null;
		}
		ByteArrayOutputStream out = new ByteArrayOutputStream();
		ByteArrayInputStream in = new ByteArrayInputStream(bytes);
		try {
			GZIPInputStream ungzip = new GZIPInputStream(in);
			byte[] buffer = new byte[256];
			int n;
			while ((n = ungzip.read(buffer)) >= 0) {
				out.write(buffer, 0, n);
			}
			return out.toString(encoding);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	public static String uncompressToString(byte[] bytes) {
		return uncompressToString(bytes, GZIP_ENCODE_UTF_8);
	}

	public static void main(String[] args) throws IOException {
		String jsonStr = "{\"version\":\"1.0\",\"commitTime\":\"20071117020101\",\"coName\":\"杉德支付网络服务发展有限公司\",\"coCode\":\"310496099G\",\"serialNumber\":\"20119182839304\",\"token\":\"DvEwuUArQvwvczsftrpVDxbnWCBkAMGA\"}";
		String after = compress(jsonStr).toString();
		System.out.println("压缩后：：" + after);
		String begin = uncompressToString(compress(jsonStr));
		System.out.println("解压字符串后：：" + begin);
		final Base64.Encoder encoder = Base64.getEncoder();
		// 编码
		final String encodedText = encoder.encodeToString(compress(jsonStr));
		System.out.println("编码::" + encodedText);

	}
}
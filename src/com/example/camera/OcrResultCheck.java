package com.example.camera;

import java.io.UnsupportedEncodingException;

public class OcrResultCheck {

	public static String ocrFiltration(String ocrString)
			throws UnsupportedEncodingException {
		byte[] byteStr = new byte[30];
		int j = 0;
		
		byte[] bytes = ocrString.getBytes();
		for (int i = 0; i < bytes.length; i++) {

			if (bytes[i] > 47 && bytes[i] < 58) {
				j++;
				byteStr[j] = bytes[i];
			}
		}
		String getStr = new String(byteStr, "UTF-8");
		return getStr.trim();
	}
	
}

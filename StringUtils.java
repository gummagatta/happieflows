package com.infinite.leetcode;

import java.util.Arrays;

public class StringUtils {

	public static boolean isEmpty(String s) {
		return s == null || s.trim().length() == 0;
	}

	public static String reverse(String s) {
		char[] arr = s.toCharArray();
		int len = arr.length;
		for (int i = 0; i < len / 2; i++) {
			char ch = arr[len - 1 - i];
			arr[len - 1 - i] = arr[i];
			arr[i] = ch;
		}
		return new String(arr);
	}
	
	public static String leftTrim(String s) {
		char[] arr = s.toCharArray();
		int len=arr.length;
		int i=0;
		while ((i < len) && ((arr[i] & 0xff) <= ' ')) {
            i++;
        }
		return new String(Arrays.copyOfRange(arr,i,len));
	}
	
	public static String rightTrim(String s) {
		char[] arr = s.toCharArray();
		int len = arr.length;
		while ((0 < len) && ((arr[len - 1] & 0xff) <= ' ')) {
			len--;
		}
		return new String(Arrays.copyOfRange(arr, 0, len));
	}

	public static String maxOccurance(String s) {
		char[] arr = s.toCharArray();
		int[][] maxCountArr = new int[10][256];
		for (int i = 0; i < arr.length; i++) {
			int ascivalue = arr[i];
			System.out.println(arr[i] + "==>" + ascivalue);
		}
		return new String(arr);
	}
}

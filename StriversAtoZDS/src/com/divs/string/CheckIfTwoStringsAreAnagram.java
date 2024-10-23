package com.divs.string;

import java.util.Arrays;

public class CheckIfTwoStringsAreAnagram {

	public static void main(String[] args) {
	String str1="CAT";
	String str2="TCCA";
	if(checkAnagram(str1,str2)) {
		System.err.println("anagram");
	}else {
		System.err.println("Not anagram");
	}
	
	}
	public static boolean checkAnagram(String str1, String str2) {
		if(str1.length()!=str2.length()) {
			return false;
		}
		str1=sort(str1);
		str2=sort(str2);
		System.out.println(str1);
		System.out.println(str2);
		for(int i=0;i<str1.length();i++) {
			if(str1.charAt(i)!=str2.charAt(i)) {
				return false;
			}
		}
		return true;

	}
	private static String sort(String str) {
		char[] c=str.toCharArray();
		Arrays.sort(c);
		return new String(c);
		
	}		

}

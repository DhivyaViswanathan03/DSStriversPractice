package com.divs.string;

public class LargestOddNumberInString {

	public static void main(String[] args) {
//		String str="52";
		String str="4206";
		System.out.println(findLongestOddNum(str));
		
		
	}

	private static String findLongestOddNum(String str) {
		for(int i=str.length()-1;i>=0;i--) {
			int num=Integer.parseInt(String.valueOf(str.charAt(i)));
			if(num%2!=0) {
				return str.substring(0,i+1);
			}
		}	
		return "";
	}

}

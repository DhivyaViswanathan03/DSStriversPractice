package com.divs.recursion;

public class PalindromeCheck {

	public static void main(String[] args) {
		String s="MADSAM";
		if(checkPalindrome(0,s)) {
			System.out.println("Palindrome");
		}else {
			System.out.println("Not Palindrome");
		}

	}

	private static boolean checkPalindrome(int i, String str) {
		if(i>=str.length()-i-1)
			return true;
		if(str.charAt(i)!=str.charAt(str.length()-i-1))
			return false;
		return checkPalindrome(i+1,str);
		
	}

}

package com.divs.maths;

public class CountDigits {

	public static void main(String[] args) {
		int result=digitCount(3);
		System.out.println(result);

	}

	private static int digitCount(int n) {
		int count=0;
		while(n>0) {
			count++;
			n=n/10;
		}
		return count;
	}

}

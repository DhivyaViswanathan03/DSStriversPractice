package com.divs.maths;

public class ReverseDigits {

	public static void main(String[] args) {
int result=reverseDigits(7789900);
System.out.println(result);
	}

	private static int reverseDigits(int n) {
		int revNum=0;
		while(n>0) {
			int lastDigit=n%10;
			revNum=(revNum*10)+lastDigit;
			n=n/10;
		}
		return revNum;
	}

}

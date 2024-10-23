package com.divs.maths;

public class ArmstrongNumber {

	public static void main(String[] args) {
		isArmstrongNumber(120);

	}

	private static void isArmstrongNumber(int num) {
		int dup=num;
		int sum=0;
		int length=Integer.toString(num).length();
		while(num>0) {
			int rem=num%10;
			sum=sum+(int)Math.pow(rem, length);
			num=num/10;
		}
		if(dup==sum)
			System.out.println("Armstrong Number");
		else
			System.out.println("Not Armstrong");
		
	}

}

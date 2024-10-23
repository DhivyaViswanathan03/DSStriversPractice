package com.divs.maths;

public class GCD {

	public static void main(String[] args) {
		int n1=36,n2=42;
		while(n1>0 && n2>0) {
			if(n1>n2) {
				n1=n1%n2;	
			}
			else {
				n2=n2%n1;
			}
		}if(n1==0)
			System.out.println("GCD is:"+n2);
		else
			System.out.println("GCD is:"+n1);

	}

}

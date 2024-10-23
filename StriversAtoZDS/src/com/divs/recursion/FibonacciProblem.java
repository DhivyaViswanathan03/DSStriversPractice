package com.divs.recursion;

public class FibonacciProblem {

	public static void main(String[] args) {
//		int f[]=new int[10];
//		f[0]=0;
//		f[1]=1;
//		for(int i=2;i<10;i++) {
//			f[i]=f[i-1]+f[i-2];
//		}
//		for(int r:f) {
//			System.out.println(r);
//		}
		for(int i=0;i<10;i++) {
			System.out.println(fibonacci(i));
		}
		

	}

	private static int fibonacci(int i) {
		if(i<=1)
			return i;
		int last=fibonacci(i-1);
		int sLast=fibonacci(i-2);
		return last+sLast;
	}

}

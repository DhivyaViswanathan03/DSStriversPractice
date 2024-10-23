package com.divs.recursion;

public class PrintNto1Backtracking {

	public static void main(String[] args) {
		print(1,10);

	}

	private static void print(int i, int j) {
		if(i>j)
			return;
		print(i+1,j);
		System.out.println(i);
	}

}

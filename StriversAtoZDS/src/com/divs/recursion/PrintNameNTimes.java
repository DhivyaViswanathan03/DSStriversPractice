package com.divs.recursion;

public class PrintNameNTimes {

	public static void main(String[] args) {
		printNames(1,3);

	}

	private static void printNames(int i, int j) {
		if(i>j) {
			return;
		}
		System.out.println("divs");
		printNames(i+1, j);
	}

}

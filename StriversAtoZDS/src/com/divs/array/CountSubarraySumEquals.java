package com.divs.array;

public class CountSubarraySumEquals {

	public static void main(String[] args) {
		int[] arr= {1,2,3,-3,1,1,1,4,2,-3};
		int sum=3;
//		 int[] arr = {3, 1, 2, 4};
//	        int sum = 6;
		int counter=0;
		for(int i=0;i<arr.length;i++) {
			int max=0;
			for(int j=i;j<arr.length;j++) {
				max=max+arr[j];
				if(max==sum) {
					counter=counter+1;
				}
			}
		}
		System.out.println(counter);

	}

}

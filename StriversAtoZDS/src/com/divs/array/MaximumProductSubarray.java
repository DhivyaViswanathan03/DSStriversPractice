package com.divs.array;

public class MaximumProductSubarray {

	public static void main(String[] args) {
		int arr[]= {2,3,-2,4,8};
		int max=1;
		for(int i=0;i<arr.length;i++) {
			int sum=1;
			for(int j=i;j<arr.length;j++) {
				sum=sum*arr[j];
				max=Math.max(max, sum);
			}
		}
		System.out.println(max);

	}

}

package com.divs.array;

public class MaximumSubarraySum {

	public static void main(String[] args) {
		 int[] arr = { -2, 1, -3, 4, -1, 2, 1, -5, 4};
		 int n=arr.length;
		
		 int max=0;
		 for(int i=0;i<n;i++) {
			 int sum=0;
			 for(int j=i;j<n;j++) {
				 
//				 for(int k=i;k<=j;k++) {
					 sum=sum+arr[j];
//				 }
				 max=Math.max(max, sum);
			 }
			 
		 }
		 System.out.println(max);

	}

}

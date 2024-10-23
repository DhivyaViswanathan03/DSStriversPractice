package com.divs.array;

public class LargestSubarrayWithZeroSum {

	public static void main(String[] args) {
int arr[]= {15,-2,2,-8,1,7,10,23};
//int arr[] = {9, -3, 3, -1, 6, -5};
int max=0;
  for(int i=0;i<arr.length;i++) {
	  int sum=0;
	for(int j=i;j<arr.length;j++) {
		sum=sum+arr[j];
		if(sum==0) {
			max=Math.max(max, j-i+1);
			findSubarray(arr,i,j+1);
		}
		
	}
}
  System.out.println(max);
	}

	private static void findSubarray(int[] arr, int start, int end) {
		for(int i=start;i<end;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}

}

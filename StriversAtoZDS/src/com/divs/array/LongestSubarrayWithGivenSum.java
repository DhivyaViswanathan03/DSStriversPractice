package com.divs.array;

public class LongestSubarrayWithGivenSum {

	public static void main(String[] args) {
//		int[] arr = {2, 3, 4, 1,1, 9};
		int[] arr = {-2, 3, 4, 1,1, -9};
		System.out.println(bruteForceApproach(arr));
		
        
	}

	private static int bruteForceApproach(int[] arr) {
		long k = 7;
        int length=0;
        for(int i=0;i<arr.length;i++) {
        	int sum=0;
        	for(int j=i;j<arr.length;j++) {
        		sum=sum+arr[j];
        		if(k==sum) {
        			length=findMaxLength(length,j-i+1);
        			findSubArray(arr,i,j);
        		}
        		
        	}
        }
        return length;
	}

	private static void findSubArray(int[] arr, int start, int end) {
		System.out.print("[");
		for(int i=start;i<end+1;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.print("]");
		System.out.println();
	}

	private static int findMaxLength(int length, int i) {
		if(length>i)
			return length;
		return i;
	}

}

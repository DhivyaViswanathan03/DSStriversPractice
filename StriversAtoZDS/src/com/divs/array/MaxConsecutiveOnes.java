package com.divs.array;

public class MaxConsecutiveOnes {

	public static void main(String[] args) {
		int arr[]= {1,1,1,1,0,1,1,0,1,1,1,1};
		int counter=0;
		int max=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==1) {
				counter++;
				max=max(max,counter);	
			}else {
				counter=0;
			}
		}
		System.out.println("Max consecutive ones :"+max);

	}

	private static int max(int max, int counter) {
		if(counter>max) {
			return counter;
		}
		return max;
	}

}

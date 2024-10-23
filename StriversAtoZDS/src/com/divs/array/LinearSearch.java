package com.divs.array;

public class LinearSearch {

	public static void main(String[] args) {
		int arr[]= {1,4,6,7,3,2};
		int num=7;
		int index=search(arr,num);
		if(index!=-1) {
			System.out.println("Number found at index: "+index);
		}else {
			System.out.println("Not found");
		}
		

	}

	private static int search(int[] arr, int num) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==num) {
				return i;
			}
		}
		return -1;
	}

}

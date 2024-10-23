package com.divs.array;

public class LargestEleInArray {

	public static void main(String[] args) {
		int arr[]= {10,30,15,70,25,90,5};
		int max=arr[0];
		for(int i=1;i<arr.length;i++) {
				if(arr[i]>max) {
					max=arr[i];
				}
		}
		System.out.println(max);

	}

}

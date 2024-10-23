package com.divs.sorting;

//Take element and place it in its correct position
public class InsertionSort {

	public static void main(String[] args) {
		int[] arr= {13,52,49,24,20,9};
		
		for(int i=0;i<arr.length;i++) {
			int j=i;
			while(j>0 && arr[j-1]>arr[j]) {
				int temp=arr[j];
				arr[j]=arr[j-1];
				arr[j-1]=temp;
				j--;
			}
		}
		for(int a:arr) {
			System.out.print(a+" ");
		}
	}

}

package com.divs.sorting;

//Select min and swap 
public class SelectionSort {

	public static void main(String[] args) {
		int[] arr= {13,52,49,24,20,9,1};
		int min;
		for(int i=0;i<arr.length-1;i++) {
			min=i;
			for(int j=i;j<arr.length;j++) {
				if(arr[j]<arr[min]) {
					min=j;
				}
			}
			int temp=arr[min];
			arr[min]=arr[i];
			arr[i]=temp;
		}
		
		for(int a:arr) {
			System.out.print(a+" ");
		}

	}

}

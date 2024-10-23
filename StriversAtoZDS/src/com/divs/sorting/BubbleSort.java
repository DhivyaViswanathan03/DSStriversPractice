package com.divs.sorting;

//Push max to the last by adjacent swap
public class BubbleSort {

	public static void main(String[] args) {
		int[] arr= {13,52,49,24,20,9,9};
		for(int i=arr.length-1;i>=1;i--) {
			int didSwap=0;
			for(int j=0;j<=i-1;j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					didSwap=1;
				}
			}
			if(didSwap==0) {
				break;
			}
		}
		for(int a:arr) {
			System.out.print(a+" ");
		}
	}

}

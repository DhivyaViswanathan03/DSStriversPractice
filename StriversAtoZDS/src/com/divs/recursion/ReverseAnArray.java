package com.divs.recursion;

public class ReverseAnArray {

	public static void main(String[] args) {
		int arr[]= {4,5,6,3,2,9};
		reverse(0,arr,arr.length);
		for(int r:arr) {
			System.out.println(r);
		}
	}

	private static void reverse(int i,int arr[],int n) {
		if(i>=n-i-1)
			return;
		int temp=arr[i];
		arr[i]=arr[n-i-1];
		arr[n-i-1]=temp;
		
		reverse(i+1,arr,n);
		
	}

	

	
}

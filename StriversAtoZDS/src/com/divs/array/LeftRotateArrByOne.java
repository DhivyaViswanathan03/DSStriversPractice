package com.divs.array;

public class LeftRotateArrByOne {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6,7};
		int tmp=arr[0];
		for(int i=1;i<arr.length;i++) {
			arr[i-1]=arr[i];
		}
		arr[arr.length-1]=tmp;
		for(int a:arr) {
			System.out.print(a+" ");
		}

	}

}

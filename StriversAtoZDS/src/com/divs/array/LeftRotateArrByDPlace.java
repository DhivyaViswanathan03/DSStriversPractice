package com.divs.array;

public class LeftRotateArrByDPlace {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6,7}; 
		int ele=16;
		int d=ele%arr.length;
//		System.out.println("shifting start from:"+shiftStart);
		int n=arr.length;
		int temp[]=new int[d];
		for(int i=0;i<d;i++) {
			temp[i]=arr[i];
		}
		for(int j=d;j<n;j++) {
			arr[j-d]=arr[j];
			System.out.println(arr[j-d]);
		}
		int j=0;
		for(int k=n-d;k<n;k++) {
			arr[k]=temp[j];
			j++;
		}
		
		for(int a:arr) {
			System.out.print(a+" ");
		}
	}

}

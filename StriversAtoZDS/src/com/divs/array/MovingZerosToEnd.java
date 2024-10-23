package com.divs.array;

public class MovingZerosToEnd {

	public static void main(String[] args) {
		int arr[]= {1,0,2,3,2,0,0,4,5,1};
		int count=0;
		int n=arr.length;
		for(int i=0;i<n;i++) {
			if(arr[i]!=0) {
				arr[count]=arr[i];
				count++;
			}
		}
		for(int i=count;i<n;i++) {
			arr[i]=0;
		}
		
		for(int a:arr) {
			System.out.print(a+" ");
		}

	}

}

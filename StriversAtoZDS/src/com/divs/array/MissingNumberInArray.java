package com.divs.array;

public class MissingNumberInArray {

	public static void main(String[] args) {
		int arr[]= {1,2,4,3,5,7,8,9,10,11};
		int n=10;
		for(int i=1;i<=n;i++) {
			int flag=0;
			for(int j=0;j<arr.length;j++) {
				if(arr[j]==i) {
					flag=1;
					break;
				}
			}
			if(flag==0) {
				System.out.println("Missing Number:"+i);
			}
		}

	}

}

package com.divs.array;

public class SortArray0s1s2s {

	public static void main(String[] args) {
		int arr[]= {2,0,2,1,1,0,0,2,2,2};
		betterApproach(arr);
		
	}

	private static void betterApproach(int[] arr) {
		int cnt1=0,cnt2=0,cnt3=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==0)cnt1++;
			else if(arr[i]==1)cnt2++;
			else if(arr[i]==2)cnt3++;
		}
		for(int i=0;i<cnt1;i++) {
			arr[i]=0;
		}
		for(int i=cnt1;i<cnt1+cnt2;i++) {
			arr[i]=1;
		}
		for(int i=cnt1+cnt2;i<arr.length;i++) {
			arr[i]=2;
		}
		for(int a:arr) {
			System.out.print(a+" ");
		}
		
	}

}

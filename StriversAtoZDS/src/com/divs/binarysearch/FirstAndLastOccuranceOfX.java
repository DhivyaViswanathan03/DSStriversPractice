package com.divs.binarysearch;

public class FirstAndLastOccuranceOfX {

	public static void main(String[] args) {
		int arr[] = {3,4,13,13,13,20,40,13};
		int target=13;
		int first=-1;
		int last=-1;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==target) {
				if(first==-1) {
					first=i;
				}
				last=i;
			}
		}
		System.out.println("1st occurance index is:"+first);
		System.out.println("last occurance index is:"+last);
		
	}

}

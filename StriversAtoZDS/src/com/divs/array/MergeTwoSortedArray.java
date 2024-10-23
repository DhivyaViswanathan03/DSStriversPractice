package com.divs.array;

import java.util.Arrays;

public class MergeTwoSortedArray {

	public static void main(String[] args) {
		int arr1[]= {1,3,5,7};
		int arr2[]= {0,2,6,8,9};
//		bruteForceApproach(arr1,arr2);
		optimalApproach1(arr1,arr2);

	}

	private static void optimalApproach1(int[] arr1, int[] arr2) {
		int i=arr1.length-1;
		int j=0;
		while(i>=0 && j<arr2.length) {
			if(arr1[i]>arr2[j]) {
				int temp=arr1[i];
				arr1[i]=arr2[j];
				arr2[j]=temp;
				i--;
				j++;
			}else {
				break;
			}
		}
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		for(int a:arr1) {
			System.out.print(a+" ");
		}
		System.out.println();
		
		for(int a:arr2) {
			System.out.print(a+" ");
		}
		
	}

	private static void bruteForceApproach(int[] arr1, int[] arr2) {
		int i=0;
		int j=0;
		int index=0;
		int temp[]=new int[arr1.length+arr2.length];
		while(i<arr1.length && j<arr2.length) {
			if(arr1[i]<=arr2[j]) {
				temp[index]=arr1[i];
				i++;
				index++;
			}else{
				temp[index]=arr2[j];
				j++;
				index++;
			}
		}
		
		while(i<arr1.length) {
			temp[index++]=arr1[i++];
		}
		
		while(j<arr2.length) {
			temp[index++]=arr2[j++];
		}
		
		for(int k=0;k<arr1.length+arr2.length;k++) {
			if(k<arr1.length) {
				arr1[k]=temp[k];
			}else {
				arr2[k-arr1.length]=temp[k];
			}
			
		}
		
		for(int a:arr1) {
			System.out.print(a+" ");
		}
		System.out.println();
		
		for(int a:arr2) {
			System.out.print(a+" ");
		}
		
		
		
	}

}

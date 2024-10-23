package com.divs.array;

import java.util.HashSet;
import java.util.Set;

public class UnionOfTwoSortedArrays {

	public static void main(String[] args) {
	int arr1[] = {1,2,3,4,5,8};  
	int arr2[] = {2,3,4,4,5,6};
	
	Set<Integer> set=new HashSet<Integer>();
	for(int i=0;i<arr1.length;i++) {
		set.add(arr1[i]);
	}
	for(int j=0;j<arr2.length;j++) {
		set.add(arr2[j]);
	}
	int[] union=new int[set.size()];
	int count=0;
	for(int a:set) {
		union[count]=a;
		System.out.print(union[count]+" ");
		count++;
	}
	
				
	}

}

package com.divs.sorting;

import java.util.ArrayList;
import java.util.List;

//Divide and Merge
public class MergeSort {

	public static void main(String[] args) {
		int arr[]= {1,3,4,5,6,2,3,9,7,2,5};
		int low=0,high=arr.length-1;
		mergeSort(arr,low,high);
		for(int a:arr) {
			System.out.print(a+" ");
		}

	}

	private static void mergeSort(int[] arr, int low, int high) {
		if(low==high)return;
		int mid=(low+high)/2;
		mergeSort(arr,low,mid);
		mergeSort(arr,mid+1,high);
		merge(arr,low,mid,high);
		
	}

	private static void merge(int[] arr, int low, int mid, int high) {
		int left=low;
		int right=mid+1;
		int i=0;
		List<Integer> temp=new ArrayList();
		while(left<=mid && right<=high) {
			if(arr[left]<=arr[right]) {
				temp.add(arr[left]);
				left++;
			}else {
				temp.add(arr[right]);
				right++;
			}
		}
		while(left<=mid) {
			temp.add(arr[left]);
			left++;
		}
		while(right<=high) {
			temp.add(arr[right]);
			right++;
		}
		
		for(int j=low;j<=high;j++) {
			arr[j]=temp.get(j-low);
		}
		
	}

}

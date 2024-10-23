package com.divs.sorting;

//Pick pivot and place its in correct place
//Place smaller in right and larger in left
public class QuickSort {

	public static void main(String[] args) {
		int arr[]= {4,5,2,5,7,9,1,3,3,9};
		int low=0,high=arr.length-1;
		qs(arr,low,high);
		for(int a:arr) {
			System.out.print(a+" ");
		}

	}

	private static void qs(int[] arr, int low, int high) {
		if(low<high) {
			int pIndex=findPartitionIndex(arr,low,high);
			qs(arr,low,pIndex-1);
			qs(arr,pIndex+1,high);
		}
		
	}

	private static int findPartitionIndex(int[] arr, int low, int high) {
		int i=low;
		int j=high;
		int pivot=arr[low];
		while(i<j) {
			while(arr[i]<=pivot && i<=high-1) {
				i++;
			}
			while(arr[j]>pivot && j>=low) {
				j--;
			}
			if(i<j) {
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
		int temp=arr[j];
		arr[j]=arr[low];
		arr[low]=temp;
		return j;
	}

}

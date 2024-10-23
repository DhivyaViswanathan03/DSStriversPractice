package com.divs.array;

public class SecondLargestWithoutSort {

	public static void main(String[] args) {
		int arr[]= {3,5,7,1,1,9,3,5,8,10,8};
		int max=arr[0];
//		for(int i=1;i<arr.length;i++) {
//				if(arr[i]>max) {
//					max=arr[i];
//				}
//		}
//		int secondLargest=-1;
//		
//		for(int i=0;i<arr.length;i++) {
//			if(arr[i]>secondLargest && arr[i]!=max) {
//			secondLargest=arr[i];
//			}
//		}
		secondLargest(arr,arr.length);
		secondSmallest(arr,arr.length);
		
//		System.out.println(secondLargest);

	}

	private static void secondSmallest(int[] arr, int n) {
		int smallest=arr[0];
		int sSamllest=-1;
		for(int i=1;i<n;i++) {
			if(arr[i]<smallest) {
				sSamllest=smallest;
				smallest=arr[i];
			}else if(arr[i]>smallest && arr[i]<sSamllest) {
				sSamllest=arr[i];
			}
		}
		System.out.println("Largest :"+sSamllest);
	}

	private static void secondLargest(int[] arr, int n) {
		int largest=arr[0];
		int sLargest=-1;
		for(int i=1;i<n;i++) {
			if(arr[i]>largest) {
				sLargest=largest;
				largest=arr[i];
			}else if(arr[i]<largest && arr[i]>sLargest) {
				sLargest=arr[i];
			}
		}
		System.out.println("Largest :"+sLargest);
		
	}

}

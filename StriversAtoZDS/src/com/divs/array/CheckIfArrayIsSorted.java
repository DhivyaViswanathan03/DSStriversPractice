package com.divs.array;

public class CheckIfArrayIsSorted {

	public static void main(String[] args) {
		int arr[]= {1,2,3,3,4,1,6,7};
		for(int i=1;i<arr.length;i++) {
			if(arr[i]>=arr[i-1]) {
				
			}else {
				System.out.println("not sorted");
				break;
			}
		}

	}

}

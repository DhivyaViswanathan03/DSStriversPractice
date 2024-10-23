package com.divs.array;

import java.util.ArrayList;
import java.util.List;

public class RearrangeAnEleBySign {

	public static void main(String[] args) {
		int arr[] = {1,2,-4,-5,8,7,-4,-5};
		bruteForceApproach(arr);
		optimalApproach(arr);
	}

	private static void optimalApproach(int[] arr) {
		int pos=0;
		int neg=1;
		int ans[]=new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<0) {
				ans[neg]=arr[i];
			}else {
				ans[pos]=arr[i];
			}
		}
		for(int a:arr) {
			System.out.print(a+" ");
		}
		
	}

	private static void bruteForceApproach(int[] arr) {
		int n=arr.length;
		List<Integer> pos=new ArrayList<Integer>();
		List<Integer> neg=new ArrayList<Integer>();
		for(int i=0;i<n;i++) {
			if(arr[i]<0) {
				neg.add(arr[i]);
			}else {
				pos.add(arr[i]);
			}
		}
		for(int i=0;i<n/2;i++) {
			arr[2*i]=pos.get(i);
			arr[2*i+1]=neg.get(i);
		}
		for(int a:arr) {
			System.out.print(a+" ");
		}		
		System.out.println();
	}

}

package com.divs.array;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.lang.Integer;

public class RepeatingAndMissingNumber {

	public static void main(String[] args) {
		int[] arr= {1,3,4,5,1,2};
		bruteForceApproach(arr);
		hashing(arr);
		

	}

	private static void hashing(int[] arr) {
		int n=arr.length;
		int hash[]=new int[n+1];
		for(int i=0;i<arr.length;i++) {
			hash[arr[i]]++;
		}
		
		for(int i=1;i<=n;i++) {
			if(hash[i]==2) {
				System.out.println("repeated:"+i);
			}else if(hash[i]==0) {
				System.out.println("Missing:"+i);
			}
		}
		
		
	}

	private static void bruteForceApproach(int[] arr) {
		int n=6;
		int repeating=-1;
		int missing=-1;
		for(int i=1;i<=6;i++) {
			int count=0;
			for(int j=0;j<arr.length;j++) {
				if(arr[j]==i) {
					count++;
				}
			}
			if(count==2) {
				repeating=i;
			}else if(count==0){
				missing=i;
			}
			if(repeating !=-1 && missing !=-1) {
				break;
			}
		}
		System.out.println("Repeating: "+repeating);
		System.out.println("Missing: "+missing);		
	}

}

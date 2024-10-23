package com.divs.array;

import java.util.HashMap;
import java.util.Map;

public class TwoSumProblem {
public static void main(String[] args) {
		int arr[] = {2,6,5,8,11};
		int target = 17;
		bruteForceApproach(arr,target);
		String result=betterApproach(arr,target);
		if(result==null)
			System.out.println("no ele");
		else
			System.out.println(result);
		
	}

private static String betterApproach(int[] arr, int target) {
	Map<Integer,Integer> map=new HashMap<Integer,Integer>();
	for(int i=0;i<arr.length;i++) {
		int moreNeeded=target-arr[i];
		if(map.containsKey(moreNeeded)){
//			return "YES";
			int index=map.get(moreNeeded);
			
			return "["+i+","+index+"]";
		}
		map.put(arr[i], i);
	}
	return null;
	
	
}

private static void bruteForceApproach(int[] arr,int target) {
	for(int i=0;i<arr.length;i++) {
		for(int j=i+1;j<arr.length;j++) {
			if(arr[i]+arr[j]==target) {
				System.out.println("Indexes: "+i+","+j);
			}
		}
	}
}

}

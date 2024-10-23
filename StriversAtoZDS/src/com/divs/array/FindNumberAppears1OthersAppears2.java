package com.divs.array;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class FindNumberAppears1OthersAppears2 {

	public static void main(String[] args) {
		int arr[]= {1,1,2,2,3,3,4,4,8,8,9};
		Map<Integer,Integer> map=new HashMap<Integer,Integer>();
		for(int a:arr) {
			if(map.containsKey(a)) {
				map.put(a, map.get(a)+1);
			}else {
				map.put(a, 1);
			}
		}
		Set<Entry<Integer,Integer>> result = map.entrySet();
		for(Entry<Integer, Integer> a:result){
			if(a.getValue()==1) {
				System.out.println(a.getKey()+"....>"+a.getValue());
			}
		}
		
		optimalApproach(arr);

	}

	private static void optimalApproach(int[] arr) {
		int xor=0;
		for(int i=0;i<arr.length;i++) {
			xor=xor^arr[i];
		}
		System.out.println(xor);
		
	}

}

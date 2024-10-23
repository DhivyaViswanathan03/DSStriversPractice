package com.divs.array;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MajaorityElenBy3Times {

	public static void main(String[] args) {
		int arr[]= {3,2,3};
		hashingApproach(arr);
		

	}

	private static void hashingApproach(int[] arr) {
		Map<Integer,Integer> map=new HashMap<Integer,Integer>();
		for(int a:arr) {
			if(map.containsKey(a)) {
				map.put(a, map.get(a)+1);
			}else {
				map.put(a, 1);
			}
		}
		Set<Entry<Integer,Integer>> result=map.entrySet();
		for(Map.Entry<Integer, Integer> r:result) {
			if(r.getValue()>arr.length/3) {
				System.out.println(r.getKey()+"...>"+r.getValue());
			}
		}
		
	}

}

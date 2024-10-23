package com.divs.hashing;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class UsingMap {

	public static void main(String[] args) {
		int[] arr = new int[]{1,2,3,2,1,1,0,3,5};
		Map<Integer,Integer> map=new HashMap<Integer,Integer>();
		for(int i=0;i<arr.length;i++) {
			if(map.containsKey(arr[i])) {
				map.put(arr[i], map.get(arr[i])+1);
			}else {
				map.put(arr[i], 1);
			}
			
			
		}
		
//		Set<Entry<Integer, Integer>> result = map.entrySet();
//		for(Entry<Integer, Integer> r:result) {
//			if(r.getValue()>=2) {
//				System.out.println(r.getKey()+"---->"+r.getValue());
//			}
//		}
		int maxFrq=0,maxEle=0;
		int n=arr.length;
		int minFrq=n,minEle=0;
		for(Entry<Integer, Integer> entry:map.entrySet()) {
			int element=entry.getKey();
			int count=entry.getValue();
			if(count>maxFrq) {
				maxFrq=count;
				maxEle=element;
			}
			if(count<minFrq) {
				minFrq=count;
				minEle=element;
			}
		}
		System.out.println("Max freq element is"+maxEle+"....>"+maxFrq);
		System.out.println("Min freq element is"+minEle+"....>"+minFrq);

	}

}

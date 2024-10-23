package com.divs.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class ThreeSumProblem {

	public static void main(String[] args) {
		int arr[]= {-1,0,1,2,-1,-4};
//		List list=new ArrayList();
		Set<List<Integer>> set=new HashSet<List<Integer>>();
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				for(int k=j+1;k<arr.length;k++) {
					if(arr[i]+arr[j]+arr[k]==0) {
						List<Integer> list=Arrays.asList(arr[i],arr[j],arr[k]);
						list.sort(null);
						set.add(list);
//						System.out.println(arr[i]+","+arr[j]+","+arr[k]);
					}
				}
			}
		}
		Iterator<List<Integer>> st = set.iterator();
			while(st.hasNext()) {
				System.out.println(st.next());
			}
	}
}

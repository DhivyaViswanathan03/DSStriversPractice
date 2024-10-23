package com.divs.array;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class FourSumProblem {

	public static void main(String[] args) {
		int[] arr = {4, 3, 3, 4, 4, 2, 1, 2, 1, 1};
        int target = 9;
        Set<List<Integer>> set=new HashSet<List<Integer>>();
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				for(int k=j+1;k<arr.length;k++) {
					for(int L=k+1;L<arr.length;L++) {
					if(arr[i]+arr[j]+arr[k]+arr[L]==target) {
						List<Integer> list=Arrays.asList(arr[i],arr[j],arr[k],arr[L]);
						Collections.sort(list);
						set.add(list);
//						System.out.println(arr[i]+","+arr[j]+","+arr[k]);
					}
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

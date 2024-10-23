package com.divs.binarysearch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RowWithMaxNoOfOnes {

	public static void main(String[] args) {
		List<List<Integer>> list=new ArrayList<List<Integer>>();
		list.add(Arrays.asList(0,0,1,1));
		list.add(Arrays.asList(0,1,1,1));
		list.add(Arrays.asList(0,0,1,1));
		list.add(Arrays.asList(1,1,1,1));
		returnIndexBruteForce(list);
	}

	private static void returnIndexBruteForce(List<List<Integer>> list) {
		int countMax=-1;
		int index=-1;
		for(int i=0;i<list.size();i++) {
			int countRowsWith1=0;
			for(int j=0;j<list.size();j++) {
				countRowsWith1=countRowsWith1+list.get(i).get(j);
			}
			if(countRowsWith1>countMax) {
				countMax=countRowsWith1;
				index=i;
			}
		}
		System.out.println(index);
		
	}

}

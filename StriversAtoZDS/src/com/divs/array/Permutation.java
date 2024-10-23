package com.divs.array;

import java.util.ArrayList;
import java.util.List;

public class Permutation {

	public static void main(String[] args) {
		String[] nums= {"demo","java","world"};
		List<String> ds=new ArrayList<String>();
		List<List<String>> rs=new ArrayList<List<String>>();
		boolean[] freq=new boolean[nums.length];
		rs=findPermute(nums,ds,rs,freq);
		System.out.println(rs);
		System.out.println(rs.size());

	}

	private static List<List<String>> findPermute(String[] nums, List<String> ds, List<List<String>> rs, boolean[] freq) {
		if(ds.size()==nums.length) {
			rs.add(new ArrayList<>(ds));
			return rs;
		}
		for(int i=0;i<nums.length;i++) {
			if(!freq[i]) {
				freq[i]=true;
				ds.add(nums[i]);
				findPermute(nums, ds, rs, freq);
				ds.remove(ds.size()-1);
				freq[i]=false;
			}
		}
		return rs;
		
	}

}

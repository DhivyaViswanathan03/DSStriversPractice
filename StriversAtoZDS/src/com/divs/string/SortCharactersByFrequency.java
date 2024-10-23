package com.divs.string;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SortCharactersByFrequency {

	public static void main(String[] args) {
//		String s = "tree";
		String s="Aabb";
		Map<Character,Integer> map=new HashMap<Character,Integer>();
		
		for(char c:s.toCharArray()) {
			if(map.containsKey(c)) {
				map.put(c, map.get(c)+1);
			}else {
				map.put(c, 1);
			}
		}
		
		List<Map.Entry<Character, Integer> > sortedDict = 
				new ArrayList<Map.Entry<Character, Integer> >(map.entrySet());
		
		
		Collections.sort(sortedDict,new Comparator<Map.Entry<Character, Integer>>() {

			@Override
			public int compare(Map.Entry<Character, Integer> o1, Map.Entry<Character, Integer> o2) {
				return o2.getValue().compareTo(o1.getValue());
			}
		});
		
		for(Map.Entry<Character, Integer> entry:sortedDict) {
			for(int i=0;i<entry.getValue();i++) {
				System.out.print(entry.getKey());
			}
			
		}
	}

}

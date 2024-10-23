package com.divs.array;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class LongestConsecutiveSequence {

	public static void main(String[] args) {
		int arr[]= {101,100,2,3,4,1,103,0,102,99,98};
		Set<Integer> set=new HashSet<Integer>();
		for(int i=0;i<arr.length;i++) {
			set.add(arr[i]);
		}
		int  longest=1;
          for(int it:set) {
        	  if(!set.contains(it-1)) {
        		  int counter=1;
        		  int x=it;
        		  System.out.print(x+" ");
        		  while(set.contains(x+1)) {
        			  counter=counter+1;
        			  x=x+1;
        			  System.out.print(x+" ");
        		  }
        		  System.out.println();
        		  longest=Math.max(longest, counter);
        	  }
        	  
          }
          System.out.println(longest);
	}

}

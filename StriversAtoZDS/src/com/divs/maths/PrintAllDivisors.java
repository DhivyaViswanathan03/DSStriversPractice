package com.divs.maths;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PrintAllDivisors {

	public static void main(String[] args) {
		allDivisors(36);

	}

	private static void allDivisors(int n) {
		List result=new ArrayList();
		for(int i=1;i*i<=n;i++) {
			if(n%i==0) {
				result.add(i);
				if(n/i!=i) {
					result.add(n/i);
				}
			}
			
			
		}
		Collections.sort(result);
		System.out.println(result);
		
	}

}

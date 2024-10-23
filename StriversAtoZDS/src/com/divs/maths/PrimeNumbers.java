package com.divs.maths;

public class PrimeNumbers {

	public static void main(String[] args) {
		for(int i=1;i<13;i++) {
			primeNumbers(i);
		}
		

	}

//	private static void isPrime(int n) {
//		int count=0;
//		for(int i=1;i*i<=n;i++ ) {
//			if(n%i==0) {
//				count++;
//				System.out.print(i+" ");
//				if(n/i!=i) {
//					count++;	
//					System.out.print(n/i);
//				}
//				
//					
//			}
//			
//		}
//		if(count==2)
//			System.out.println("Prime");
//		else
//			System.out.println("Not Prime");
//		
//	}
	
	public static void primeNumbers(int n) {
		int count=0;
		for(int i=1;i*i<=n;i++) {
			if(n%i==0) {
				count++;
//				System.out.print(i+" ");
				if(n/i!=i) {
					count++;	
//					System.out.print(n/i);
				}
				
					
			}
			
		}
		if(count==2) {
			System.out.println(n+" is prime Number");
		}else {
			//System.out.println(n+" is not prime");
		}
		
	}

}

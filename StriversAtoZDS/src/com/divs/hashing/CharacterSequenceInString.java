package com.divs.hashing;

public class CharacterSequenceInString {

	public static void main(String[] args) {
String s="abcdabffyza";
int[] arr= new int[26];
for(int i=0;i<s.length();i++) {
	arr[s.charAt(i)-'a']+=1;
}
char c='c';
System.out.println(arr[c-'a']);

	}

}

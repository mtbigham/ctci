/*
Implement an algorithm to determine if a string has all unique characters.  What if you cannot use additional data structures?
*/

import java.util.*;

public class q1_1{
	public static void main(String[] args){
		String s1 = "abcdefghijklmnop";
		String s2 = "Test string, please ignore";
		String s3 = "Test"; //test capitalization
		
		//Hash Map is useful for this: o(1) lookups means we can check before adding a character if it already exists, meaning worst case o(n) to determine uniqueness of string
		System.out.println(checkUnique(s1));
		System.out.println(checkUnique(s2));
		System.out.println(checkUnique(s3));
		
	}
	
	public static boolean checkUnique(String s){
		//key/value
		HashMap<Character, Boolean> map = new HashMap<Character, Boolean>();
		for(char ch : s.toCharArray()){
			if(map.containsKey(ch)){
				return false;
			}
			map.put(ch, true);
		}
		return true;
	}
}
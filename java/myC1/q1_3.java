/*
Given two strings, write a method to decide if one is a permutation of the other.
*/

public class q1_3{
	public static void main(String[] args){
		String[][] str = {{"Test", "tseT"}, {"asdf", "asdfa"}, {"asdf", "qwer"}, {"", ""}};
		
		for(String[] s : str){
			System.out.println(permutationCheck(s[0], s[1]));
		}
	}
	
	public static boolean permutationCheck(String s1, String s2){
		//basic length check.  uneven lengths = no permutation
		if(s1.length() != s2.length()){
			return false;
		}
		
		//simple hash strategy (1 array slot per possible ascii character)
		int[] characters = new int[128];
		
		for(char ch : s1.toCharArray()){
			characters[ch]++;
		}
		
		for(char ch : s2.toCharArray()){
			characters[ch]--;
			
			if(characters[ch] < 0){
				return false;
			}
		}
		return true;
	}
}
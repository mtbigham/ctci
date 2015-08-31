/*
Replace all spaces in a string with '%20'.  Assume that the string has sufficient space at the end to hold the additional characters, and that you are given the 'true' length of the string.
Java: Use Char Array to perform in place.

Ex:
Input:	"Mr John Smith    "
Output:	"Mr%20John%20Smith"
*/

public class q1_4{
	public static void main(String[] args){
		String str = "abc d e f";
		char[] arr = new char[str.length() + 3 * 2 + 1];
		for (int i = 0; i < str.length(); i++) {
			arr[i] = str.charAt(i);
		}
		System.out.println(replace(arr, str.length()));	
		
	}
	
	public static char[] replace(char[] str, int length){
		int spaceCount = 0, index = 0;
		
		//figure out number of spaces
		for(int i = 0; i < str.length; i++){
			if(str[i] == ' '){
				spaceCount++;
			}
		}
		
		//figure out where the end of the NEW string will be
		index = length + spaceCount * 2;
		str[index] = '\0';
		
		//go backwards
		for(int i = length-1; i >= 0; i--){
			if(str[i] == ' '){
				str[index-1] = '0';
				str[index-2] = '2';
				str[index-3] = '%';
				
				index -= 3;
			}
			else{
				str[index-1] = str[i];
				index--;
			}
		}
		
		return str;
	}
}
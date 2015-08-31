/*
Implement a function void reverse(String str) which reverses a null-terminated string.
*/
import java.util.*;

public class q1_2{
	public static void main(String[] args){
		String[] str = {"Test", "Test1", "Test string, please ignore."};
		
		for(String s : str){
			reverseBuffer(s);
			reverseManual(s);
		}
	}
	
	public static void reverseBuffer(String str){
		System.out.println(new StringBuffer(str).reverse().toString());
	}
	
	public static void reverseManual(String str){
		char[] ch = str.toCharArray();
		char temp;
		int begin = 0;
		int end = ch.length-1;
		while(begin < end){
			temp = ch[end];
			ch[end] = ch[begin];
			ch[begin] = temp;
			begin++;
			end--;
		}
		
		System.out.println(new String(ch));
	}
}
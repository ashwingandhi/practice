package string_programs;

import java.util.LinkedHashMap;
import java.util.Map;

public class StringMethods {
	public static void main(String[] args){
		
		String a = "Ashwin Gandhi";
		
		System.out.println(reverse(a));
		
		permutation("abc");
		
		//System.out.println(a.substring(0, 5));
		//System.out.println(a.substring(6, a.length()));
		
		Map<Character, Integer> c = new LinkedHashMap<Character, Integer>();
	}
	
	public static String reverse(String str){
		
		if(str.length() <= 1){
			return str;
		}
		return reverse(str.substring(1)) + str.charAt(0);
	}
	
	
	public static void permutation(String word){
		permutation("", word);
	}
	
	public static void permutation(String prefix, String word){
		if(word.length() == 0){
			System.out.println(prefix);
		}else {
			for(int i=0; i<word.length(); i++){
				permutation(prefix + word.charAt(i), word.substring(0, i) + word.substring(i+1, word.length()));
			}
		}
	}
}

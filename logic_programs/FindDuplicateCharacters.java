package logic_programs;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FindDuplicateCharacters {

	private static void printDuplicateCharacters(String word) {
		char[] characters = word.toCharArray();
		Map<Character,Integer> charMap  = new HashMap<Character,Integer>();
		for(Character ch: characters){
			if(charMap.containsKey(ch)){
				charMap.put(ch, charMap.get(ch)+1);
			}
			else{
				charMap.put(ch, 1);
			}
		}
		/*Set<Map.Entry<Character,Integer>> entrySet = charMap.entrySet();
		System.out.printf("List of duplicate characters in String '%s' %n ",word);
		for(Map.Entry<Character,Integer> entry : entrySet){
			if(entry.getValue()>1){
				System.out.printf("%s :%d %n", entry.getKey(),entry.getValue());
			}
		}*/
		
		for(int i=0; i<characters.length; i++){		
			if(charMap.get(characters[i]) > 1){
				System.out.println(characters[i]+":"+charMap.get(characters[i]));
			}
		}
	}
	public static void main(String[] args) {
		
		//printDuplicateCharacters("Java");
		Scanner s = new Scanner(System.in);
		printDuplicateCharacters("Chaitrali");
	}

}

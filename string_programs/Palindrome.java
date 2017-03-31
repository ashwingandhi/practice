package string_programs;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean b = isPalindrome("No lemons, sno melon");
		System.out.println(b);
		
	}
	
	 static boolean isPalindrome(String wordOrPhrase) {
		    
		    StringBuilder str = new StringBuilder(); 
		    boolean isPal = true;
		    
		    for(int i = 0; i< wordOrPhrase.length(); i++){
		        if((wordOrPhrase.charAt(i) >= 'A' && wordOrPhrase.charAt(i) <= 'Z') || 
		        (wordOrPhrase.charAt(i) >= 'a' && wordOrPhrase.charAt(i) <= 'z')){
		        	str = str.append(Character.toLowerCase(wordOrPhrase.charAt(i)));   
		        }
		        
		    }
		    
		    for(int i=0; i < (str.length()/2); i++){
		        if(str.charAt(i) != str.charAt(str.length() - i - 1)){
		            isPal = false;
		            break;
		        }
		    }
		    
		    return isPal;
		}

}

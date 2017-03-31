package string_programs;
import java.util.HashMap;
import java.util.Map;

public class FindDuplicateCharachters {

	public static void maxOccuraances(String s1) {
		char[] characters = s1.toCharArray();
		Map<Character, Integer> m1 = new HashMap<Character, Integer>();
		for (int i = 0; i < characters.length; i++) {
			if (m1.containsKey(characters[i])) {
				m1.put(characters[i], m1.get(characters[i])+1);
			} else {
				m1.put(characters[i], 1);
			}
		}
		
	/*    Iterator it = m1.entrySet().iterator();
	    while (it.hasNext()) {
		    	Map.Entry pair = (Map.Entry)it.next();
		    	if(m1.get(pair.getKey()) > 1)
		        System.out.println(pair.getKey() + " = " + pair.getValue());
		        it.remove(); // avoids a ConcurrentModificationException
	    }*/
	    
	    for (Map.Entry<Character, Integer> entry : m1.entrySet()) {
	    	if(m1.get(entry.getKey()) > 1){
	    		//System.out.println("Hi");
	    		System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
	    	}
	        
	    }
	}

	public static void main(String[] args) {

		String s1 = "Chaitrali";
		maxOccuraances(s1);
	}
}

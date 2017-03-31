package others;
/*********************************************
 * @author Chaitrali Jayantilal Doshi 
 * Date: 2016.08.05 
 * Description: The program is an implementation
 * and manipulation of string list
 * 
 *********************************************/

import java.util.Arrays;
import java.util.Scanner;

class SList{
	String [] values;
	int count;
}

public class InsertInPlace {
	
	/**
	 * The method creates String list and initializes it with specified size. 
	 * @param sizeofArray
	 * @return SList 
	 */
	static SList createSList(int sizeofArray){
		SList temp = new SList();
		temp.values = new String[sizeofArray];
		temp.count =0;
		
		return temp;	
	}
	
	/**
	 * The method displays the concatenated list.
	 * @param l
	 * @return String
	 */
	static String stringifySList(SList l){
		String temp = "<<" + l.values[0];
		for(int i = 1;i < l.values.length;i++){
			temp = temp +  "," + l.values[i];
		}
		temp = temp + ">>";
		return temp;
	}
	
	/**
	 * The method checks if the list is empty.
	 * @param l
	 * @return boolean
	 */
	static boolean isSListEmpty(SList l){
		if(l != null)
			return l.count == 0;
		else
		return true;
		
	}
	
	/**
	 * The method checks if the list is full.
	 * @param l
	 * @return boolean
	 */
	static boolean isSListFull(SList l){
		if(l != null)
			return l.count == l.values.length;
		else
		return false;
	}
	
	/**
	 * The method inserts a String into the String list.
	 * @param l
	 * @param s1
	 * @return SList
	 */
	static SList insertInPlace(SList l, String s1){
		
		if(isSListFull(l))
			return l;
		else{
			l.values[l.count] = s1;
			l.count++;
			Arrays.sort(l.values,0,l.count);
			
			return l;
		} 
		
	}

	
	/**
	 * Main method
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the size of String list:");
		
		SList sl = createSList(in.nextInt());
		in.nextLine();
		String name = null;
		for(int i=0;i<sl.values.length;i++){
			System.out.println("Enter the Name:");
			name = in.nextLine();
			insertInPlace(sl,name);
			
		}
		
		System.out.println(stringifySList(sl));
		in.close();
	}

}

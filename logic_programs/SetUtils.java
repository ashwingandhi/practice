package logic_programs;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetUtils {

	int a = 0;
	static int i = 5;

	public static void main(String[] args) {

		/*
		 * TestStatic.i++; System.out.println(TestStatic.i); TestStatic t1 = new
		 * TestStatic(); t1.a++; System.out.println(t1.a); TestStatic t2= new
		 * TestStatic(); t2.a++; System.out.println(t2.a); TestStatic.i++;
		 * System.out.println(TestStatic.i);
		 */

		Set<Integer> mySet = new HashSet<Integer>();
		 mySet.add(1);
		 mySet.add(2);
		 mySet.add(3);
		 for (Set<Integer> s : SetUtils.powerSet(mySet)) {
		     System.out.println(s);
		 }
	}
	
	public static <T> Set<Set<T>> powerSet(Set<T> originalSet) {
	    Set<Set<T>> sets = new HashSet<Set<T>>();
	    if (originalSet.isEmpty()) {
	        sets.add(new HashSet<T>());
	        return sets;
	    }
	    List<T> list = new ArrayList<T>(originalSet);
	    T head = list.get(0);
	    Set<T> rest = new HashSet<T>(list.subList(1, list.size())); 
	    for (Set<T> set : powerSet(rest)) {
	        Set<T> newSet = new HashSet<T>();
	        newSet.add(head);
	        newSet.addAll(set);
	        sets.add(newSet);
	        sets.add(set);
	    }       
	    return sets;
	}

}

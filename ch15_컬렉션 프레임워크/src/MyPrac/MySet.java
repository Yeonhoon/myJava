package MyPrac;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class MySet {
	public static void main(String[] args) {
		
		Set<String> mySet = new HashSet<>();
		
		mySet.add("가");
		mySet.add("라");
		mySet.add("마");
		mySet.add("사");
		
		for(String set: mySet) {
			System.out.println(set);
		}

		Set<String> mySet2 = new TreeSet<>();

		mySet2.add("가");
		mySet2.add("라");
		mySet2.add("사");
		mySet2.add("마");

		for(String set2: mySet) {
			System.out.println(set2);
		}
	}
}

package MyPrac;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class MySet {
	public static void main(String[] args) {
		
		Set<String> mySet = new HashSet<>();
		
		mySet.add("��");
		mySet.add("��");
		mySet.add("��");
		mySet.add("��");
		
		for(String set: mySet) {
			System.out.println(set);
		}

		Set<String> mySet2 = new TreeSet<>();

		mySet2.add("��");
		mySet2.add("��");
		mySet2.add("��");
		mySet2.add("��");

		for(String set2: mySet) {
			System.out.println(set2);
		}
	}
}

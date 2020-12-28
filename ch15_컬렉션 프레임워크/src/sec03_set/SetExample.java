package sec03_set;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {
	public static void main(String[] args) {
		
		Set<String> set = new TreeSet<>(); //List와 마찬가지로 여러 객체가 와도 사용방법은 같음.
		Set<String> set2 = new HashSet<>(); //List와 마찬가지로 여러 객체가 와도 사용방법은 같음.

		// 사용가능한 구현객체: AbstractSet, ConcurrentHashMap.KeySetView, ConcurrentSkipListSet, CopyOnWriteArraySet, 
		// EnumSet, HashSet, JobStateReasons, LinkedHashSet, TreeSet
		
		set.add("김여름");
		set.add("이겨울");
		set.add("박가을"); //set은 중복저장 안됨. 중복 시 마지막 add만 저장됨.

		set2.add("김여름");
		set2.add("이겨울");
		set2.add("박가을"); //set은 중복저장 안됨. 중복 시 마지막 add만 저장됨.

		
		System.out.println(set.size());
		
		for(String name: set) {
			System.out.println(name);
		}
		
		for(String name: set2) {
			System.out.println(name);
		}
	}
}

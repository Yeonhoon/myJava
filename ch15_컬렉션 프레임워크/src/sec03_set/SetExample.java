package sec03_set;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {
	public static void main(String[] args) {
		
		Set<String> set = new TreeSet<>(); //List�� ���������� ���� ��ü�� �͵� ������� ����.
		Set<String> set2 = new HashSet<>(); //List�� ���������� ���� ��ü�� �͵� ������� ����.

		// ��밡���� ������ü: AbstractSet, ConcurrentHashMap.KeySetView, ConcurrentSkipListSet, CopyOnWriteArraySet, 
		// EnumSet, HashSet, JobStateReasons, LinkedHashSet, TreeSet
		
		set.add("�迩��");
		set.add("�̰ܿ�");
		set.add("�ڰ���"); //set�� �ߺ����� �ȵ�. �ߺ� �� ������ add�� �����.

		set2.add("�迩��");
		set2.add("�̰ܿ�");
		set2.add("�ڰ���"); //set�� �ߺ����� �ȵ�. �ߺ� �� ������ add�� �����.

		
		System.out.println(set.size());
		
		for(String name: set) {
			System.out.println(name);
		}
		
		for(String name: set2) {
			System.out.println(name);
		}
	}
}

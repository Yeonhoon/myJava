package sec02_list;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class ListExample01 {
	public static void main(String[] args) {
		
		List list = new ArrayList(); // Ŭ���� - �ڽİ�ü or �������̽�  - ������ü
	
		// ��밡���� ������ü: AbstractList, AbstractSequentialList, ArrayList, AttributeList, CopyOnWriteArrayList, 
		// LinkedList, RoleList, RoleUnresolvedList, Stack, Vector

//		list.add(//������Ʈ)
				// � Ŭ������ object�� �����.class ListExample (extends Object) <-�갡 �����Ǿ�����.
				// �׷��Ƿ� method(Object obj)���� obj���� ��� ��ü�� �� �� ��
		//void method(Object obj) {
		// }
		
		Object obj1 = "ABC";
		Object obj2 = new Scanner(System.in);
		Object obj3 = new Date();
		Object obj4 = 3; //auto boxing
		
		//list�� �߰���(����)
//		list.add("ABC");
//		list.add(new Date());
//		list.add(3);
//		System.out.println(list.size());
//		
//		// ��������
//		Object var1 = list.get(0);
//		Object var2 = list.get(1);
//		Date var3 = (Date) list.get(1);
//		System.out.println(var2);
//		System.out.println(var3);
		
		
		list.add("����");
		list.add("�ܿ�");
		list.add("����");
		
		Object var1 = list.get(0);
		Object var2 = list.get(1);
		Object var3 = list.get(2);
		
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var3);
		
		System.out.println(var1.getClass());
		
		// Generic Ÿ������ �����ϱ�
		List<String> list2 = new ArrayList<String>();
		// Ư�� �Ӽ��� ����Ʈ�� ������ �� �ְ� ����.
		
		list2.add("��Ʈ��");
//		list2.add(2145125); // ��Ʈ���� �ƴ� Ÿ���� �����Ϸ��� �ؼ� ����
		
		List<Board> list3 = new ArrayList<Board>();
		
		list3.add(new Board());
		Board var3_1 = list3.get(0);
		
		
		
	}
}

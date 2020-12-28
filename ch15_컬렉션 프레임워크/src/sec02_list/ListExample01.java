package sec02_list;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class ListExample01 {
	public static void main(String[] args) {
		
		List list = new ArrayList(); // 클래스 - 자식객체 or 인터페이스  - 구현객체
	
		// 사용가능한 구현객체: AbstractList, AbstractSequentialList, ArrayList, AttributeList, CopyOnWriteArrayList, 
		// LinkedList, RoleList, RoleUnresolvedList, Stack, Vector

//		list.add(//오브젝트)
				// 어떤 클래스건 object를 상속함.class ListExample (extends Object) <-얘가 생략되어있음.
				// 그러므로 method(Object obj)에서 obj에는 모든 객체가 올 수 있
		//void method(Object obj) {
		// }
		
		Object obj1 = "ABC";
		Object obj2 = new Scanner(System.in);
		Object obj3 = new Date();
		Object obj4 = 3; //auto boxing
		
		//list에 추가함(저장)
//		list.add("ABC");
//		list.add(new Date());
//		list.add(3);
//		System.out.println(list.size());
//		
//		// 가져오기
//		Object var1 = list.get(0);
//		Object var2 = list.get(1);
//		Date var3 = (Date) list.get(1);
//		System.out.println(var2);
//		System.out.println(var3);
		
		
		list.add("여름");
		list.add("겨울");
		list.add("가을");
		
		Object var1 = list.get(0);
		Object var2 = list.get(1);
		Object var3 = list.get(2);
		
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var3);
		
		System.out.println(var1.getClass());
		
		// Generic 타입으로 선언하기
		List<String> list2 = new ArrayList<String>();
		// 특정 속성만 리스트에 저장할 수 있게 선언.
		
		list2.add("스트링");
//		list2.add(2145125); // 스트링이 아닌 타입을 저장하려고 해서 에러
		
		List<Board> list3 = new ArrayList<Board>();
		
		list3.add(new Board());
		Board var3_1 = list3.get(0);
		
		
		
	}
}

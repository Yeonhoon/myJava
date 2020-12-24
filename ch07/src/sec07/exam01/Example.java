package sec07.exam01;

public class Example {

	public static void main(String[] args) {
		
		Child child = new Child(); // 자녀클래스의 객체 
		child.method1(); // 부모 상속 -> 부모의 method1 실행됨
		child.method2();
		child.method3();
		
		
		Parent parent = child;
		parent.method1();
		parent.method2(); // child의 method2가 실행됨. parent는 child의 객체를 따름. 재정의
//		
	}
}

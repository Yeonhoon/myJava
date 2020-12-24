package sec13.package1;

public class A {// public 없음 --> 같은 패키지 내에서만 사용 가능
	//field
	public int field;
	
	
	//Constructor
	
//	A a = new A();	//생성자에 private붙임. A를 벗어난 곳에서는 사용 불가.(클래스든 import든)
	
	public A() {
		method();
	}
	
	//method 
	
	public void method() { // public 붙으면 다른 패키지에서도 사용 가능함. private의 경우 생성된 클래스 내부에서만 사용됨.
		System.out.println("method() 실행");
	}
	
	public void method2() {
		method();
	}
	
}

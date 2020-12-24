package sec02.exam01;

public class A {
	//field
	int field;
	B b1 = new B();
	
	//Constructor
	public A() {
		B b2 = new B();
		b2.methodB();
	}
	//Method

	void method() {
		B b3 = new B();
		b3.methodB();
		b1.methodB();
	}
	//Nested(중첩클래스) //static이 없을 경우 A객체가 있어야 B객체 사용가능
	class B{//필드처럼 public private protected 올 수 있음.
		//field
		//Constructor
		//method
		void methodB() {
			System.out.println("MethodB 실행");
		}
		
	}
}

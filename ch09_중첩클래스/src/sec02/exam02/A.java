package sec02.exam02;

public class A {
	//field
	int field;
	B b1 = new B();
	
	//Constructor
	public A() {
		B b2 = new B();
		b2.methodB();
		b1.methodB();

	}
	//Method

	void method() {
		B b3 = new B();
	}

	//Nested(중첩클래스) 
	static class B{//필드처럼 public private protected 올 수 있음.
		//field
		//Constructor
		//method
		void methodB() {
			System.out.println("MethodB 실행");
		}
	}
}

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

	//Nested(��øŬ����) 
	static class B{//�ʵ�ó�� public private protected �� �� ����.
		//field
		//Constructor
		//method
		void methodB() {
			System.out.println("MethodB ����");
		}
	}
}

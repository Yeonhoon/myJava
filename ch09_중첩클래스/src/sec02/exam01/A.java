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
	//Nested(��øŬ����) //static�� ���� ��� A��ü�� �־�� B��ü ��밡��
	class B{//�ʵ�ó�� public private protected �� �� ����.
		//field
		//Constructor
		//method
		void methodB() {
			System.out.println("MethodB ����");
		}
		
	}
}

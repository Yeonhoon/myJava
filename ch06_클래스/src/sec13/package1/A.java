package sec13.package1;

public class A {// public ���� --> ���� ��Ű�� �������� ��� ����
	//field
	public int field;
	
	
	//Constructor
	
//	A a = new A();	//�����ڿ� private����. A�� ��� �������� ��� �Ұ�.(Ŭ������ import��)
	
	public A() {
		method();
	}
	
	//method 
	
	public void method() { // public ������ �ٸ� ��Ű�������� ��� ������. private�� ��� ������ Ŭ���� ���ο����� ����.
		System.out.println("method() ����");
	}
	
	public void method2() {
		method();
	}
	
}

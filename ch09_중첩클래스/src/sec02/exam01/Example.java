package sec02.exam01;

public class Example {
	public static void main(String[] args) {
		
		A a = new A();
		A.B b = a.new B(); //A��ü�� static�� ���� �ʾ��� ��, A��ü�� �־�� B����ü�� ���������
	}
}

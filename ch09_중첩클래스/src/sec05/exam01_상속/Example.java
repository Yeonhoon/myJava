package sec05.exam01_���;

public class Example {

	public static void main(String[] args) {

		Animal a1 = new Dog(); //��������� ��ü�� ����� �����Ҽ��� ������
		a1.sound();
		a1.eat();
		
		
		
		//----------------------------------------------------------------------
		Animal a2 = new Animal() { //Animal��ü�� ����� ���� �ƴ϶� Animal ��ü�� �ڽİ�ü�� ����� �θ�Ÿ���� Animal�� ����.
			@Override
			public void sound() {
				System.out.println("�߿�"); //��ü�� ���� �θ�Ÿ�Կ� ��������
			} //���(�ڽ�Ŭ������ ����)�� ���ÿ� ��ü�� ���� �� ��ü�� ����. ==> Ŭ������ ���� �������� �ʾƵ� ����.
			//Ŭ������ ���θ���.
		
		};
		a2.sound();
		a2.eat();
		//-----------------------------------------------------------------------
		//method(a1);
		//method(a2);
		method(new Animal() {
			@Override
			public void sound() {
				System.out.println("����"); //��ü�� ���� �θ�Ÿ�Կ� ��������
			} //���(�ڽ�Ŭ������ ����)�� ���ÿ� ��ü�� ���� �� ��ü�� ����.
		
		});
	
		
	}

	public static void method(Animal a) { // �߻�Ŭ������ ��ü ������.
		a.eat();
		a.sound();
		
	}
	
	
}

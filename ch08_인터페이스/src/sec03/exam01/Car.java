package sec03.exam01;

public class Car implements Flyable{

	@Override
	public void takeOff() {
		System.out.println("�ڵ��� �̷�");

		
	}

	@Override
	public void land() {
		System.out.println("�ڵ��� ����");
		
	}

	@Override
	public void fly() {
		System.out.println("�ڵ��� ����");
		
	}

}

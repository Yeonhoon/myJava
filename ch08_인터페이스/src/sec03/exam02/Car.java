package sec03.exam02;

public class Car implements Flyable, Sailable{

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

	@Override
	public void goOnWater() {
		// TODO Auto-generated method stub
		System.out.println("�ڵ��� �������");
	}

	@Override
	public void goUnderwater() {
		// TODO Auto-generated method stub
		System.out.println("�ڵ��� �������");
		
	}

}

package sec03.exam01;

public class Fighter implements Flyable{

	@Override
	public void takeOff() {
		System.out.println("������ �̷�");

	}

	@Override
	public void land() {
		System.out.println("������ ����");
		
	}

	@Override
	public void fly() {
		System.out.println("������ ����");
		
	}
	
}

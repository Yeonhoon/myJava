package sec03.exam01;

public class Fighter implements Flyable{

	@Override
	public void takeOff() {
		System.out.println("전투기 이륙");

	}

	@Override
	public void land() {
		System.out.println("전투기 착륙");
		
	}

	@Override
	public void fly() {
		System.out.println("전투기 비행");
		
	}
	
}

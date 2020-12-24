package sec03.exam01;

public class Car implements Flyable{

	@Override
	public void takeOff() {
		System.out.println("자동차 이륙");

		
	}

	@Override
	public void land() {
		System.out.println("자동차 착륙");
		
	}

	@Override
	public void fly() {
		System.out.println("자동차 비행");
		
	}

}

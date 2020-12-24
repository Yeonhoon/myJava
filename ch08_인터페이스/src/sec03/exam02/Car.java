package sec03.exam02;

public class Car implements Flyable, Sailable{

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

	@Override
	public void goOnWater() {
		// TODO Auto-generated method stub
		System.out.println("자동차 수상운행");
	}

	@Override
	public void goUnderwater() {
		// TODO Auto-generated method stub
		System.out.println("자동차 잠수운행");
		
	}

}

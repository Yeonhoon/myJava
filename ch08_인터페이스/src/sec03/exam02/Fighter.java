package sec03.exam02;



public class Fighter implements Flyable, Sailable  {

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

	@Override
	public void goOnWater() {
		System.out.println("전투기 해수면근접비행");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void goUnderwater() {
		System.out.println("전투기 잠수비행");
		// TODO Auto-generated method stub
		
	}
	
}

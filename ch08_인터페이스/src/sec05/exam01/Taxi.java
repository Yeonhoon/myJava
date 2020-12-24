package sec05.exam01;

public class Taxi implements Vehicle{

	@Override
	public void run() {
		System.out.println("택시가 달립니다.");
	}
	
	public void checkFare() {
		System.out.println("택시요금 지불");
	}

	
}

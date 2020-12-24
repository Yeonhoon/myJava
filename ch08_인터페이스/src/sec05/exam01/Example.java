package sec05.exam01;

public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//자동 변환: 인터페이스에 설명되어있는 것만 호출 가능.
		Vehicle vehicle = new Bus();
		vehicle.run();
		
		//강제변환: 인터페이스에 없는 메소드를 호출해야 할 경우.But 그런 경우 거의 드묾.
		Bus bus = (Bus) vehicle;
		bus.checkFare();
		
		Driver driver = new Driver();
		driver.drive(bus); // = driver.drive(new Bus());
		driver.drive(new Taxi()); // = driver.drive(new Bus());
		
		
	}

}

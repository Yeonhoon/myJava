package sec05.exam01;

public class Driver {

	public void drive(Vehicle vehicle) {//매개변수로 인터페이스를 넣는 이유: 다형성을 위해(택시도 있고, 버스도 있고), 매개변수 자리에는 인터페이스의 구현객체 올수있음.
		vehicle.run();
		if(vehicle instanceof Bus) { //구현 객체가 여러개일 경우 무작정 강제변환 안됨. 구현객체에 따라서 강제변환되게끔 해주어야함
			Bus bus = (Bus) vehicle;
			bus.checkFare();
		} else if(vehicle instanceof Taxi){
			Taxi taxi = (Taxi) vehicle;
			taxi.checkFare();
		}
	//타입이 잘못변환되면 ClassCastException 발생.
	}
	
}

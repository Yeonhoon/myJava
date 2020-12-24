package sec04;

import sec03.exam02.Car;
import sec03.exam02.Fighter;
import sec03.exam02.PassengerPlane;

public class Example {

	public static void main(String[] args) {
		
		Driver driver = new Driver();
		
		driver.driveFly(new Car()); //인터페이스로 사용한 가능한 객체 오기
		//Car 객체가 들어가서 car 객체가 실행됨.
		
		Car car = new Car();
		Fighter fighter = new Fighter();
		PassengerPlane pp = new PassengerPlane();
		
		driver.driveFly(car); // 새로운 객체 만들어서 대입해도 가능.
		driver.driveFly(fighter);
		driver.driveFly(pp);
		
		
		driver.driveShip(car);
		driver.driveShip(fighter);
		
		driver.driveFly(new SmartCar());
		driver.driveShip(new SmartCar());
		
		
	}

}

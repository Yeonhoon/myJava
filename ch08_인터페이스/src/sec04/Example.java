package sec04;

import sec03.exam02.Car;
import sec03.exam02.Fighter;
import sec03.exam02.PassengerPlane;

public class Example {

	public static void main(String[] args) {
		
		Driver driver = new Driver();
		
		driver.driveFly(new Car()); //�������̽��� ����� ������ ��ü ����
		//Car ��ü�� ���� car ��ü�� �����.
		
		Car car = new Car();
		Fighter fighter = new Fighter();
		PassengerPlane pp = new PassengerPlane();
		
		driver.driveFly(car); // ���ο� ��ü ���� �����ص� ����.
		driver.driveFly(fighter);
		driver.driveFly(pp);
		
		
		driver.driveShip(car);
		driver.driveShip(fighter);
		
		driver.driveFly(new SmartCar());
		driver.driveShip(new SmartCar());
		
		
	}

}

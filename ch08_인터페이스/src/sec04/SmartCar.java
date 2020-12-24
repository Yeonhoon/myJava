package sec04;

import sec03.exam02.Car;

public class SmartCar extends Car{

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("Smart가 비행합니다");
	}
	@Override
	public void goOnWater() {
		System.out.println("SmartCar가 바다 위 항해");
	}
	
	
	
}
	

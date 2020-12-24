package sec03.exam01;

import sec03.exam02.Sailable;

public class Example {
	public static void main(String[] args) {
		
		Flyable flyable = new Fighter();
		
		flyable.takeOff();
		flyable.fly();
		flyable.land();
		
		Flyable flyable2 = new PassengerPlane();
		flyable2.takeOff();
		flyable2.fly();
		flyable2.land();
		
	
	}
}

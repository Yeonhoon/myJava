package sec03.exam02;

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
		
	Sailable sailable= new Fighter();
		
		sailable.goOnWater();
		sailable.goUnderwater();
		
	}
}

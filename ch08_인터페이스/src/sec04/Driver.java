package sec04;

import sec03.exam02.Flyable;
import sec03.exam02.Sailable;

public class Driver {

	
	//Field
	
	//Constructor
	
	//Method
	public void driveFly(Flyable flyable) { //인터페이스로만 구성됨.
		flyable.takeOff();
		flyable.fly();
		flyable.land();
	}
	
	public void driveShip(Sailable sailable) {
		//인터페이스 구현한 객체를 넣을 수 있음(Car/fighter/passengerPlane) 마치 상속에서 매개변수 자리에 부모클래스와 자식클래스가 올 수 있는 것처럼.
		//Car는 인터페이스로 사용하도록 만들어졌기 떄문에(public Class implements 인터페이스명 )
		sailable.goOnWater();
		sailable.goUnderwater();
	}
	
	
}

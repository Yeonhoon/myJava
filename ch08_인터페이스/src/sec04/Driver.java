package sec04;

import sec03.exam02.Flyable;
import sec03.exam02.Sailable;

public class Driver {

	
	//Field
	
	//Constructor
	
	//Method
	public void driveFly(Flyable flyable) { //�������̽��θ� ������.
		flyable.takeOff();
		flyable.fly();
		flyable.land();
	}
	
	public void driveShip(Sailable sailable) {
		//�������̽� ������ ��ü�� ���� �� ����(Car/fighter/passengerPlane) ��ġ ��ӿ��� �Ű����� �ڸ��� �θ�Ŭ������ �ڽ�Ŭ������ �� �� �ִ� ��ó��.
		//Car�� �������̽��� ����ϵ��� ��������� ������(public Class implements �������̽��� )
		sailable.goOnWater();
		sailable.goUnderwater();
	}
	
	
}

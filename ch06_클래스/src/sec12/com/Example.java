package sec12.com;

import sec12.com.mycompany.Car;
import sec12.com.mycompany.SportsCar;
import sec12.com.yourcompany.Computer;

public class Example {

	public static void main(String[] args) {

		Car myCar = new Car(); //Car가 다른 패키지에 있기 때문에 실행이 불가능함. 따라서 import를 통해 사용해야 함(ctrl + shift + o).
		Computer myPC = new Computer();
		SportsCar ferrari = new SportsCar();
		sec12.com.yourcompany.Car yourCar = new 
				sec12.com.yourcompany.Car(); //다른 패키지 내부에 동일한 클래스가 있는 경우 전체명을 붙여줘야 함.

		
	}

}

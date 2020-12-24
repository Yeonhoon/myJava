package sec07;

public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car myCar = new Car(60); //myCar라는 변수에 새로운 객체를 생성한다. //객체를 만들 때 필드를 괄호 안의 값으로 바꾸어 시행.
		
//		System.out.println(myCar.company); //myCar라는 객체가 가지고 있는 값을 내놔라
//		System.out.println(myCar.speed); //myCar라는 객체가 가지고 있는 값을 내놔라
//		System.out.println(myCar.tire); //myCar라는 객체가 가지고 있는 값을 내놔라
//		System.out.println(myCar.navi); //myCar라는 객체가 가지고 있는 값을 내놔라
//		
//		// 기본적으로 저장되어 있는 필드값은 변경 가능함
//		// 필드값을 변경할때는 항상 참조변수를 통해서 변경함
//		myCar.speed = 100; // 객체 안에서 데이터 변경이 실행됨.
//		System.out.println(myCar.speed); //
//		
//		Car yourCar = new Car();
//		yourCar.speed= 1000;
//		System.out.println(yourCar.speed);
		
		Car car2 = new Car("삼성"/* 매개변수(argument) */);
		Car car3 = new Car("100");
		
		System.out.println(car2.company);
		System.out.println(car3.speed);
		
		Car2 car2_1 = new Car2(6461341);
		
		System.out.println(car2_1.company);
		System.out.println(car2_1.speed);
	}
}


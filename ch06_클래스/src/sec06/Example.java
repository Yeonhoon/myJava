package sec06;

public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car myCar = new Car(); //myCar라는 변수에 새로운 객체를 생성한다.
		
		System.out.println(myCar.company); //myCar라는 객체가 가지고 있는 값을 내놔라
		System.out.println(myCar.speed); //myCar라는 객체가 가지고 있는 값을 내놔라
		System.out.println(myCar.tire); //myCar라는 객체가 가지고 있는 값을 내놔라
		System.out.println(myCar.navi); //myCar라는 객체가 가지고 있는 값을 내놔라
		
		// 기본적으로 저장되어 있는 필드값은 변경 가능함
		// 필드값을 변경할때는 항상 참조변수를 통해서 변경함
		myCar.speed = 100; // 객체 안에서 데이터 변경이 실행됨.
		System.out.println(myCar.speed); //
		
		Car yourCar = new Car();
		yourCar.speed= 1000;
		System.out.println(yourCar.speed);

	}

}

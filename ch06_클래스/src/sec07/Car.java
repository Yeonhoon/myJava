package sec07;

public class Car {
	
	//Field: 고유 데이터, 상태 데이터, 부품
	String company ="Hyundai"; 
	int speed;
	Tire tire = new Tire(); // 기본 타입이 아닌 경우 새로운 클래스를 만들어 준다.
	boolean navi = true;
	
	
	
	//Constructor(생성자): 객체를 생성할 때에만 사용함. 생성자는 객체 안에 저장되지 않음.
	//생성자 오버로딩: 생성자를 여러개 생성하여 사용함. 조건: 각 생성자마다 생성자가 달라야 함.
	public Car() {
		//생성자는 클래스 이름과 똑같은 이름을 갖고 있어야 함.
		System.out.println("Car()가 실행되었습니다.");
	}

	public Car(String company /* 매개변수(argument) */) {
		//생성자는 클래스 이름과 똑같은 이름을 갖고 있어야 함.
		System.out.println("Car(String company)가 실행되었습니다.");
		this.company =company; //
	}

	public Car(int speed) {
		//생성자는 클래스 이름과 똑같은 이름을 갖고 있어야 함.
		System.out.println("Car(int speed)가 실행되었습니다.");
		this.speed = speed;
	}
	
	public Car(String company, int speed) {
		//생성자는 클래스 이름과 똑같은 이름을 갖고 있어야 함.
		System.out.println("Car(int speed)가 실행되었습니다.");
		this.company = company;
		this.speed = speed;
							
	}
	
	public Car(int speed, String company) {
		System.out.println("Car(int speed, String company) 실행");
		this.speed = speed;
		this.company = company;
	}
	
	
	//같은 클래스의 이름을 가진 복수의 생성자;
	//생성자의 역할은 객체의 초기화 작업을 어떻게 할 것인지?
	
	//Method
}

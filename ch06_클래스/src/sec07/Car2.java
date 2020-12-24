package sec07;

public class Car2 {
	
	//Field: 고유 데이터, 상태 데이터, 부품
	String company ;
	int speed;
	Tire tire ; // 기본 타입이 아닌 경우 새로운 클래스를 만들어 준다.
	boolean navi ;
	
	// 생성자 각각 비슷함 --> 중복을제거해주어야 함.
	// 가장 많은 매개변수를 가지고 있는 생성자를 선택해서 다른 생성자들이 그것을 호출하게 해야 함.
	
	public Car2() {
		this(0,"현대");
	}

	public Car2(String company /* 매개변수(argument) */) {
		this(0, company);
	}

	public Car2(int speed) {
		this(speed, "현대");

	}
	
	public Car2(String company, int speed) {
		//생성자는 클래스 이름과 똑같은 이름을 갖고 있어야 함.
		this(speed, company); // 현재 객체가 갖고 있는 생성자 호출.(맨 마지막 생성자를 호출함)

	}
	
	public Car2(int speed, String company) {
		
		System.out.println("Car2의 speed와 company명을 출력합니다");
		this.speed = speed;
		this.company = company;
		tire = new Tire();
		navi = true;
	}
	
	//Method
}

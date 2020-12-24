package sec07.exam02_필드다형성;

public class Example {
	public static void main(String[] args) {
		
		Car myCar = new Car();
			
		myCar.tire.roll(); // tire(부모) 실행
			
		// 부모클래스 변수 <- 자식 객체
		myCar.tire = new HankookTire(); //부모 객체에 자식 객체 대입 가능.
		myCar.tire.roll(); //Hankook 자식이 대입이 됐기 때문에 재정의된 roll이 실행됨.
		
		myCar.tire = new KumhoTire();
		myCar.tire.roll(); //kumhoTire 자식이 대입이 됐기 때문에 재정의된 roll이 실행됨.
 		
		//매개변수의 다형성: 매개변수 자리에 부모객체 뿐만 아니라 자식객체 역시 들어갈 수 있다.
		myCar.run(new Tire());
		myCar.run(new HankookTire());
		myCar.run(new KumhoTire());
		
		
		
		
		
	}
}

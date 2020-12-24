package sec04_메소드_재정의;

public class SportsCar extends Car{
	//field
	
	//Constructor
	
	//Method Overriding

	//상속을 받는 경우 부모의 메소드를 자식에서 재정의해야하는 경우==> ctrl+ space => run확인후 enter
	
	@Override
	public void run() {
		System.out.println("SportsCar-run() 실행");
		super.run(); //부모의 메소드 실행하기
	}

	
		
		
	
}

package sec13.package1;

public class B { // 클래스 내에서 다른 클래스 객체 사용 하기: 필드는 클래스 어디에서나 사용 가능. 퍼블릭이 안붙어있으면 다른 패키지에서 사용 불가.(=import가 불가) 
	
	//field
	A a1 = new A(); //B객체가 메모리에서 없어지면 객체도 사라짐
	// 클래스에서는 선언문만 가능하지 실행문은 불가능함. 변수에 값을 저장하는 실행문은 불가능함.
	
	
	//Constructor
	//생성자와 메소드에서 만든 객체는 각각에서 사용되고 나서 없어짐
	// 생성자의 역할: 객체 생성시 초기화, 어디에서 객체를 만들건지 정하기.

	B() {
		A a2 = new A();
		a2.field = 5;
	}
	
	
	// Method
	
	void method() {
		A a3 = new A();
		a3.field = 7;
	}
	
	
}

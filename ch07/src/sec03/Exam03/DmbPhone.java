package sec03.Exam03;

public class DmbPhone extends Cellphone{
	
	//field
	
	//Constructor
	public DmbPhone(String owner) {
		super(owner); // extends 붙일경우 컴파일러는 자동으로 super()(=부모생성자 호출코드)를 붙임. super()는 항상 먼저 호출되어야함.
		// 보통 고정값은 넣지 않음
		// 생략할 경우 super();가 됨. 이럴 경우 컴파일 오류
		// 명시적으로 하기 위해 super(aa);로 붙여줘야 함.
		System.out.println("DmbPhone() 실행완료");
	}
	
	//Method
	
}

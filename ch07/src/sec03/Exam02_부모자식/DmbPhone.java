package sec03.Exam02_부모자식;

public class DmbPhone extends Cellphone{
	
	//field
	
	//Constructor
	public DmbPhone(String owner) {
		super("어쩌라고"); // extends 붙일경우 컴파일러는 자동으로 super()(=부모생성자 호출코드)를 붙임. super()는 항상 먼저 호출되어야함.
		// 보통 고정값은 넣지 않음
		this.owner = owner;
		System.out.println("DmbPhone() 실행완료");
	}
	
	//Method
	
}

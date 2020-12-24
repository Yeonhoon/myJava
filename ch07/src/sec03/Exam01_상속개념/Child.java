package sec03.Exam01_상속개념;

public class Child extends Parent { //상속 표시자 extends (부모클래스 이름)
	
	//Field
	int field2; // 상속하기 위해서는 public 붙어있어야함.
	
	//Constructor
		
	
	//Method
	void method2(int field2) {
		System.out.println("method2() 실행: " + field2);
	}
}

package sec10;

public class Calculator {
	//field
	String company;
	static double pi = 3.14159; //공통된 값 고정 ==> 메모리 효율 증가
	double memory;
	
	
	
	//Method

	static double circleArea(double r) {
		double area = r * r * pi; // 인스턴스 필드값 없음 ==> static 붙여주어야 함
		return area;
		
		//static임 ==> 객체 생성할 필요 없이 클래스 명으로 호출
	}
	
	void setMemory(double r) {
		double result = circleArea(r);
		memory = result; // memory라는 field값을 사용했기 때문에 static 붙여주면 안됨.
		// static 아님 ==> 객체 생성하여 호출.
	}
	
	static void method1() { // 인스턴스 필드값 없음 ==> 객체가 없어도 실행이 되기 때문에 static 붙여주자.
		String name = "홍길동"; // 이건 필드값이 아니라 변수임.
		int round = 3;
		System.out.println("날씨가 추워요");
	}
	
	void method2() {
		this.company = "삼성"; //this: 객체 자신.객체가 없으면 쓸 수 없음. 즉 static에서는 쓸 수 없음.
		setMemory(10);
		System.out.println("날씨가 추워요");
	}








}

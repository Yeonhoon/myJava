package sec05_final.exam02;

public class Example {

	public static void main(String[] args) {

		Calculator calc = new Calculator(); // 계산기로 실행
		Computer calc2 = new Computer(); // 컴퓨터로 실행(컴퓨터에서 더 정확하게 실행하기 위해 자식 클래스인 컴퓨터에서 메소드 재정의)
		calc.circleArea(10);
		calc2.circleArea(10);
		
		calc.rectangleArea(10, 3);
		calc2.rectangleArea(10, 3);

	}

}

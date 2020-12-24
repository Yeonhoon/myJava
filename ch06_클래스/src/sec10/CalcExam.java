package sec10;

public class CalcExam {

	public static void main(String[] args) {
		
		//바람직한 코드
		double area = 5*5*Calculator.pi;
		double area2 = Calculator.circleArea(5);		
		System.out.println(area);
		System.out.println(area2);
		
		//바람직하지 않은 코드
		Calculator calc = new Calculator();
		double area3 = 5*5*calc.pi; // pi는 static이라 객체가 필요없는데 객체를 생성하였음. 쓸데없는 메모리 낭비.
		double area4 = calc.circleArea(5);
		System.out.println(area3);
		System.out.println(area4);

	}

}

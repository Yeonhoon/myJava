package sec08;

public class Example {

	public static void main(String[] args) {
		
		Calculator myCalc = new Calculator(); //변수선언
		
		//메소드 호출
		myCalc.print2("a");
		myCalc.print("경찰병원");
		myCalc.print("목요일", -100);
		myCalc.print("배고파");

		
		int result = myCalc.plus(50,100);
		byte a=3; byte b=5;
		double result2 = myCalc.plus(a,b); // 변수 타입의 범위가 포함되기 때문에 byte로 해도 괜춘.
		System.out.println(result);
		
		String result3 = myCalc.join("010", "5012");
		System.out.println(result2);
	
		//배열 메소드 호출
		int[] scores = {90,80,90,70,57,35,82,8435,321,687,54,684,654,6897,32,64,8,73,5};
		int result4 = myCalc.sum(scores);
		System.out.println(result4);
		
		int result5 = myCalc.sum2(654,321,654,3,687,2,68,32,687,4);
		System.out.println(result5);
				
		String [] lines = {"a","b","c","d"};
		String result6 = myCalc.append(lines);
		System.out.println(result6);
		
		Car myCar = new Car();
		myCar.setSpeed(100);
		myCar.run(100);
	
	
	
	
	
	}

}

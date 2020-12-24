package sec08;

public class Calculator {

	// field;

	// constructor
	Calculator() {

	}

	// 생성자와 메소드의 차이
	// 생성자는 클래스와 무조건 같은 이름, 메소드는 무조건 다른 이름이어야 함.
	// 메소드에는 이름 앞에 void 가 붙음. 즉 실행하고 끝남.

	// method
	void print (String message) {
		for(int i=0;i<5;i++) {
			System.out.println(message);
			if(i==2) {
				break;
			}
			
		}
		System.out.println("종료한다");
	}

	void print2(String message) {
		System.out.println(message);
	}

	void print(String message, int temp) {
		System.out.println(message);
		System.out.println("온도:" + temp);
	}

	// 메소드 선언
	int plus(int x, int y) {
		int result = x + y;
		return result;
	}

	String join(String s1, String s2) {
		String result = s1 + "+" + s2;
		return result;
	}

	// 배열 메소드 선언/
	
	  int sum(int[] arr) { int sum = 0; for(int value : arr) { sum += value; }
	  return sum; }
	 

	String append(String[] arr2) {
		String line = "";
		for (String value : arr2) {
			line += value;
		}
		return line;
	}

	int sum2(int... arr) { // ...: 개수를 모르는 매개변수 타입 받음. 몇개인지 모르겠다는 것 의미. 
		int sum = 0;
		if(arr == null) {
			System.out.println("입력변수가 없습니다");
			}
		for (int value : arr) {
			sum += value;
		}
		return sum;
	}
	
	
	

}

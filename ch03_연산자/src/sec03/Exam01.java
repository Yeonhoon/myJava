package sec03;

public class Exam01 {

	public static void main(String[] args) {
		// 단항연산자: 피연산자가 1개인 연산자
		// 증감연산자
		int var1 =1; // 변수선언
		//1씩 증가
		var1++;
		++var1;
		System.out.println("var1:" + var1);
		
		var1--;
		--var1;
		System.out.println("var1:" + var1);
		
		// 다른 연산자와 같이 사용할 경우 주의
		int var2 = 1;
		int var3 = var2+ 5;
		System.out.println("var3:" + var3);
		
		// ++가 앞에 있을 경우
		// ++가 뒤에 있을 경우: 최후의 연산만. 단독으로 변수 앞에 쓸것. 뒤에 쓰면 다른 연산자랑 겹침

		//원래 변수의 값을 변경하는 연산식
		 int var4 = 1;
		 var4 += 3; 
		 var4 -= 3;
		 var4 *= 3;
		 var4 /= 3;
		 
		 // 논리값을 부정하는 연산식
		 boolean var5 = false;
		 boolean var6 = !var5;   
		

	}

}

package sec02;

public class Exam01 {
	
	public static void main(String[] args) {
		//정수 타입에 따라 숫자의 입력범위가 다름.
		byte var1 = 10;
		short var2 = 10;
		int var3 = 10; // 숫자를 넣을 때는 기본적으로 int라고 가정함.
		long var4 = 5000000000000L;
		
		System.out.println(var1+var2+var3+var4);
		
		// 실수 타입(= 소수점이 있는 수)의 종류
		float var5 = 3.14132136546846513215F;  // 출력되는 자리수도 다름. 소숫점 자리수 float< double
		double var6 = 3.1413213654684651324584654684353213654; //실수 타입은 기본적으로 double이라고 가정함. float을 쓰고 싶으면 F를 붙여줘야 함
		
		System.out.println(var5);
		System.out.println(var6);
		
		// 문자 타입
		char var7 = 'a';
		
		// 문자열 타입
		String var8 = "abc"; // 큰따옴표는 String으로 선언하라는 것을 의미
		
		System.out.println(var7 + var8);
		
		// 논리타입(T/F)
		boolean var9 = true; // true or false만 와야함.
		boolean var10 = false; // true or false만 와야함.
		
		System.out.println("var9:" + var9);
		System.out.println("var10:" + var10);
	

	}
}

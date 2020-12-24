package sec04_산술논리연산;

public class Exam01 {

	public static void main(String[] args) {
		// 산술연산(사칙연산)시 주의할 점
		
		//long이 아닌 정수의 변수 연산결과는 int값임.
		int var1= 10;
		int var2 = 2;
		int var3 = var1 + var2;
		byte var4 = 10+2;
		// 변수가 생성도어 연산되면 int 타입으로 변환.(왜?)
		
		// long 변수의 연산결과는 long
		int var5 = 10;
		long var6 = 20;
		long var7 = var5 + var6;
		
		// 정수의 나눗셈은 정수
		int var8 = 11;
		int var9 =4;
		double var10 = var8/var9;
		System.out.println("var10:" + var10); //결과: 2.0. 2.5가 안나옴. 정수이므로 소수점 버림.
		
		// 소수점 이하를 얻고 싶으면 실수 연산식으로 변경해야함.
		double var11 =1.0 * var8 / var9;
		var11 = (double)var8/ (double)var9; //변수 하나만 바꾸면 다른 쪽도 바뀜.
		System.out.println("var11:"+var11); //결과: 2.5
		
		// 나머지 구하는 방법
		int var12 = var8 % var9;
		System.out.println("var12:"+var12); 
	}
	
}

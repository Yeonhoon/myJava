package sec03;

public class Exam01_참조변수 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 메소드: class 파일의 코드를 메소드에 올림(loading). 코드가 저장되는 영역(=정적영역) 
		 * 힙(heap): 참조변수로 저장된 번지가 저장됨(=객체가 생성되는 영역)
		 * 스택(stack): 메소드에 저장된 변수를 실행할 시 변수가 스텍에 생성됨. 참조변수일 경우 변수와 힙의 번지가 저장됨. 
		 * 
		 */		

		// 값의 비교 ('==', '!=')
		// 1. 기본 타입의 경우 값을 비교
		// 2. 참조 타입의 경우 값을 비교하는 것이 아니라 번지를 비교하는 것임.
		
		int var1 = 10;
		int var2 = 100;
		int var3 = 100;
		
		System.out.println(var1 == var2);
		System.out.println(var1 == var3);
		System.out.println(var2 == var3);
		
		
		int[] var4 = {10};
		int[] var5 = {100};
		int[] var6 = {100}; // int[] var6 = var5: var6와 var5를 같은 번지로 대입하겠다.
	
	
		System.out.println(var4 == var5); //false
		System.out.println(var4 == var6); //false
		System.out.println(var6 == var5); //false  <== 번지수가 다르기 때문.참조변수는 변수에 값이 저장되는 것이 아니라 힙의 번지수가 대입이 됨.
	}	
	

}

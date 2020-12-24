package sec04_산술논리연산;

public class Exam03 {

	public static void main(String[] args) {
		// 논리연산(논리합, 논리곱)
		
		boolean var1 = true;
		boolean var2 = false;
		boolean var3 = var1 && var2; //논리곱: 두개 모두 true 여야 true
		boolean var4 = var1 || var2; //논리합: 하나만 true 면 true
		System.out.println(var3);
		System.out.println(var4);
	
		
		int var5= 11;
		int var6 = 4;
		boolean var7 = (var5 % var6 ==0 ) || (var5%2!=0); // 논리연산을 위해서|true, false로 산출되는 연산식이 나와야 함
		System.out.println(var7);
				
	}
}

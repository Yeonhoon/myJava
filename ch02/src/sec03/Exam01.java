package sec03;

public class Exam01 {

	public static void main(String[] args) {
		// 자동타입 변환
		byte var1 = 10;
		short var2 = var1;
		int var3 = var1;
		long var4 = var1;
		System.out.println(var1 + var2 + var3+ var4);
		
		// 강제타입변환(int)
		long var5 = 200;
		int var6 = (int)var5; //자신보다 큰 타입에 담을 수는 없음(long -> int) 따라서 앞에 (int) 붙여줘야 함. 
		short var7 = (short)var5; // (int) 쪼개서 나머지 부분만 저장하겠다
		byte var8 = (byte)var5; // byte의 값을 넘어가는 경우 짤려서 나옴. ==> 잘못 변환된 값
		
		System.out.println("var8:" + var8);
		
		
		// 문자열을 정수 또는 실수로 변환
		String var9 = "300";
		int var10 = Integer.parseInt(var9); // 문자열을 정수로
		
		String var11 = "300.14";
		double var12 = Double.parseDouble(var11); //문자열을 실수로

	}

}

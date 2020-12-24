package sec01;

public class remind {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		byte var1 = 10;
		int var2 = 20;
		short var3 = 30;
		long var4 = 40;
		
		float flt = 12.12431251212513F;
		double dbl = 3.171251245123465651;
		
		char chr = 'a';
		String str = "Laughter is the best medicine";
		boolean bln = true;
	
	System.out.println(var1 + var2 + var3 + var4+ flt + dbl + "\n"+ chr + str);
	// 변환
	int var5 = 50;
	long var6 = (int) var5;
	// 강제변환
	long var7 = 987654310;
	byte var8 = (byte) var7;
	
	System.out.println(var8);

	// 문자열을 숫자로 변환
	String xx = "300";
	int xx2 = Integer.parseInt(xx);
	System.out.println(xx2);
	
	String yy = "3.14";
	double yy2 = Double.parseDouble(yy);
	System.out.println(yy2);
	
	//연산자
	int var10 = 1;
	var10 /=3; 
	System.out.println((float)var10);
	
	//boolean
	int k1= 30; int k2= 40;
	boolean bln2 = k1 != k2;
	
	String t1 = "hi"; String t2 = "Hello";
	boolean bln3 = t1 == t2;
	System.out.println(bln2);
	System.out.println(bln3);
	
	boolean bln4= bln2 && bln3; // 둘다 true 여야 true
	boolean bln5= bln2 || bln3; // 하나만 true 면 true
	System.out.println(bln4);
	System.out.println(bln5);
	

	}
	

}

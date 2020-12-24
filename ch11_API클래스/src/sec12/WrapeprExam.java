package sec12;

public class WrapeprExam {
	public static void main(String[] args) {
	
		//wrapper 객체
		
		
		int var1 = 3; //기본타입
		Integer var2 = new Integer(3); // 참조타입
		Integer var3 = 3; // Auto Boxing: 참조타입 객체를 만들고 변수에 번지가 저장되는 과정이 생략됨.
	
		int var4 = var3; // Auto Unboxing
		
		double var5= 2.5; //기본타입 
		Double var6= 2.5; //참조타입
		
		double var7 = var6;
		
	
	}
}

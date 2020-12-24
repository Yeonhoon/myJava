package sec04;

public class Exam01_null {
	public static void main(String[] args) {
		// 자바에서 null의 의미: 번지가 없다. 즉 참조변수에서만 사용 가능.
		
		//int x = null; // 기본타입의 변수는 null값이 들어갈 수 없음.
		
		//참조타입 변수
		String var1 = null; 
		int[] var5 = null;
		
		// 널 비교
		String var6 = "data";
		String var7 = null;
		System.out.println(var6 == null); //var6은 번지가 없는가?
		System.out.println(var6 != null); //var6은 번지가 있는가?
		System.out.println(var7 == null); //var7은 번지가 없는가?
		System.out.println(var7 != null); //var7은 번지가 있는가?
		
		
	}
}

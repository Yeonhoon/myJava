package sec04;

public class Exam02_nullpointerexception {
	public static void main(String[] args) {
		String var1 = "123456-1235467";
		int num1 = var1.length();  //var1의 번지로 가서 그 값의 길이를 저장하라
		System.out.println(num1);
		
		String var2 = null;
		if(var2 != null){
			int num2 = var2.length();  
			System.out.println(num2); //var2의 번지가 null이므로 에러 나옴.(nullpointerexception: null인 상태에서 기능을 사용할 수 없음.)
		}
		// nullpointerexception ==> 실행시키기 위해서는 null을 바꿔주어야 함.

	}

}

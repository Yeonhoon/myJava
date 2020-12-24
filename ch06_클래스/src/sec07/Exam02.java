package sec07;

public class Exam02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str1 = "ABC";
		String str2 = new String("ABC");
		
		byte [] arr= {65,66,67}; 
		String str3 = new String(arr); //문자코드로 불러오기
		
		System.out.println(str3);
		
		char[] arr2 = {'A','B','C'};
		String str4 = new String(arr2);
		System.out.println(str4);
		
		int[] arr3 = {65,66,67};
		//String str5 = new String(arr3); //String의 생성자에는 int 배열만 받는 것이 없음.
		
	}

}

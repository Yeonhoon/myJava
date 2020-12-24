package sec07_string;

public class StringExam01_추출 {

	public static void main(String[] args) {
		
		
		//charAt
		String ssn = "123456-1234567";
		char sex = ssn.charAt(7);
		
		if(sex=='1'|| sex=='3') {
			System.out.println("남");
		} else {
			System.out.println("여");
		}
			
		// 부분 문자열 가져오기 substring(from, to)
		String first = ssn.substring(0,6);
		String second = ssn.substring(7);
		System.out.println(first);
		System.out.println(second);
		
		// 구분자 이용하여 분리하기 .split(regex: 구분 기준)
		String[] arr = ssn.split("-");
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		
		String tel = "010-5012-7795";
		String [] arr2 = tel.split("\\.");
		for(int i = 0; i<arr2.length;i++) {
			System.out.println(arr2[i]);
		}
	}
}

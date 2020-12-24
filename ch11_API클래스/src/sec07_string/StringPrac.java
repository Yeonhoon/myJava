package sec07_string;

public class StringPrac {
	public static void main(String[] args) {

		// 1. length
		String x = "My name is Jang Yeonhoon";
		int result = x.length();
		System.out.println(result);

		// 2. equals(); 문자열 자체가 같은지 비교. ==는 객체가 같은지 비교
		String s1 = "JYH";
		String s2 = "jyh";
		System.out.println(s1.equals(s2));

		// 3. charAt(int); 괄호안의 숫자 자리에 무슨 문자가 있는지
		String s3 = "940123-115729";
		System.out.println(s3.charAt(1));

		// 4. substring(a,b): 문자열의 a부터 b까지 가져오기
		String x2 = "서울특별시 관악구 쑥고개로21길 30 경동오피스텔 406호";
		System.out.println(x2.substring(0, 10));

		// 5. split(regex); regex를 기준으로 문자를 나누기(array로 구현됨)
		String[] arr = x2.split(" ");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

		// 6. toLowerCase(), toUpperCase(); 대문자화, 소문자화
		String a1 = "abcdefg";
		String a2 = "ABCDEFG";
		System.out.println(a1.equals(a2.toLowerCase()));

		// 7.replace(A,B); 문자열에서 A를 B로 바꾸기
		String a3 = "NIKE ASICS REEBOK PUMA DESCENT NEWERA";
		System.out.println(a3.replace("E", "e"));
		// ** replaceAll()은 정규식도 가능
		String[] arr2 = a3.split(" ");
		for (int i = 0; i < arr2.length; i++) {
			System.out.println(arr2[i].replaceAll("A$", "aaaaaaaaaaaaa"));
		}
		
		// 8. contain(); 특정 단어 포함여부
		System.out.println(x2.contains("서울")); // boolean true false
		
		// 9. indexOf(""); ""가 포함되어 있는 위치  lastIndexOf(""); ""의 마지막번째 위치
		System.out.println(x2.indexOf("서울")); 
		String num = "010-5012-7795-010-5240-9233";
		System.out.println(num.lastIndexOf("-"));
		
		
		

	}
}

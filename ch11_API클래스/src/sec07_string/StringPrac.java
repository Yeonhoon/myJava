package sec07_string;

public class StringPrac {
	public static void main(String[] args) {

		// 1. length
		String x = "My name is Jang Yeonhoon";
		int result = x.length();
		System.out.println(result);

		// 2. equals(); ���ڿ� ��ü�� ������ ��. ==�� ��ü�� ������ ��
		String s1 = "JYH";
		String s2 = "jyh";
		System.out.println(s1.equals(s2));

		// 3. charAt(int); ��ȣ���� ���� �ڸ��� ���� ���ڰ� �ִ���
		String s3 = "940123-115729";
		System.out.println(s3.charAt(1));

		// 4. substring(a,b): ���ڿ��� a���� b���� ��������
		String x2 = "����Ư���� ���Ǳ� ������21�� 30 �浿���ǽ��� 406ȣ";
		System.out.println(x2.substring(0, 10));

		// 5. split(regex); regex�� �������� ���ڸ� ������(array�� ������)
		String[] arr = x2.split(" ");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

		// 6. toLowerCase(), toUpperCase(); �빮��ȭ, �ҹ���ȭ
		String a1 = "abcdefg";
		String a2 = "ABCDEFG";
		System.out.println(a1.equals(a2.toLowerCase()));

		// 7.replace(A,B); ���ڿ����� A�� B�� �ٲٱ�
		String a3 = "NIKE ASICS REEBOK PUMA DESCENT NEWERA";
		System.out.println(a3.replace("E", "e"));
		// ** replaceAll()�� ���Խĵ� ����
		String[] arr2 = a3.split(" ");
		for (int i = 0; i < arr2.length; i++) {
			System.out.println(arr2[i].replaceAll("A$", "aaaaaaaaaaaaa"));
		}
		
		// 8. contain(); Ư�� �ܾ� ���Կ���
		System.out.println(x2.contains("����")); // boolean true false
		
		// 9. indexOf(""); ""�� ���ԵǾ� �ִ� ��ġ  lastIndexOf(""); ""�� ��������° ��ġ
		System.out.println(x2.indexOf("����")); 
		String num = "010-5012-7795-010-5240-9233";
		System.out.println(num.lastIndexOf("-"));
		
		
		

	}
}

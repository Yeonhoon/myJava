package sec07;

public class Exam02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str1 = "ABC";
		String str2 = new String("ABC");
		
		byte [] arr= {65,66,67}; 
		String str3 = new String(arr); //�����ڵ�� �ҷ�����
		
		System.out.println(str3);
		
		char[] arr2 = {'A','B','C'};
		String str4 = new String(arr2);
		System.out.println(str4);
		
		int[] arr3 = {65,66,67};
		//String str5 = new String(arr3); //String�� �����ڿ��� int �迭�� �޴� ���� ����.
		
	}

}

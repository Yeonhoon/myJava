package sec04;

public class Exam02_nullpointerexception {
	public static void main(String[] args) {
		String var1 = "123456-1235467";
		int num1 = var1.length();  //var1�� ������ ���� �� ���� ���̸� �����϶�
		System.out.println(num1);
		
		String var2 = null;
		if(var2 != null){
			int num2 = var2.length();  
			System.out.println(num2); //var2�� ������ null�̹Ƿ� ���� ����.(nullpointerexception: null�� ���¿��� ����� ����� �� ����.)
		}
		// nullpointerexception ==> �����Ű�� ���ؼ��� null�� �ٲ��־�� ��.

	}

}

package sec04;

public class Exam01_null {
	public static void main(String[] args) {
		// �ڹٿ��� null�� �ǹ�: ������ ����. �� �������������� ��� ����.
		
		//int x = null; // �⺻Ÿ���� ������ null���� �� �� ����.
		
		//����Ÿ�� ����
		String var1 = null; 
		int[] var5 = null;
		
		// �� ��
		String var6 = "data";
		String var7 = null;
		System.out.println(var6 == null); //var6�� ������ ���°�?
		System.out.println(var6 != null); //var6�� ������ �ִ°�?
		System.out.println(var7 == null); //var7�� ������ ���°�?
		System.out.println(var7 != null); //var7�� ������ �ִ°�?
		
		
	}
}

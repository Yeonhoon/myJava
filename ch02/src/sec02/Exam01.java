package sec02;

public class Exam01 {
	
	public static void main(String[] args) {
		//���� Ÿ�Կ� ���� ������ �Է¹����� �ٸ�.
		byte var1 = 10;
		short var2 = 10;
		int var3 = 10; // ���ڸ� ���� ���� �⺻������ int��� ������.
		long var4 = 5000000000000L;
		
		System.out.println(var1+var2+var3+var4);
		
		// �Ǽ� Ÿ��(= �Ҽ����� �ִ� ��)�� ����
		float var5 = 3.14132136546846513215F;  // ��µǴ� �ڸ����� �ٸ�. �Ҽ��� �ڸ��� float< double
		double var6 = 3.1413213654684651324584654684353213654; //�Ǽ� Ÿ���� �⺻������ double�̶�� ������. float�� ���� ������ F�� �ٿ���� ��
		
		System.out.println(var5);
		System.out.println(var6);
		
		// ���� Ÿ��
		char var7 = 'a';
		
		// ���ڿ� Ÿ��
		String var8 = "abc"; // ū����ǥ�� String���� �����϶�� ���� �ǹ�
		
		System.out.println(var7 + var8);
		
		// ��Ÿ��(T/F)
		boolean var9 = true; // true or false�� �;���.
		boolean var10 = false; // true or false�� �;���.
		
		System.out.println("var9:" + var9);
		System.out.println("var10:" + var10);
	

	}
}

package sec04_���������;

public class Exam01 {

	public static void main(String[] args) {
		// �������(��Ģ����)�� ������ ��
		
		//long�� �ƴ� ������ ���� �������� int����.
		int var1= 10;
		int var2 = 2;
		int var3 = var1 + var2;
		byte var4 = 10+2;
		// ������ �������� ����Ǹ� int Ÿ������ ��ȯ.(��?)
		
		// long ������ �������� long
		int var5 = 10;
		long var6 = 20;
		long var7 = var5 + var6;
		
		// ������ �������� ����
		int var8 = 11;
		int var9 =4;
		double var10 = var8/var9;
		System.out.println("var10:" + var10); //���: 2.0. 2.5�� �ȳ���. �����̹Ƿ� �Ҽ��� ����.
		
		// �Ҽ��� ���ϸ� ��� ������ �Ǽ� ��������� �����ؾ���.
		double var11 =1.0 * var8 / var9;
		var11 = (double)var8/ (double)var9; //���� �ϳ��� �ٲٸ� �ٸ� �ʵ� �ٲ�.
		System.out.println("var11:"+var11); //���: 2.5
		
		// ������ ���ϴ� ���
		int var12 = var8 % var9;
		System.out.println("var12:"+var12); 
	}
	
}

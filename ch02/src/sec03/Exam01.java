package sec03;

public class Exam01 {

	public static void main(String[] args) {
		// �ڵ�Ÿ�� ��ȯ
		byte var1 = 10;
		short var2 = var1;
		int var3 = var1;
		long var4 = var1;
		System.out.println(var1 + var2 + var3+ var4);
		
		// ����Ÿ�Ժ�ȯ(int)
		long var5 = 200;
		int var6 = (int)var5; //�ڽź��� ū Ÿ�Կ� ���� ���� ����(long -> int) ���� �տ� (int) �ٿ���� ��. 
		short var7 = (short)var5; // (int) �ɰ��� ������ �κи� �����ϰڴ�
		byte var8 = (byte)var5; // byte�� ���� �Ѿ�� ��� ©���� ����. ==> �߸� ��ȯ�� ��
		
		System.out.println("var8:" + var8);
		
		
		// ���ڿ��� ���� �Ǵ� �Ǽ��� ��ȯ
		String var9 = "300";
		int var10 = Integer.parseInt(var9); // ���ڿ��� ������
		
		String var11 = "300.14";
		double var12 = Double.parseDouble(var11); //���ڿ��� �Ǽ���

	}

}

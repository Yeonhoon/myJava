package sec04_���������;

public class Exam03 {

	public static void main(String[] args) {
		// ������(����, ����)
		
		boolean var1 = true;
		boolean var2 = false;
		boolean var3 = var1 && var2; //����: �ΰ� ��� true ���� true
		boolean var4 = var1 || var2; //����: �ϳ��� true �� true
		System.out.println(var3);
		System.out.println(var4);
	
		
		int var5= 11;
		int var6 = 4;
		boolean var7 = (var5 % var6 ==0 ) || (var5%2!=0); // �������� ���ؼ�|true, false�� ����Ǵ� ������� ���;� ��
		System.out.println(var7);
				
	}
}

package sec04_���������;

public class Exam02 {
	
	public static void main(String[] args) {
		// �� ����
		
		//1. ���� ��
		int var1 = 3;
		int var2 = 4;
		boolean var3 = var1 != var2;
		System.out.println("result: " + var3); //����: == , �ٸ���: !=
		
		//2. ���ڿ� ��
		String var4 = "java";
		String var5 = "Java";
		boolean var6 = var4.equals(var5);
		boolean var7 = !var4.equals(var5);
		
		System.out.println("result: " + var6);
		System.out.println("result2: " + var7);
		
		//3. ��ᳺ�
		int var8 = 3;
		int var9 = 5;
		boolean var10 = var8 >= var9;
		boolean var11 = !(var8 >= var9);

		System.out.println("result: " + var10);
		System.out.println("result2: " + var11);
		
	}
}

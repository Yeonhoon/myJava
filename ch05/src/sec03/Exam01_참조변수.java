package sec03;

public class Exam01_�������� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * �޼ҵ�: class ������ �ڵ带 �޼ҵ忡 �ø�(loading). �ڵ尡 ����Ǵ� ����(=��������) 
		 * ��(heap): ���������� ����� ������ �����(=��ü�� �����Ǵ� ����)
		 * ����(stack): �޼ҵ忡 ����� ������ ������ �� ������ ���ؿ� ������. ���������� ��� ������ ���� ������ �����. 
		 * 
		 */		

		// ���� �� ('==', '!=')
		// 1. �⺻ Ÿ���� ��� ���� ��
		// 2. ���� Ÿ���� ��� ���� ���ϴ� ���� �ƴ϶� ������ ���ϴ� ����.
		
		int var1 = 10;
		int var2 = 100;
		int var3 = 100;
		
		System.out.println(var1 == var2);
		System.out.println(var1 == var3);
		System.out.println(var2 == var3);
		
		
		int[] var4 = {10};
		int[] var5 = {100};
		int[] var6 = {100}; // int[] var6 = var5: var6�� var5�� ���� ������ �����ϰڴ�.
	
	
		System.out.println(var4 == var5); //false
		System.out.println(var4 == var6); //false
		System.out.println(var6 == var5); //false  <== �������� �ٸ��� ����.���������� ������ ���� ����Ǵ� ���� �ƴ϶� ���� �������� ������ ��.
	}	
	

}

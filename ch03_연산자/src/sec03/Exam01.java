package sec03;

public class Exam01 {

	public static void main(String[] args) {
		// ���׿�����: �ǿ����ڰ� 1���� ������
		// ����������
		int var1 =1; // ��������
		//1�� ����
		var1++;
		++var1;
		System.out.println("var1:" + var1);
		
		var1--;
		--var1;
		System.out.println("var1:" + var1);
		
		// �ٸ� �����ڿ� ���� ����� ��� ����
		int var2 = 1;
		int var3 = var2+ 5;
		System.out.println("var3:" + var3);
		
		// ++�� �տ� ���� ���
		// ++�� �ڿ� ���� ���: ������ ���길. �ܵ����� ���� �տ� ����. �ڿ� ���� �ٸ� �����ڶ� ��ħ

		//���� ������ ���� �����ϴ� �����
		 int var4 = 1;
		 var4 += 3; 
		 var4 -= 3;
		 var4 *= 3;
		 var4 /= 3;
		 
		 // ������ �����ϴ� �����
		 boolean var5 = false;
		 boolean var6 = !var5;   
		

	}

}

package sec02_�ݺ���;

public class Homework {

	public static void main(String[] args) {
		// 
	
		//�Ųٷ� ����ϱ�
		int i;
		for(i=5; i>0; i--) {
			if(i==5) {
				System.out.print("^^^^^" + "\n");
			} else if(i==4) {
				System.out.print("^^^^" + "\n");
			} else if(i==3) {
				System.out.print("^^^" + "\n");
			} else if(i==2) {
				System.out.print("^^" + "\n");
			} else {
				System.out.print("^" + "\n");
			} 
			
		}
		// ������� ����ϱ�
		for(i=1; i<6; i++) {
			if(i==5) {
				System.out.print("^^^^^" + "\n");
			} else if(i==4) {
				System.out.print("^^^^" + "\n");
			} else if(i==3) {
				System.out.print("^^^" + "\n");
			} else if(i==2) {
				System.out.print("^^" + "\n");
			} else {
				System.out.print("^" + "\n");
			} 
			
		}
		
		// �þ��
		String var = "";
		for(i=0; i<5; i++) {
			var = var + "^";
			System.out.println(var);
		}
		// �پ���
		String var2="^^^^^^";
		for(i=6; i>0; i--) {
			var2 = var2.substring(0, var2.length()-1);
			System.out.println(var2);
		}
		
		System.out.println();


	}
	
	

}

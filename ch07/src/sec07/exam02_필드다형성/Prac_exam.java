package sec07.exam02_�ʵ������;

public class Prac_exam {

	public static void main(String[] args) {

		Prac_Overwatch overwatch = new Prac_Overwatch();
		overwatch.dealer.call(); //overwatch ��ü���� dealer Ŭ������ Dealer ��ȯ;
		
		overwatch.dealer = new Prac_Ash();
		overwatch.dealer.call();

		overwatch.dealer = new Prac_Macree();
		overwatch.dealer.call();

		
		//��ü �����ÿ��� �θ�Ŭ���� Ȱ��
		
	

	
	}

}

package sec02_�ݺ���;

public class Exam05_continue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 1���� 100���� ���� ���� ��, ���ʷ� 300�� �Ǵ� ������ ����?
		
		int count =1;
		int sum = 0;
		while(true) {
			sum += count;
			if(sum>=300) {
				break;
			}
			count++;
		} 
		System.out.println("300�� �Ѱ� ����� ������ ���� " +count+"��° ���Դϴ�.");

		
		// 3�� ��� ���
		for(int i=0; i<10; i++) {
			if(i%3!=0) {
				continue;
			} 
			System.out.println(i);
		}

	}

}

package sec02_�ݺ���;

public class Exam02_while {

	public static void main(String[] args) {
		// while��
		
		int i =1;
		while(i<=10) {
			System.out.print(i + "\t");
			i ++;
		}
		int speed = 10;
		while(speed >0) {
			System.out.println("1�� ���ӽ�Ŵ. ���� �ӵ�:" + speed);
			speed --;
			if(speed==3) {
				break;
			}
		} // ���� �� ��� ���ư��� �ϴ� ������ �ַ� ����.
		System.out.println();
		

	}

}

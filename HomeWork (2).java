package sec06;

import java.util.Scanner;

public class HomeWork {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		//�Խù��� ����Ǵ� �迭
		String[][] boards = new String[100][4];
		
		//�Խù��� ���� �����Ҷ� ���� 1�� ���� �Ǿ�� �մϴ�.
		int nextBno = 1;
		
		while(true) {
			System.out.println("-------------------------------------------------");
			System.out.println("1:��� | 2:���� | 3:�󼼺��� | 4:���� | 5:���� | 6:����");
			System.out.println("-------------------------------------------------");
			System.out.print("��ȣ ����:");
			int selectNo = Integer.parseInt(scanner.nextLine());
			if(selectNo == 1) {
				System.out.println("����� ������� �մϴ�.");
			} else if(selectNo == 2) {
				System.out.println("���ο� �Խù��� �Է��� �޾Ƽ� �����ؾ� �մϴ�.(����, ����, �۾���)");
				System.out.println("�Խù� ��ȣ�� �Է��� ���� �ʰ� nextBno�� ������ �����ؾ� �մϴ�.");
				System.out.println("�Խù��� ���� ��ġ�� �Խù� ��ȣ�� null�� ���� ã�Ƽ� �����ؾ� �մϴ�.");
			} else if(selectNo == 3) {
				System.out.println("�Խù� ��ȣ�� �Է� �޾Ƽ� �ش� �Խù��� �Խù��� ������� �մϴ�.");
			} else if(selectNo == 4) {
				System.out.println("�Խù� ��ȣ�� �Է� �޾Ƽ� �ش� �Խù��� ����� ������ �Է¹ް� �����ؾ� �մϴ�.");
			} else if(selectNo == 5) {
				System.out.println("�Խù� ��ȣ�� �Է� �޾Ƽ� �ش� �Խù��� �Խù��� �����մϴ�.");
			} else if(selectNo == 6) {
				break;
			}
		}

	}

}

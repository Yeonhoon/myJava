package sec02_�ݺ���;

import java.util.Scanner; //ctrl + shift + o ������ import ����.

public class Exam03_�ݺ������� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		boolean stop = false;
		while(!stop) {
			String data = scanner.nextLine(); //~(): �޼ҵ� ȣ�� method�� ������ �ִ� ����� ����ϰڴ�. nextLine(): Ű���忡�� ���� ġ�� ������ �Էµ� ���ڿ��� �������
			if(data.equals("q")) {
				//break;
				stop = true;
			} else {
				System.out.println(data);
			}

		}
		System.out.println("Bye~");

	}

}

package sec02_�ݺ���;

import java.util.Scanner; //ctrl + shift + o ������ import ����.

public class Exam04_dowhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		boolean stop = false;
		do{
			String data = scanner.nextLine(); //~(): �޼ҵ� ȣ�� method�� ������ �ִ� ����� ����ϰڴ�. nextLine(): Ű���忡�� ���� ġ�� ������ �Էµ� ���ڿ��� �������
			if(data.equals("q")) {
				//break;
				stop = true;
			} else {
				System.out.println(data);
			}

		} while(!stop); 
		System.out.println("Bye~");

	}

}

package sec01;
//���ǿ��ܴ� ���������� �̻��� �־ �������� �ȵ�
//���࿹�ܴ� ���������� �̻��� ��� �������� ������ �����߿� ������ �߻��Ѵ�
	// ���࿹�ܴ� RuntimeException�� ��ӹ޴� Ŭ�����̴�. 
//class myException extends Exception (�����ڰ� ����ó�� �ϰ���� �� Exception�� �����)

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;


public class Example {
	public static void main(String[] args) {
		//���࿹��
		//java.lang.ArrayIndexOutOfBoundsException
		int[] arr = {1, 1, 1};
		arr [0] = 9;
		
		//java.lang.NumberFormatException
		String data = "5";
		int value = Integer.parseInt(data);
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("�Է¶�: ");
		try {
			int num = scanner.nextInt();
		} catch (InputMismatchException e) {
			System.out.println("��ȣ�� �Է��ϼ���.");
		}

		//�Ϲݿ���
		try {
		//File not found Exception
		FileInputStream fis = new FileInputStream("C:/Temp/sample.txt");
		} catch(FileNotFoundException e) {
			System.out.println("���� ó�� ����");
		}
		System.out.println(value);
	}

}

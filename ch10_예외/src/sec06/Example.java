package sec06;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Example {

	public static void main(String[] args) {
		try {
		method("C:/Temp/sample.txt");
		} catch (FileNotFoundException e) {
			System.out.println("�߸��� ���� ����Դϴ�.");
		} catch (IOException e) {
			System.out.println("�߸��� ���� ����Դϴ�.");
			
		}

	}
	//static�� �־�� method�̸����� ���� ����Ҽ��ִ�.
	//throw�� , �� �̿��ؼ� �������� ���ܸ� ȣ���Ҽ�����
	public static void method(String filePath) throws FileNotFoundException, IOException {
	//throws�� ��� ���ܸ� ȣ���� ������ �ٽ� ���ư���. 
			FileInputStream fis = new FileInputStream(filePath);
			fis.read();

	}
}

package sec02;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class InputStreamExample01 {

	public static void main(String[] args) {
		try {
			InputStream is = new FileInputStream("D:\\MW\\jyh\\java\\ch18\\src\\files/data1.db");
			
			int readByte = -1;
			while((readByte = is.read()) != -1) {
				System.out.println(readByte + " ");
			}
			
			
			// ����Ʈ���� �д� ���
//			for (int i = 0; i < 6; i++) {
//				int data = is.read(); // �ѹ� read�Ҷ����� 1����Ʈ�� �о data�� ������.
//				System.out.println(data); // ������ �Ѱ� �Ǹ� -1 �����.
//			}

			// ���� ��ü�� �д� ��( �� ȿ������ )
			byte[] data = new byte[3];
			while(true) {
				// ���� ������ ���̰� �迭�� ���̺��� ū ���, �ݺ��ؼ� �а� �Ǵµ� �ݺ��ϴ� ���� ������ ���� ������ ����Ʈ�� �д� ��쵵 ����.
				// 10����Ʈ�� ��� �迭�� 3�̶�� 3 3 3 1. �̹� ���� ���� �߰��� ���� �ʰ� �ϱ� ����  
				int readByteNum = is.read(data); 
				if(readByteNum == -1) {
					break;
				} 
				for(int i = 0; i<readByteNum; i++) { // ���� ����Ʈ��ŭ�� �ݺ�
					System.out.print(data[i] + " ");
				}
				System.out.println();
				
			}
////			is.read(data); // �迭�� �� ��� �迭�� ���̸�ŭ ����.
//			int readByteNum = is.read(data);
//			System.out.println("���� ����Ʈ�� ���� " + readByteNum);
//			for (byte b : data) {
//				System.out.print(b + " " ); // �迭�� ���̰� ������ ����Ʈ���� �ʰ��Ǵ� ��� �������� 0���� ���
//			}
//			System.out.println();
//			
//			readByteNum = is.read(data);  // ���� ����Ʈ�� ���̺��� ª�� ��� ����� ���� �� ����.
//			System.out.println("���� ����Ʈ�� ���� " + readByteNum);
//			for (byte b : data) {
//				System.out.print(b + " "); // �迭�� ���̰� ������ ����Ʈ���� �ʰ��Ǵ� ��� �������� 0���� ���
//			} // ���� �ڸ��� ������ ������ �� �� ����.
//			
//			// �� �̻� ���� �� ������ -1 return
			
			is.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

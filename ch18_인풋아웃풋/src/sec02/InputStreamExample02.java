package sec02;

import java.io.FileInputStream;
import java.io.InputStream;

public class InputStreamExample02 {
	public static void main(String[] args) {
		
		try {
			InputStream is = new FileInputStream("D:\\MW\\jyh\\java\\ch18\\src\\files/data1.db");
			
			// �������� Exam02�� ����� Exam01�� ������� ����.
			byte[] data = new byte[1024];
			int readByteNum = -1;
			while((readByteNum = is.read(data)) != -1) {
				for(int i = 0; i<readByteNum; i++) {
					System.out.println(data[i] + " ");
				}
			}
			// ���� ����� �Ȱ���.
//			byte[] data = new byte[1024];
//			while(true) {
//				if(readByteNum == -1) {
//					break;
//				} for(int i = 0; i<readByteNum; i++) {
//					System.out.println(data[i]+ " ");
//				}
//			}
			
		} catch (Exception e ) {
			e.printStackTrace();
		}
	}
}

package sec02.MyPrac;

import java.io.FileInputStream;
import java.io.InputStream;

public class MyInputStream {
	public static void main(String[] args) {

		try {
			InputStream is = new FileInputStream("D:\\MW\\jyh\\java\\ch18_��ǲ�ƿ�ǲ\\src\\files\\data2.db");
			
			// 1. byte �ϳ��� ����ϱ�
//			for (int i = 0; i < 5; i++) {
//				int a = is.read();
//				System.out.println(a); 
//			}
//			
			// byte�� array�� ��� ȣ��
			byte [] data = new byte[3];
			while(true) {
				int readNum = is.read(data);
				if(readNum==-1) {break;}
				for(int i =0; i<readNum; i++) {
					System.out.print(data[i]); // �迭�� ���� ���, ����Ʈ�� ��� ������� �� 0�� ��µ�
				}
				System.out.println();
			}
			
			byte [] data2 = new byte[1024];
			int readNum = -1;
			while((readNum = is.read(data2))!=-1) {
				for(int i =0 ; i<readNum; i++) {
					System.out.println(data2[i]);
				}
			}
			
			
			
		} catch (Exception e) {

		}

	}
}

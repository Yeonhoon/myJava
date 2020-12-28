package sec02.MyPrac;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class MyCopy3 {
	public static void main(String[] args) {
	
		try {
			InputStream is = new FileInputStream("D:\\MW\\jyh\\java\\ch18_��ǲ�ƿ�ǲ\\src\\files/Avengers.jpg");
			OutputStream os = new FileOutputStream("D:\\MW\\jyh\\java\\ch18_��ǲ�ƿ�ǲ\\src\\files/Avengers_copy2.jpg");
			
			// 1. is.read�� ���� ��ü ����
			byte [] data = new byte[1024];
			int readNum= -1;
			long start = System.currentTimeMillis();			
			while((readNum = is.read(data))!=-1) {
				
				// write�� readNum�� �ϴ� ���� �ƴϴ�. is.read�� ���� �ҷ��� �����͸� write�ϴ� ����
				// readNum�� ���� �ݺ��� �ϱ� ���� �������� ���̸� �����ϴ� ���ϻ�?
				os.write(data, 0, readNum);
				
			}
			os.flush();
			os.close();
			is.close();
			long end = System.currentTimeMillis();
			System.out.println((end - start) + "ms");
			
		} catch (FileNotFoundException e2) {
			e2.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
		
		
		
		try {
			
		} catch(Exception e) {
			e.getStackTrace();
		}
		
	}
	
}

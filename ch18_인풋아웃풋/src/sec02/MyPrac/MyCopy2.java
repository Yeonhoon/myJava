package sec02.MyPrac;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class MyCopy2 {
	public static void main(String[] args) {
		
		try {
			InputStream is = new FileInputStream("D:\\MW\\jyh\\java\\ch18_��ǲ�ƿ�ǲ\\src\\files\\Avengers.jpg");
			OutputStream os = new FileOutputStream("D:\\MW\\jyh\\java\\ch18_��ǲ�ƿ�ǲ\\src\\files\\Avengers_copy.jpg");

			byte [] data = new byte[1024];
			int readNum = -1;
			
			while(true) {
				//1. �ܺ��� ������ read�ؼ� ���α׷��� �����ϱ�.
				readNum = is.read(data);
				if(readNum==-1) {break;}
				
				// 2. �ܺ������� ������ array�� �� ��(array������ ó���ӵ��� �ξ� ����)
				os.write(data, 0 , readNum);
				System.out.println(readNum);
			}
			os.flush();
			os.close();
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

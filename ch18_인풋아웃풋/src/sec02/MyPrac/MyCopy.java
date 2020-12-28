package sec02.MyPrac;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class MyCopy {
	public static void main(String[] args) {
		
		// ���� �б� : ���ϰ�� ���� = > ����ó��
		try {
			InputStream is = new FileInputStream("D:\\MW\\jyh\\java\\ch18_��ǲ�ƿ�ǲ\\src\\files/wallpaper.jpg");
			
			OutputStream os = new FileOutputStream("D:\\MW\\jyh\\java\\ch18_��ǲ�ƿ�ǲ\\src\\files/wallpaper_copy.jpg");
			
			// ���� �ҷ�����
			byte [] data = new byte[1024];
			int file = -1;
			long start = System.currentTimeMillis();
			
			while(true) {
				file = is.read(data);
				if(file== -1) {break;}
				os.write(data,0,file);
			}
			
			os.flush();
			os.close();
			is.close();
			
			long end = System.currentTimeMillis();
			System.out.println("�ɸ� �ð�: " + (end - start) + "ms");
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}

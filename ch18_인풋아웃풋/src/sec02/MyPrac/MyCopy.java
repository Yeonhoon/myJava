package sec02.MyPrac;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class MyCopy {
	public static void main(String[] args) {
		
		// 파일 읽기 : 파일경로 삽입 = > 예외처리
		try {
			InputStream is = new FileInputStream("D:\\MW\\jyh\\java\\ch18_인풋아웃풋\\src\\files/wallpaper.jpg");
			
			OutputStream os = new FileOutputStream("D:\\MW\\jyh\\java\\ch18_인풋아웃풋\\src\\files/wallpaper_copy.jpg");
			
			// 파일 불러오기
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
			System.out.println("걸린 시간: " + (end - start) + "ms");
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}

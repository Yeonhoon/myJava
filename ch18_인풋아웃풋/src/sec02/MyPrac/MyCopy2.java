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
			InputStream is = new FileInputStream("D:\\MW\\jyh\\java\\ch18_인풋아웃풋\\src\\files\\Avengers.jpg");
			OutputStream os = new FileOutputStream("D:\\MW\\jyh\\java\\ch18_인풋아웃풋\\src\\files\\Avengers_copy.jpg");

			byte [] data = new byte[1024];
			int readNum = -1;
			
			while(true) {
				//1. 외부의 파일을 read해서 프로그램에 저장하기.
				readNum = is.read(data);
				if(readNum==-1) {break;}
				
				// 2. 외부파일의 저장은 array에 할 것(array에서의 처리속도가 훨씬 빠름)
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

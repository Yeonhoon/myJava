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
			InputStream is = new FileInputStream("D:\\MW\\jyh\\java\\ch18_인풋아웃풋\\src\\files/Avengers.jpg");
			OutputStream os = new FileOutputStream("D:\\MW\\jyh\\java\\ch18_인풋아웃풋\\src\\files/Avengers_copy2.jpg");
			
			// 1. is.read를 넣을 객체 지정
			byte [] data = new byte[1024];
			int readNum= -1;
			long start = System.currentTimeMillis();			
			while((readNum = is.read(data))!=-1) {
				
				// write는 readNum을 하는 것이 아니다. is.read를 통해 불러온 데이터를 write하는 것임
				// readNum의 경우는 반복을 하기 위한 데이터의 길이를 대입하는 것일뿐?
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

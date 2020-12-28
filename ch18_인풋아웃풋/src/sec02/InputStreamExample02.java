package sec02;

import java.io.FileInputStream;
import java.io.InputStream;

public class InputStreamExample02 {
	public static void main(String[] args) {
		
		try {
			InputStream is = new FileInputStream("D:\\MW\\jyh\\java\\ch18\\src\\files/data1.db");
			
			// 연산방법은 Exam02의 방법이 Exam01의 방법보다 쉬움.
			byte[] data = new byte[1024];
			int readByteNum = -1;
			while((readByteNum = is.read(data)) != -1) {
				for(int i = 0; i<readByteNum; i++) {
					System.out.println(data[i] + " ");
				}
			}
			// 위의 방법과 똑같음.
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

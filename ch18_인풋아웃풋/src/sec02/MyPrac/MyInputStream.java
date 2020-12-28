package sec02.MyPrac;

import java.io.FileInputStream;
import java.io.InputStream;

public class MyInputStream {
	public static void main(String[] args) {

		try {
			InputStream is = new FileInputStream("D:\\MW\\jyh\\java\\ch18_인풋아웃풋\\src\\files\\data2.db");
			
			// 1. byte 하나씩 출력하기
//			for (int i = 0; i < 5; i++) {
//				int a = is.read();
//				System.out.println(a); 
//			}
//			
			// byte를 array로 묶어서 호출
			byte [] data = new byte[3];
			while(true) {
				int readNum = is.read(data);
				if(readNum==-1) {break;}
				for(int i =0; i<readNum; i++) {
					System.out.print(data[i]); // 배열로 읽을 경우, 바이트를 모두 출력했을 때 0이 출력됨
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

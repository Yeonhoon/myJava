package sec02;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class InputStreamExample01 {

	public static void main(String[] args) {
		try {
			InputStream is = new FileInputStream("D:\\MW\\jyh\\java\\ch18\\src\\files/data1.db");
			
			int readByte = -1;
			while((readByte = is.read()) != -1) {
				System.out.println(readByte + " ");
			}
			
			
			// 바이트별로 읽는 방법
//			for (int i = 0; i < 6; i++) {
//				int data = is.read(); // 한번 read할때마다 1바이트를 읽어서 data에 대입함.
//				System.out.println(data); // 범위를 넘게 되면 -1 출력함.
//			}

			// 파일 전체를 읽는 법( 더 효율적임 )
			byte[] data = new byte[3];
			while(true) {
				// 실제 파일의 길이가 배열의 길이보다 큰 경우, 반복해서 읽게 되는데 반복하다 보면 기존에 읽은 파일의 바이트를 읽는 경우도 있음.
				// 10바이트의 경우 배열이 3이라면 3 3 3 1. 이미 읽은 것을 추가로 읽지 않게 하기 위해  
				int readByteNum = is.read(data); 
				if(readByteNum == -1) {
					break;
				} 
				for(int i = 0; i<readByteNum; i++) { // 읽은 바이트만큼만 반복
					System.out.print(data[i] + " ");
				}
				System.out.println();
				
			}
////			is.read(data); // 배열이 들어간 경우 배열의 길이만큼 읽음.
//			int readByteNum = is.read(data);
//			System.out.println("읽은 바이트의 수는 " + readByteNum);
//			for (byte b : data) {
//				System.out.print(b + " " ); // 배열의 길이가 파일의 바이트보다 초과되는 경우 나머지는 0으로 출력
//			}
//			System.out.println();
//			
//			readByteNum = is.read(data);  // 파일 바이트의 길이보다 짧을 경우 나누어서 읽을 수 있음.
//			System.out.println("읽은 바이트의 수는 " + readByteNum);
//			for (byte b : data) {
//				System.out.print(b + " "); // 배열의 길이가 파일의 바이트보다 초과되는 경우 나머지는 0으로 출력
//			} // 남은 자리에 이전의 데이터 올 수 있음.
//			
//			// 더 이상 읽을 게 없으면 -1 return
			
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

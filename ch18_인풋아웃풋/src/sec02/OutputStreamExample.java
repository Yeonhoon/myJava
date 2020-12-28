package sec02;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class OutputStreamExample {
	public static void main(String[] args) {
		//FileNotFoundException 발생 가능성 ==> 예외처리 필요.
		try {
			OutputStream os = new FileOutputStream("D:\\MW\\jyh\\java\\ch18_인풋아웃풋\\src\\files/data1.db");
			os.write(65);
			// 텍스트 에디터에는 65를 문자로 바꾸어서 표시하게 됨. 65 --> A로 저장됨.
			
			os.write(new byte[] {66,67}); //매개변수 자리에는 바로 {}가 올 수 없음 
			os.write(new byte[] {68,69,70,},0,2); // 첫번째부터 n개 출력함. read의 경우는 부분적 사용 잘 안하지만 write는 자주 사용함.
			
			os.flush(); // 비운다. 출력을 하고 나서는 반드시 flush() -> close() 순으로 작성해줘야함. e.g. flush: 카톡채팅할 때 enter
			os.close(); // e.g. 채팅창 닫을 때 close;
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) { //파일이 있음에도 쓰기파일이 불가능한 경우 IOException 발생할 수 있음.;
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

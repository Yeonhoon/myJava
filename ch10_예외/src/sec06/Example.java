package sec06;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Example {

	public static void main(String[] args) {
		try {
		method("C:/Temp/sample.txt");
		} catch (FileNotFoundException e) {
			System.out.println("잘못된 파일 경로입니다.");
		} catch (IOException e) {
			System.out.println("잘못된 파일 경로입니다.");
			
		}

	}
	//static이 있어야 method이름만을 갖고 사용할수있다.
	//throw는 , 를 이용해서 여러개의 예외를 호출할수있음
	public static void method(String filePath) throws FileNotFoundException, IOException {
	//throws의 경우 예외를 호출한 곳에서 다시 돌아간다. 
			FileInputStream fis = new FileInputStream(filePath);
			fis.read();

	}
}

package sec01;
//일판예외는 문법적으로 이상이 있어서 컴파일이 안됨
//실행예외는 문법적으로 이상은 없어서 컴파일은 되지만 실행중에 오류가 발생한다
	// 실행예외는 RuntimeException을 상속받는 클래스이다. 
//class myException extends Exception (개발자가 예외처리 하고싶을 때 Exception을 상속함)

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;


public class Example {
	public static void main(String[] args) {
		//실행예외
		//java.lang.ArrayIndexOutOfBoundsException
		int[] arr = {1, 1, 1};
		arr [0] = 9;
		
		//java.lang.NumberFormatException
		String data = "5";
		int value = Integer.parseInt(data);
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("입력란: ");
		try {
			int num = scanner.nextInt();
		} catch (InputMismatchException e) {
			System.out.println("번호로 입력하세요.");
		}

		//일반예외
		try {
		//File not found Exception
		FileInputStream fis = new FileInputStream("C:/Temp/sample.txt");
		} catch(FileNotFoundException e) {
			System.out.println("예외 처리 내용");
		}
		System.out.println(value);
	}

}

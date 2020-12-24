package sec02_반복문;

import java.util.Scanner; //ctrl + shift + o 누르면 import 생김.

public class Exam03_반복문연습 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		boolean stop = false;
		while(!stop) {
			String data = scanner.nextLine(); //~(): 메소드 호출 method가 가지고 있는 기능을 사용하겠다. nextLine(): 키보드에서 엔터 치기 전까지 입력된 문자열을 만들어줌
			if(data.equals("q")) {
				//break;
				stop = true;
			} else {
				System.out.println(data);
			}

		}
		System.out.println("Bye~");

	}

}

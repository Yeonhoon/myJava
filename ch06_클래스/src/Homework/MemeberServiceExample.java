package Homework;

import java.util.Scanner;

public class MemeberServiceExample {

	public static void main(String[] args) {
		MemberService memserv = new MemberService();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("id를 입력하세요.");
		
		String id = scanner.nextLine();
		
		System.out.println("password를 입력하세요.");
		
		String pw = scanner.nextLine();
		
		
		boolean result = memserv.logIn(id, pw);
		if(result) {
			System.out.println("로그인 성공!");
			memserv.logOut(id);
		
		} else {
			System.out.println("id 또는 password가 올바르지 않습니다.");
		}
		
		
		
	}

}

package Homework;

import java.util.Scanner;

public class MemeberServiceExample {

	public static void main(String[] args) {
		MemberService memserv = new MemberService();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("id�� �Է��ϼ���.");
		
		String id = scanner.nextLine();
		
		System.out.println("password�� �Է��ϼ���.");
		
		String pw = scanner.nextLine();
		
		
		boolean result = memserv.logIn(id, pw);
		if(result) {
			System.out.println("�α��� ����!");
			memserv.logOut(id);
		
		} else {
			System.out.println("id �Ǵ� password�� �ùٸ��� �ʽ��ϴ�.");
		}
		
		
		
	}

}

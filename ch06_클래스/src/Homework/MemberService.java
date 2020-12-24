package Homework;

public class MemberService {

	String id;
	String password;
	
	public boolean logIn(String id, String password) {
		if(id.equals("hong") && password.equals("12345")) {
			return true;
			
		} else {
			return false;
		}	
	}
	
	public void logOut(String id) {
		System.out.println("로그아웃되었음");
	}
	
}

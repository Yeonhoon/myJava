package sec02;

public class Overwatch implements SelectGame{

	@Override
	public void logIn() {

		System.out.println("로그인이 완료되었습니다.");
		
	}

	@Override
	public void Game() {
		// TODO Auto-generated method stub
		System.out.println("Overwatch를 실행합니다");
	}

	@Override
	public void logOut() {
		System.out.println("로그아웃");
		
	}

}

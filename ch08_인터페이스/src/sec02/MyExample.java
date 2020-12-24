package sec02;

public class MyExample {

	public static void main(String[] args) {

		SelectGame game = new Starcraft();
		
		game.logIn();
		game.Game();
		game.logOut();
		
		System.out.println("-------------------------");
		
		SelectGame game2 = new Overwatch();
		
		game2.logIn();
		game2.Game();
		game2.logOut();
		
		
		
	
		
	}

}

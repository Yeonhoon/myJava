package sec07.exam05_instanceof;

public class PracGame {

	public static void main(String[] args) {

		Game game = new Game();
		Player player = new Player();

		player.play(new Game()); //메소드에 부모 클래스, 자식 클래스 모두 올 수 있음.
		player.play(new Starcraft());
		player.play(new Overwatch());
		
		
		
	}

}

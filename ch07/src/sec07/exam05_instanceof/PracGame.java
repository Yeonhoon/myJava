package sec07.exam05_instanceof;

public class PracGame {

	public static void main(String[] args) {

		Game game = new Game();
		Player player = new Player();

		player.play(new Game()); //�޼ҵ忡 �θ� Ŭ����, �ڽ� Ŭ���� ��� �� �� ����.
		player.play(new Starcraft());
		player.play(new Overwatch());
		
		
		
	}

}

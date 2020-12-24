package sec07.exam05_instanceof;

public class Player {

	public void play(Game game) {
		if(game instanceof Starcraft) {
			Starcraft star = (Starcraft) game; //����Ÿ�Ժ�ȯ
			star.starcraft();
		} else if(game instanceof Overwatch) {
			Overwatch over = (Overwatch) game;
			over.overwatch();
		}
		game.gaming();

	}

}


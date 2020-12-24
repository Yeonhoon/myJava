package sec03;

public class MyButton {

	private Onclick react;
	
	
	public void setReact(Onclick react) {
		this.react = react;
	}

	public void click() {
		react.Game();
	}

	static interface Onclick{
		void Game();
	}
	
}

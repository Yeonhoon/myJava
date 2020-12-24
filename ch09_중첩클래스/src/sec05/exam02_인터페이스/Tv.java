package sec05.exam02_인터페이스;

public class Tv implements RemoteControl {

	@Override
	public void turnOn() { //메소드 재정의

		System.out.println("TV 켜기");
	}

}

package sec02;

public class TV implements RemoteControl{
	//TV: 객체
	
	@Override
	public void turnOn() {

		System.out.println("모니터에 전원이 들어옴");
		System.out.println("내놔라");
		
	}

	@Override
	public void turnOff() {
		System.out.println("모니터 전원 끄기");
	}

	@Override
	public void setVolume(int volume) {
		System.out.println("볼륨을 " + volume + "으로 변경");
	}



}

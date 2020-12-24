package sec02;

public class Radio implements RemoteControl{
	//radio 객체

	@Override
	public void turnOn() {

		System.out.println("라디오에 전원이 들어옴");
		System.out.println("내놔라");
	}

	@Override
	public void turnOff() {
		System.out.println("라디오 전원 끄기");
	}

	@Override
	public void setVolume(int volume) {
		if(volume > RemoteControl.MAX_Volune) { //static ==> 클래스 이름으로 접근.
			volume = RemoteControl.MAX_Volune;
		}
		
		if(volume < RemoteControl.MIN_Volume) {
			volume = RemoteControl.MIN_Volume;
		}
		
		System.out.println("라디오 볼륨을 " + volume + "으로 변경");
	}



}

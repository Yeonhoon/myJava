package sec02;

public class Example {
	// 개발코드
	public static void main(String[] args) {

		RemoteControl rc = new TV(); //이 인터페이스로 tv를 사용하겠다. 인터페이스로 사용하겠다고 선언했기 떄문에 RemoteControl이 와도 사용 가능함.(상속으로 생각x)
		
		rc.turnOn();
		rc.setVolume(5);
		rc.turnOff();
		
		//인터페이스만을 활용하여 조절하였음


		RemoteControl rc2 = new Radio(); //이 인터페이스로 radio를 사용하겠다.
		
		rc2.turnOn();
		rc2.setVolume(12);
		rc2.turnOff();
		
		
		
	}

}

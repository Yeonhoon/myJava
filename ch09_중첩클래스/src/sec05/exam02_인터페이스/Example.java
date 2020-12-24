package sec05.exam02_인터페이스;

public class Example {

	public static void main(String[] args) {

		RemoteControl rc1 = new Tv(); //명시적으로 구현객체
		rc1.turnOn();
		
		
		RemoteControl rc2 = new RemoteControl() {//익명 객체로 만들기

			@Override
			public void turnOn() {

				System.out.println("오디오 켜기");
			} 
		};

		rc2.turnOn();
		//////////////////////////////////////////////////+
		
//		method(rc1);
//		method(rc2); //얘도 가능
		method(new RemoteControl() {
			
			@Override
			public void turnOn() {
				System.out.println("난방기 가동");
			}
		}); //메소드 호출코드
		
	}
	
	public static void method(RemoteControl rc) {
		rc.turnOn();
	}

}

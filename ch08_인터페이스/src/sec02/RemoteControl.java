package sec02;


public interface RemoteControl {

	//interface: 객체를 사용하기 위한 설명서
	//interface 설정하기
	
	//상수:static final
	int MAX_Volune =10; //인터페이스는 접근자가 없음. 무조건 public
	int MIN_Volume = 0;
	
	// 추상 메소드
	//사용방법: 메소드 선언;

	void turnOn();
	void turnOff();
	void setVolume(int volume); //볼륨값은 매개값으로 돚ㅈ	
}

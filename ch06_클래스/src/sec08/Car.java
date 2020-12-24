package sec08;

public class Car {

	//Field
	private int speed; // private: 객체 안에서만 쓸 수 있도록 함. example 등 실행 못함
	
	//Constructor

	Car() {
		setSpeed(0); // 같은 클래스 내부에서는 이름만 주고도 호출할 수 있음.
	}
	
	
	//Method
	public void setSpeed(int speed) {
		if(speed<0) {
			this.speed = 0;
		} else {
			this.speed = speed;
		}
		
	}
	
	public void run(int value) {
//		speed++;
		setSpeed(value); // 프로그램은 speed=10;보다 이 방식을 더 선호함.
		// 만약 스피드가 음수일 경우 말이 안됨. speed=10 방식으로 할 경우 오류 필터링을 못함. setSpeed라는 곳에서 필터링.
	}

}

package sec08;

public class Car {

	//Field
	private int speed; // private: ��ü �ȿ����� �� �� �ֵ��� ��. example �� ���� ����
	
	//Constructor

	Car() {
		setSpeed(0); // ���� Ŭ���� ���ο����� �̸��� �ְ� ȣ���� �� ����.
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
		setSpeed(value); // ���α׷��� speed=10;���� �� ����� �� ��ȣ��.
		// ���� ���ǵ尡 ������ ��� ���� �ȵ�. speed=10 ������� �� ��� ���� ���͸��� ����. setSpeed��� ������ ���͸�.
	}

}

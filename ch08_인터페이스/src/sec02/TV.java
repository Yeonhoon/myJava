package sec02;

public class TV implements RemoteControl{
	//TV: ��ü
	
	@Override
	public void turnOn() {

		System.out.println("����Ϳ� ������ ����");
		System.out.println("������");
		
	}

	@Override
	public void turnOff() {
		System.out.println("����� ���� ����");
	}

	@Override
	public void setVolume(int volume) {
		System.out.println("������ " + volume + "���� ����");
	}



}

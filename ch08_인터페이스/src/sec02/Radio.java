package sec02;

public class Radio implements RemoteControl{
	//radio ��ü

	@Override
	public void turnOn() {

		System.out.println("������ ������ ����");
		System.out.println("������");
	}

	@Override
	public void turnOff() {
		System.out.println("���� ���� ����");
	}

	@Override
	public void setVolume(int volume) {
		if(volume > RemoteControl.MAX_Volune) { //static ==> Ŭ���� �̸����� ����.
			volume = RemoteControl.MAX_Volune;
		}
		
		if(volume < RemoteControl.MIN_Volume) {
			volume = RemoteControl.MIN_Volume;
		}
		
		System.out.println("���� ������ " + volume + "���� ����");
	}



}

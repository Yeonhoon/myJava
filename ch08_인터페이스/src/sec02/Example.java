package sec02;

public class Example {
	// �����ڵ�
	public static void main(String[] args) {

		RemoteControl rc = new TV(); //�� �������̽��� tv�� ����ϰڴ�. �������̽��� ����ϰڴٰ� �����߱� ������ RemoteControl�� �͵� ��� ������.(������� ����x)
		
		rc.turnOn();
		rc.setVolume(5);
		rc.turnOff();
		
		//�������̽����� Ȱ���Ͽ� �����Ͽ���


		RemoteControl rc2 = new Radio(); //�� �������̽��� radio�� ����ϰڴ�.
		
		rc2.turnOn();
		rc2.setVolume(12);
		rc2.turnOff();
		
		
		
	}

}

package sec02;


public interface RemoteControl {

	//interface: ��ü�� ����ϱ� ���� ����
	//interface �����ϱ�
	
	//���:static final
	int MAX_Volune =10; //�������̽��� �����ڰ� ����. ������ public
	int MIN_Volume = 0;
	
	// �߻� �޼ҵ�
	//�����: �޼ҵ� ����;

	void turnOn();
	void turnOff();
	void setVolume(int volume); //�������� �Ű������� ����	
}

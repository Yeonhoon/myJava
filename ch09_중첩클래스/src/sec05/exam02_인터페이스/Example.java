package sec05.exam02_�������̽�;

public class Example {

	public static void main(String[] args) {

		RemoteControl rc1 = new Tv(); //��������� ������ü
		rc1.turnOn();
		
		
		RemoteControl rc2 = new RemoteControl() {//�͸� ��ü�� �����

			@Override
			public void turnOn() {

				System.out.println("����� �ѱ�");
			} 
		};

		rc2.turnOn();
		//////////////////////////////////////////////////+
		
//		method(rc1);
//		method(rc2); //�굵 ����
		method(new RemoteControl() {
			
			@Override
			public void turnOn() {
				System.out.println("����� ����");
			}
		}); //�޼ҵ� ȣ���ڵ�
		
	}
	
	public static void method(RemoteControl rc) {
		rc.turnOn();
	}

}

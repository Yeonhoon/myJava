package sec05.exam01;

public class Driver {

	public void drive(Vehicle vehicle) {//�Ű������� �������̽��� �ִ� ����: �������� ����(�ýõ� �ְ�, ������ �ְ�), �Ű����� �ڸ����� �������̽��� ������ü �ü�����.
		vehicle.run();
		if(vehicle instanceof Bus) { //���� ��ü�� �������� ��� ������ ������ȯ �ȵ�. ������ü�� ���� ������ȯ�ǰԲ� ���־����
			Bus bus = (Bus) vehicle;
			bus.checkFare();
		} else if(vehicle instanceof Taxi){
			Taxi taxi = (Taxi) vehicle;
			taxi.checkFare();
		}
	//Ÿ���� �߸���ȯ�Ǹ� ClassCastException �߻�.
	}
	
}

package sec05.exam01;

public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//�ڵ� ��ȯ: �������̽��� ����Ǿ��ִ� �͸� ȣ�� ����.
		Vehicle vehicle = new Bus();
		vehicle.run();
		
		//������ȯ: �������̽��� ���� �޼ҵ带 ȣ���ؾ� �� ���.But �׷� ��� ���� �干.
		Bus bus = (Bus) vehicle;
		bus.checkFare();
		
		Driver driver = new Driver();
		driver.drive(bus); // = driver.drive(new Bus());
		driver.drive(new Taxi()); // = driver.drive(new Bus());
		
		
	}

}

package sec07.exam05_instanceof;

public class Example {

	public static void main(String[] args) {

		Driver driver = new Driver();

		Vehicle vehicle = new Vehicle();
		driver.drive(new Vehicle());  //�� �Ʒ� ����.
		driver.drive(vehicle);
		
		driver.drive(new Bus());
		driver.drive(new Taxi());
		
	}

}

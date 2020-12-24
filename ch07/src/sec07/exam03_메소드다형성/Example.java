package sec07.exam03_메소드다형성;

public class Example {

	public static void main(String[] args) {

		Driver driver = new Driver();

		Vehicle vehicle = new Vehicle();
		driver.drive(new Vehicle()); 
		driver.drive(vehicle);
		
		Bus bus = new Bus();
		driver.drive(new Bus());

		Taxi taxi = new Taxi();
		driver.drive(new Taxi());
		
	}

}

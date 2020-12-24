package sec07.exam05_instanceof;

public class Driver {
	//Field
	
	//Constructor
	
	//Method
	
	public void drive(Vehicle vehicle) {
		if(vehicle instanceof Bus) { //자식 객체가 버스인지 택시인지?
			Bus bus = (Bus) vehicle; //강제타입변환
			bus.payBusFare();
		} else if(vehicle instanceof Taxi) {
			Taxi taxi = (Taxi) vehicle;
			taxi.payTaxiFare();
		}
		vehicle.run();
	}
	
	
	
}

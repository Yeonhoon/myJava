package sec07.exam05_instanceof;

public class Driver {
	//Field
	
	//Constructor
	
	//Method
	
	public void drive(Vehicle vehicle) {
		if(vehicle instanceof Bus) { //�ڽ� ��ü�� �������� �ý�����?
			Bus bus = (Bus) vehicle; //����Ÿ�Ժ�ȯ
			bus.payBusFare();
		} else if(vehicle instanceof Taxi) {
			Taxi taxi = (Taxi) vehicle;
			taxi.payTaxiFare();
		}
		vehicle.run();
	}
	
	
	
}

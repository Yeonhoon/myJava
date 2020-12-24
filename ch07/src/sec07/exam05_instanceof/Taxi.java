package sec07.exam05_instanceof;

public class Taxi extends Vehicle{
	//Field
	
	//Construct
	
	//Method
	@Override
	public void run() {
		System.out.println("Taxi가 달린다");
	
	}
	
	public void payTaxiFare() {
		System.out.println("카드로 요금을 낸다");
	}
	
}

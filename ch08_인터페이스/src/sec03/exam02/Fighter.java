package sec03.exam02;



public class Fighter implements Flyable, Sailable  {

	@Override
	public void takeOff() {
		System.out.println("������ �̷�");

	}

	@Override
	public void land() {
		System.out.println("������ ����");
		
	}

	@Override
	public void fly() {
		System.out.println("������ ����");
		
	}

	@Override
	public void goOnWater() {
		System.out.println("������ �ؼ����������");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void goUnderwater() {
		System.out.println("������ �������");
		// TODO Auto-generated method stub
		
	}
	
}

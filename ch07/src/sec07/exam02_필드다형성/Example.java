package sec07.exam02_�ʵ������;

public class Example {
	public static void main(String[] args) {
		
		Car myCar = new Car();
			
		myCar.tire.roll(); // tire(�θ�) ����
			
		// �θ�Ŭ���� ���� <- �ڽ� ��ü
		myCar.tire = new HankookTire(); //�θ� ��ü�� �ڽ� ��ü ���� ����.
		myCar.tire.roll(); //Hankook �ڽ��� ������ �Ʊ� ������ �����ǵ� roll�� �����.
		
		myCar.tire = new KumhoTire();
		myCar.tire.roll(); //kumhoTire �ڽ��� ������ �Ʊ� ������ �����ǵ� roll�� �����.
 		
		//�Ű������� ������: �Ű����� �ڸ��� �θ�ü �Ӹ� �ƴ϶� �ڽİ�ü ���� �� �� �ִ�.
		myCar.run(new Tire());
		myCar.run(new HankookTire());
		myCar.run(new KumhoTire());
		
		
		
		
		
	}
}

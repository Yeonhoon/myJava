package sec07;

public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car myCar = new Car(60); //myCar��� ������ ���ο� ��ü�� �����Ѵ�. //��ü�� ���� �� �ʵ带 ��ȣ ���� ������ �ٲپ� ����.
		
//		System.out.println(myCar.company); //myCar��� ��ü�� ������ �ִ� ���� ������
//		System.out.println(myCar.speed); //myCar��� ��ü�� ������ �ִ� ���� ������
//		System.out.println(myCar.tire); //myCar��� ��ü�� ������ �ִ� ���� ������
//		System.out.println(myCar.navi); //myCar��� ��ü�� ������ �ִ� ���� ������
//		
//		// �⺻������ ����Ǿ� �ִ� �ʵ尪�� ���� ������
//		// �ʵ尪�� �����Ҷ��� �׻� ���������� ���ؼ� ������
//		myCar.speed = 100; // ��ü �ȿ��� ������ ������ �����.
//		System.out.println(myCar.speed); //
//		
//		Car yourCar = new Car();
//		yourCar.speed= 1000;
//		System.out.println(yourCar.speed);
		
		Car car2 = new Car("�Ｚ"/* �Ű�����(argument) */);
		Car car3 = new Car("100");
		
		System.out.println(car2.company);
		System.out.println(car3.speed);
		
		Car2 car2_1 = new Car2(6461341);
		
		System.out.println(car2_1.company);
		System.out.println(car2_1.speed);
	}
}


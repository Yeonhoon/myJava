package sec06;

public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car myCar = new Car(); //myCar��� ������ ���ο� ��ü�� �����Ѵ�.
		
		System.out.println(myCar.company); //myCar��� ��ü�� ������ �ִ� ���� ������
		System.out.println(myCar.speed); //myCar��� ��ü�� ������ �ִ� ���� ������
		System.out.println(myCar.tire); //myCar��� ��ü�� ������ �ִ� ���� ������
		System.out.println(myCar.navi); //myCar��� ��ü�� ������ �ִ� ���� ������
		
		// �⺻������ ����Ǿ� �ִ� �ʵ尪�� ���� ������
		// �ʵ尪�� �����Ҷ��� �׻� ���������� ���ؼ� ������
		myCar.speed = 100; // ��ü �ȿ��� ������ ������ �����.
		System.out.println(myCar.speed); //
		
		Car yourCar = new Car();
		yourCar.speed= 1000;
		System.out.println(yourCar.speed);

	}

}

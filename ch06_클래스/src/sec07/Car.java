package sec07;

public class Car {
	
	//Field: ���� ������, ���� ������, ��ǰ
	String company ="Hyundai"; 
	int speed;
	Tire tire = new Tire(); // �⺻ Ÿ���� �ƴ� ��� ���ο� Ŭ������ ����� �ش�.
	boolean navi = true;
	
	
	
	//Constructor(������): ��ü�� ������ ������ �����. �����ڴ� ��ü �ȿ� ������� ����.
	//������ �����ε�: �����ڸ� ������ �����Ͽ� �����. ����: �� �����ڸ��� �����ڰ� �޶�� ��.
	public Car() {
		//�����ڴ� Ŭ���� �̸��� �Ȱ��� �̸��� ���� �־�� ��.
		System.out.println("Car()�� ����Ǿ����ϴ�.");
	}

	public Car(String company /* �Ű�����(argument) */) {
		//�����ڴ� Ŭ���� �̸��� �Ȱ��� �̸��� ���� �־�� ��.
		System.out.println("Car(String company)�� ����Ǿ����ϴ�.");
		this.company =company; //
	}

	public Car(int speed) {
		//�����ڴ� Ŭ���� �̸��� �Ȱ��� �̸��� ���� �־�� ��.
		System.out.println("Car(int speed)�� ����Ǿ����ϴ�.");
		this.speed = speed;
	}
	
	public Car(String company, int speed) {
		//�����ڴ� Ŭ���� �̸��� �Ȱ��� �̸��� ���� �־�� ��.
		System.out.println("Car(int speed)�� ����Ǿ����ϴ�.");
		this.company = company;
		this.speed = speed;
							
	}
	
	public Car(int speed, String company) {
		System.out.println("Car(int speed, String company) ����");
		this.speed = speed;
		this.company = company;
	}
	
	
	//���� Ŭ������ �̸��� ���� ������ ������;
	//�������� ������ ��ü�� �ʱ�ȭ �۾��� ��� �� ������?
	
	//Method
}

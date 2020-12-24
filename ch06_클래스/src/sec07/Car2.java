package sec07;

public class Car2 {
	
	//Field: ���� ������, ���� ������, ��ǰ
	String company ;
	int speed;
	Tire tire ; // �⺻ Ÿ���� �ƴ� ��� ���ο� Ŭ������ ����� �ش�.
	boolean navi ;
	
	// ������ ���� ����� --> �ߺ����������־�� ��.
	// ���� ���� �Ű������� ������ �ִ� �����ڸ� �����ؼ� �ٸ� �����ڵ��� �װ��� ȣ���ϰ� �ؾ� ��.
	
	public Car2() {
		this(0,"����");
	}

	public Car2(String company /* �Ű�����(argument) */) {
		this(0, company);
	}

	public Car2(int speed) {
		this(speed, "����");

	}
	
	public Car2(String company, int speed) {
		//�����ڴ� Ŭ���� �̸��� �Ȱ��� �̸��� ���� �־�� ��.
		this(speed, company); // ���� ��ü�� ���� �ִ� ������ ȣ��.(�� ������ �����ڸ� ȣ����)

	}
	
	public Car2(int speed, String company) {
		
		System.out.println("Car2�� speed�� company���� ����մϴ�");
		this.speed = speed;
		this.company = company;
		tire = new Tire();
		navi = true;
	}
	
	//Method
}

package sec10;

public class Calculator {
	//field
	String company;
	static double pi = 3.14159; //����� �� ���� ==> �޸� ȿ�� ����
	double memory;
	
	
	
	//Method

	static double circleArea(double r) {
		double area = r * r * pi; // �ν��Ͻ� �ʵ尪 ���� ==> static �ٿ��־�� ��
		return area;
		
		//static�� ==> ��ü ������ �ʿ� ���� Ŭ���� ������ ȣ��
	}
	
	void setMemory(double r) {
		double result = circleArea(r);
		memory = result; // memory��� field���� ����߱� ������ static �ٿ��ָ� �ȵ�.
		// static �ƴ� ==> ��ü �����Ͽ� ȣ��.
	}
	
	static void method1() { // �ν��Ͻ� �ʵ尪 ���� ==> ��ü�� ��� ������ �Ǳ� ������ static �ٿ�����.
		String name = "ȫ�浿"; // �̰� �ʵ尪�� �ƴ϶� ������.
		int round = 3;
		System.out.println("������ �߿���");
	}
	
	void method2() {
		this.company = "�Ｚ"; //this: ��ü �ڽ�.��ü�� ������ �� �� ����. �� static������ �� �� ����.
		setMemory(10);
		System.out.println("������ �߿���");
	}








}

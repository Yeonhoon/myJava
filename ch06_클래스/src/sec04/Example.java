package sec04;

public class Example {

	public static void main(String[] args) {
		// ���ุ�� ���� Ŭ����: main�� �ֱ� ����.
		// ������ ���� main�� �� �ϳ��� class���� �־�� ��.
		// ������Ʈ ���� ���� Ŭ���� �� ������ �ִ� Ŭ�������� ������(���� Ŭ�����̱� ����)
		// car ���� ����: ��ġ������ �˱� ����.
		Car myCar = null; // Car ��ü�� ������ �����. type�� Car �̹Ƿ�
		//Car ��ü ����
		myCar = new Car();
		Car myCar2 /* �������� */= new Car(); //��ü����//
		Car yourCar = new Car();
		
		//������ �������� ��ü�� ������� ����.
		//��� ��ü�� ��ġ����(����)�� �������� ������ JVM�� GC(������ �÷���)�� �ڵ����� �����Ͽ� ������.(System.rc()�ε� ���� ����)
	
		//Student �������� + Student ��ü ����
		Student stu1 = new Student(); // ��ü ������ ������ ������ stu1�� ������.
		Student stu2 = new Student(); // ��ü ������ ������ ������ stu2�� ������.
		Student stu3 = stu1;
	
		//��ü��
		System.out.println(myCar == yourCar); //false�� ����. ��ü�� ������ �ٸ��� ����.
		System.out.println(myCar == myCar2); //false�� ����. ��ü�� ������ �ٸ��� ����.
		System.out.println(stu1 == stu2); //false
		System.out.println(stu3 == stu1); //true: ���� ��ü ����.
	}
}

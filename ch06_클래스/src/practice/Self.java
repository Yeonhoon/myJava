package practice;

public class Self {
	
	// field(�ʵ�)
	String name ;
	String sex ;
	int age ;
	boolean marry;
	
	//constructor(������)
	// �ƹ��͵� �Է����� ���� ���
	Self(){
		this("�̸��� �Է��ϼ���","������ �Է��ϼ���",99,false);
	}
	
		// �Ű������� ���̸� �Է��� ���
	Self(int age){
		this("�̸�","����",age,true);
	}
	
	// �Ű����� ��θ� �Է��ؾ� �� ���
	Self(String name, String sex, int age, boolean marry){
//		System.out.println("�̸�, ����, ����, ȥ�λ���");
		this.name = name;
		this.sex = sex;
		this.age = age;
		this.marry = marry;
	}
	
	// Method
	// �޼ҵ� ����: �޼ҵ带 ����� � �� ����Ǵ��� ����
	void print(String message, int num) {
		System.out.print(message + "�� ���̴� "+ num + "�� �Դϴ�.");
	}
	
	int D_calcul(int a, int b) {
		int result = b -a;
		return result;
	}
	
	double xyz(double a, double b, double c) {
		double results = (a+b+c)*(a*b*c);
		return results;
	}
	
	double mean_score(double x, double y) {
		double results = (x+y)/2;
		return results;
	}
	
}

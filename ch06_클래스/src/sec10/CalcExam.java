package sec10;

public class CalcExam {

	public static void main(String[] args) {
		
		//�ٶ����� �ڵ�
		double area = 5*5*Calculator.pi;
		double area2 = Calculator.circleArea(5);		
		System.out.println(area);
		System.out.println(area2);
		
		//�ٶ������� ���� �ڵ�
		Calculator calc = new Calculator();
		double area3 = 5*5*calc.pi; // pi�� static�̶� ��ü�� �ʿ���µ� ��ü�� �����Ͽ���. �������� �޸� ����.
		double area4 = calc.circleArea(5);
		System.out.println(area3);
		System.out.println(area4);

	}

}

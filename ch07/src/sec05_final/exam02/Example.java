package sec05_final.exam02;

public class Example {

	public static void main(String[] args) {

		Calculator calc = new Calculator(); // ����� ����
		Computer calc2 = new Computer(); // ��ǻ�ͷ� ����(��ǻ�Ϳ��� �� ��Ȯ�ϰ� �����ϱ� ���� �ڽ� Ŭ������ ��ǻ�Ϳ��� �޼ҵ� ������)
		calc.circleArea(10);
		calc2.circleArea(10);
		
		calc.rectangleArea(10, 3);
		calc2.rectangleArea(10, 3);

	}

}

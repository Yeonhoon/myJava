package sec05_final.exam02;

public class Computer extends Calculator{
	@Override
	public void circleArea(double r) {
		double result = Math.pow(r, 2) * Math.PI;
		System.out.println("���: " + result);

	}
	
//	public final void rectangleArea(double width, double height) {
//		double result = width * height;
//		System.out.println("���: " + result);
//	} //�θ�Ŭ�������� final�� �پ��� ������ �ڽ�Ŭ���������� ���� ���������� ����.
}

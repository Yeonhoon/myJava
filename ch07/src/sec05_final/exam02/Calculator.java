package sec05_final.exam02;

public class Calculator {
	public void circleArea(double r) {
		double result = r * r * 3.14159;
		System.out.println("���: " + result);
	}
	
	public final void rectangleArea(double width, double height) {
		double result = width * height;
		System.out.println("���: " + result);
	}
	
}

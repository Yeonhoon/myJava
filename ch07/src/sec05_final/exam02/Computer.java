package sec05_final.exam02;

public class Computer extends Calculator{
	@Override
	public void circleArea(double r) {
		double result = Math.pow(r, 2) * Math.PI;
		System.out.println("결과: " + result);

	}
	
//	public final void rectangleArea(double width, double height) {
//		double result = width * height;
//		System.out.println("결과: " + result);
//	} //부모클래스에서 final이 붙었기 때문에 자식클래스에서는 절대 재정의하지 못함.
}

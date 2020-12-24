package sec10;

public class MathExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double r = 5;
		double area = r*r*Math.PI;
		System.out.println(area);
		double power = Math.pow(r,2)*Math.PI; //제곱
		System.out.println(power);
		
		double value = 3.141251;
		long result = Math.round(value); //자리수 조정
		System.out.println(result);
	}

}

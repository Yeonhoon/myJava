package practice;

public class Example {

	public static void main(String[] args) {

		/*
		 * // Self myself = new Self(); // System.out.println(myself.name); //
		 * System.out.println(myself.sex); // System.out.println(myself.age); //
		 * System.out.println(myself.marry); // // Self myself2 = new
		 * Self("장연훈","남",27,false); // System.out.println(myself2.name); //
		 * System.out.println(myself2.sex); // System.out.println(myself2.age); //
		 * System.out.println(myself2.marry); // // Self myself3 = new Self(27); //
		 * System.out.println(myself3.name); // System.out.println(myself3.sex); //
		 * System.out.println(myself3.age); // System.out.println(myself3.marry); // //
		 * // Self intro = new Self(); // int a = intro.D_calcul(10, 50); //
		 * intro.print("장연훈입니다", a);
		 */
		
		Self abc = new Self();
		abc.print("장연훈", 20);
		abc.print("홍미령", 30);
		
		Self Calcul = new Self();
		double a = Calcul.xyz(10, 20, 50);
		System.out.println(a);
		
		
		//메소드 호출
		Self Mean = new Self();
		double b= Mean.mean_score(90.124, 50.54);
		System.out.print("두 값의 평균점수는 "+ b + "입니다");
	}

}

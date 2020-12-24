package sec07.exam01;

public class Prac_exam {

	public static void main(String[] args) {
		
		Prac_Child pc = new Prac_Child();
//		pc.method1();
//		pc.method2();
//		pc.method3();
		
		Prac_parent pp = pc;
		pp.method1();
		pp.method2();
		
		
		
	}

}

package sec07.exam01;

public class Prac_Child extends Prac_parent {
	
@Override
	void method2() {
		System.out.println("child의 method2 실행");
//		super.method2(); // 부모변수의 것도 실행하고 싶은 경우.
	}
	
	void method3() {
		System.out.println("child의 method3 실행");
	}
}

package sec06.package2;

import sec06.package1.A;

public class C extends A{
	
	//method
	public void method() {
		field= "겨울";
	}

	public void method2() {
//		A a2 = new A();
	}
	
	//A와 패키지가 다르기 때문에 A class를 직접 호출하여 쓸 수 없음
	//다른 패키지의 클래스에서 A의 객체를 쓰려면 상속을 해서 써야 한다.
	//같은 패키지면 상관없음.
}

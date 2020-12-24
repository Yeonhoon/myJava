package sec02.exam01;

public class Example {
	public static void main(String[] args) {
		
		A a = new A();
		A.B b = a.new B(); //A객체의 static이 붙지 않았을 때, A객체가 있어야 B객ㅊ체도 만들어진다
	}
}

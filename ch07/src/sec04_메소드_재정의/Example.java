package sec04_메소드_재정의;

public class Example {
	
	public static void main(String[] args) {
		SportsCar sc = new SportsCar();
		sc.run(); // 자식의 run이지만 super.run()이 있기 때문에 부모의 run까지 함께 실행됨.
		
		Method_child mc = new Method_child();
		mc.run();
	}
	
	
}

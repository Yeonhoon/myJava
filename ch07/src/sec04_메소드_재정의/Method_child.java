package sec04_메소드_재정의;

public class Method_child extends Practice_parent{

	
	@Override
	void run() {
		super.run();
		System.out.println("자식클래스 실행");
		super.run();
	}
}

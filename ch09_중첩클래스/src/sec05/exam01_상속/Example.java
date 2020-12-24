package sec05.exam01_상속;

public class Example {

	public static void main(String[] args) {

		Animal a1 = new Dog(); //명시적으로 객체를 만들어 생성할수도 있지만
		a1.sound();
		a1.eat();
		
		
		
		//----------------------------------------------------------------------
		Animal a2 = new Animal() { //Animal객체를 만드는 것이 아니라 Animal 객체의 자식객체를 만들고 부모타입인 Animal에 대입.
			@Override
			public void sound() {
				System.out.println("야옹"); //객체를 만들어서 부모타입에 대입했음
			} //상속(자식클래스를 만듦)과 동시에 객체를 만들어서 그 객체를 대입. ==> 클래스를 새로 만ㄷ들지 않아도 가능.
			//클래스를 새로만듦.
		
		};
		a2.sound();
		a2.eat();
		//-----------------------------------------------------------------------
		//method(a1);
		//method(a2);
		method(new Animal() {
			@Override
			public void sound() {
				System.out.println("응애"); //객체를 만들어서 부모타입에 대입했음
			} //상속(자식클래스를 만듦)과 동시에 객체를 만들어서 그 객체를 대입.
		
		});
	
		
	}

	public static void method(Animal a) { // 추상클래스는 객체 못만듦.
		a.eat();
		a.sound();
		
	}
	
	
}

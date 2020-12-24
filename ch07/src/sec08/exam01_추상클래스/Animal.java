package sec08.exam01_추상클래스;

//abstract 클래스
public abstract class Animal {
	
	//abstract
	
	//abstract method: 중괄호가 없음= 실행할 내용이 없다는 것. 
	public abstract void sound() ;
	//메소드는 있는데 실행할 내용이 없음. abstract이 붙을 경우 부모를 상속하는 자식클래스에서 반드시 정의를 하게끔 강제함.
	//추상 클래스가 필요한 이유: 원래는 모든 클래스가 다 실행 메소드를 가지는데, 자식 클래스에서 실행메소드가 누락될 수 있음.
	//방법: class와 method 모두 abstract 추가.
	//재정의를 하지 않을 경우 compile 오류 발생.
	
}

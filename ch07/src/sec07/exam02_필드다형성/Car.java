package sec07.exam02_필드다형성;

public class Car { 
	//Field
	//필드는 부모타입으로 선언해둠
	Tire tire = new Tire();


	//method   
	public void run(Tire tire) { //자신의 객체를 매개변수에 대입.
		//매개변수 자리에 클래스가 들어가있으면 클래스에 대한 객체도 줄수 있고, 그 클래스의 자식객체도 들어갈 수 있음.(자동타입변환)
		this.tire = tire;
		this.tire.roll(); //매개변수자리에 들어간 클래스의 roll이 실행됨.자식의 클래스가 들어갔다면 부모의 객체에 있는 값이 자식의 값으로 재정의됨
	}
}

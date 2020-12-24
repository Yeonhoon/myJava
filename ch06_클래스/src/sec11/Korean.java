package sec11;

public class Korean {
	//field
	static final String NATION="대한민국"; //final을 붙이면 못바꿈. static final의 변수명은 대문자, 상수취급(불변의 값)
	final String ssn; //불변의 값. 그러나 개인마다 다름. 객체마다 생김. 그러나 한번 값이 생기면 바뀔 수 없음. ==> 입력은 생성자에서 만들어야함.
	
	//constructor
	Korean(String ssn){
		this.ssn = ssn;
	}
	
	//method
	
	


}

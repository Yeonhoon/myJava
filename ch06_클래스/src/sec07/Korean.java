package sec07;

public class Korean {
	String nation = "대한민국";
	String name;
	String ssn;
	
	// 객체를 만들때 주는 값.
	// 생성자를 미리 클래스에 생성해두면 값을 무조건 지정해두어야 함.
	public Korean(String name, String ssn) { 
		this.name = name;
		this.ssn = ssn;
	}
	
}

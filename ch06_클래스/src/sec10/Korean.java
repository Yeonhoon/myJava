package sec10;

public class Korean {
	
	// field("Korean"이라는 객체가 가지고 있는 데이터)
	static String nation = "대한민국"; //정적 필드: 객체가 공통적으로 가지고 있음. 
	String name;// 인스턴스 필드
	String ssn;
	int age;
	boolean adult;
	
	// constructor
	
	// method
	static String getNation(){
		// 정적 필드 또는 정적 메소드 호출만으로 구성되었다면 static을 붙여줄 수 있음. static을 안붙여주면 객체마다 입력해주어야 함.
		return nation;
	}
	
	static String changeNation() {
		String nation = getNation();
		Korean.nation = "대한민국";
		return nation; // 객체가 없기 때문.
	}
	
	String getName() {
		// 필드에서 name 인스턴스이므로 name을 읽으려면 반드시 객체가 있어야 함.
		// 인스턴스 필드 또는 인스턴스 메소드 호출이 포함되어 있으면 메소드는 인스턴스 메소드여야(static을 붙이면 안됨)
		//field의 변수를 사용하려면 field와 메소드의 static 여부를 일치시켜야 함.
//		Korean.nation = "한국";
		return name; //non-static 필드에 static methods 반환 불가능. 
	}
	
}

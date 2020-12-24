package practice;

public class Self {
	
	// field(필드)
	String name ;
	String sex ;
	int age ;
	boolean marry;
	
	//constructor(생성자)
	// 아무것도 입력하지 않을 경우
	Self(){
		this("이름을 입력하세요","성별을 입력하세요",99,false);
	}
	
		// 매개변수에 나이만 입력할 경우
	Self(int age){
		this("이름","남자",age,true);
	}
	
	// 매개변수 모두를 입력해야 할 경우
	Self(String name, String sex, int age, boolean marry){
//		System.out.println("이름, 성별, 나이, 혼인상태");
		this.name = name;
		this.sex = sex;
		this.age = age;
		this.marry = marry;
	}
	
	// Method
	// 메소드 선언: 메소드를 실행시 어떤 게 실행되는지 선언
	void print(String message, int num) {
		System.out.print(message + "의 나이는 "+ num + "살 입니다.");
	}
	
	int D_calcul(int a, int b) {
		int result = b -a;
		return result;
	}
	
	double xyz(double a, double b, double c) {
		double results = (a+b+c)*(a*b*c);
		return results;
	}
	
	double mean_score(double x, double y) {
		double results = (x+y)/2;
		return results;
	}
	
}

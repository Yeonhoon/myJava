package sec04;

public class Example {

	public static void main(String[] args) {
		// 실행만을 위한 클래스: main이 있기 때문.
		// 실행을 위한 main은 딱 하나의 class에만 있어야 함.
		// 프로젝트 내의 여러 클래스 중 메인이 있는 클래스부터 실행함(실행 클래스이기 때문)
		// car 변수 선언: 위치정보를 알기 위해.
		Car myCar = null; // Car 객체의 번지만 저장됨. type이 Car 이므로
		//Car 객체 생성
		myCar = new Car();
		Car myCar2 /* 변수선언 */= new Car(); //객체생성//
		Car yourCar = new Car();
		
		//변수가 없어져도 객체는 사라지지 않음.
		//대신 객체의 위치정보(번지)를 참조하지 않으면 JVM이 GC(가비지 컬렉터)를 자동으로 실행하여 제거함.(System.rc()로도 실행 가능)
	
		//Student 변수선언 + Student 객체 생성
		Student stu1 = new Student(); // 객체 생성후 번지를 변수인 stu1에 저장함.
		Student stu2 = new Student(); // 객체 생성후 번지를 변수인 stu2에 저장함.
		Student stu3 = stu1;
	
		//객체비교
		System.out.println(myCar == yourCar); //false가 나옴. 객체의 번지가 다르기 때문.
		System.out.println(myCar == myCar2); //false가 나옴. 객체의 번지가 다르기 때문.
		System.out.println(stu1 == stu2); //false
		System.out.println(stu3 == stu1); //true: 같은 객체 공유.
	}
}

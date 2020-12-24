package sec02;

public class Example {

	public static void main(String[] args) {
		int result = method("65");
		System.out.println(result);

	}
	//static이 있어야 method이름만을 갖고 사용할수있다.
	public static int method(String data) {
		try {
		int value = Integer.parseInt(data);
		return value;
	} catch (NumberFormatException e/* 매개값처럼 사용이됨 왜냐면 예외도 객체를 생성함*/) {
			String message = e.getMessage();
			System.out.println(message);
			return 0;
		}finally {
			System.out.println("마무리 작업");
		}
	}
}

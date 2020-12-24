package sec07_사용자지정예외;
//예외를 class로 정의함
//extends RuntimeException (실행 예외이기 때문에 컴파일은 되고 실행중에 예외가 발생함)
public class BalanceInsufficientException extends Exception {
	//Field
	
	
	//Constructor
	public BalanceInsufficientException () {
		super();
	}
	public BalanceInsufficientException(String message) {
		super(message);
	}
	
	//Method
	
	
	//Nested
}

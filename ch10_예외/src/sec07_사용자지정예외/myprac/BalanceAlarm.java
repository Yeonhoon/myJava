package sec07_사용자지정예외.myprac;

public class BalanceAlarm extends Exception{ //예외발생 처리 
	
	BalanceAlarm() {
		super();
	}

	BalanceAlarm(String message) {
		super(message);
	}
	
}

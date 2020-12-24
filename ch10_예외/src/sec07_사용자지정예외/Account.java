package sec07_사용자지정예외;

public class Account {
	// Field
	private long balance;

	// Constructor

	// Method
	public long getBalance() {
		return balance;
	}

	public void deposit(int money) {
		this.balance = money;
	}

	public void withdraw(int money) throws BalanceInsufficientException { // throw: 예외처리를 메소드 호출로 넘김
		if (balance < money) { // throw가 없을 경우, method 선언부분에서 예외처리
			// 예외를 발생
//			new Exception();
			// throw다음의 예외객체를 발생시킨다.
			throw new BalanceInsufficientException("잔고가 부족합니다.");
		} else if (balance >= money) {
			balance = balance - money;
		}
	}
}

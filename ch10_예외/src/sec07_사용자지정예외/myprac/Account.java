package sec07_사용자지정예외.myprac;

import sec07_사용자지정예외.BalanceInsufficientException;

public class Account {

	private int balance;
	
	public long getBalance() {
		return balance;
	};
	
	public void deposit(int money) {
		balance += money;
	}
	
	public void withdraw(int money) throws BalanceAlarm {
		if(balance < money) {
			throw new BalanceAlarm("잔액이 부족합니다");
			
		} else{
			balance -= money;
		}
	}
	
}

package sec07_사용자지정예외.myprac;

import java.text.DecimalFormat;

public class Account {
	DecimalFormat decimal = new DecimalFormat("###,###"); // 숫자 단위 바꿔주는 
	private int balance;
	
	public String getBalance() {
		return decimal.format(balance);
	}
	
	public void deposit(int money) {
		balance += money;
	}
	
	public void withdraw(int money) throws BalanceAlarm{
		if(balance < money) {
			throw new BalanceAlarm("잔액이 부족합니다. 인출가능한 최대 금액은 "+ decimal.format(balance) + "원 입니다.");
			//메소드 선언에서 예외처리하지 않고 떠넘기기.

		} else {
			balance -= money;
		}
	}
	
	
}

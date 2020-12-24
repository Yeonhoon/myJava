package sec07_�������������.myprac;

import sec07_�������������.BalanceInsufficientException;

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
			throw new BalanceAlarm("�ܾ��� �����մϴ�");
			
		} else{
			balance -= money;
		}
	}
	
}

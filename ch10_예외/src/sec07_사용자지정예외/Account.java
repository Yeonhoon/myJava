package sec07_�������������;

public class Account {
	//Field
	private long balance;
	
	//Constructor
	
	
	//Method
	public long getBalance() {
		return balance;
	}
	
	public void deposit(int money) {
		this.balance = money;
	}
	
	public void withdraw(int money) throws BalanceInsufficientException  {
		if (balance <money) {
			//���ܸ� �߻�
//			new Exception();
			//throw������ ���ܰ�ü�� �߻���Ų��. 
			throw new BalanceInsufficientException("�ܰ� �����մϴ�.");
		} else if (balance >= money) {
			balance = balance - money;
		}
	}
}

package sec07_�������������.myprac;

import java.text.DecimalFormat;

public class Account {
	DecimalFormat decimal = new DecimalFormat("###,###"); // ���� ���� �ٲ��ִ� 
	private int balance;
	
	public String getBalance() {
		return decimal.format(balance);
	}
	
	public void deposit(int money) {
		balance += money;
	}
	
	public void withdraw(int money) throws BalanceAlarm{
		if(balance < money) {
			throw new BalanceAlarm("�ܾ��� �����մϴ�. ���Ⱑ���� �ִ� �ݾ��� "+ decimal.format(balance) + "�� �Դϴ�.");
			//�޼ҵ� ���𿡼� ����ó������ �ʰ� ���ѱ��.

		} else {
			balance -= money;
		}
	}
	
	
}

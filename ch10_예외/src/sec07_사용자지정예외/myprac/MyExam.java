package sec07_�������������.myprac;

public class MyExam {
	public static void main(String[] args) {

		
		
		
		Account account = new Account();
		
		account.deposit(100000);
		
		
		System.out.println("�ܾ�:" + account.getBalance());
		
		try {
			account.withdraw(1000000);
		} catch(BalanceAlarm e) {
			String msg = e.getMessage();
			System.out.println(msg);
		}

	}
	
	
}

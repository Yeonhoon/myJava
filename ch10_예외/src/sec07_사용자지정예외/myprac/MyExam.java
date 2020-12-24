package sec07_사용자지정예외.myprac;

public class MyExam {
	public static void main(String[] args) {

		
		
		
		Account account = new Account();
		
		account.deposit(100000);
		
		
		System.out.println("잔액:" + account.getBalance());
		
		try {
			account.withdraw(1000000);
		} catch(BalanceAlarm e) {
			String msg = e.getMessage();
			System.out.println(msg);
		}

	}
	
	
}

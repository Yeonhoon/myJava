package sec07_사용자지정예외;

public class Example {

	public static void main(String[] args) {
		Account account = new Account();
		account.deposit(1000);
		System.out.println(account.getBalance());
		
		try {
			account.withdraw(5000);
		} catch (BalanceInsufficientException e) {
			String message = e.getMessage();
			//account에서 받은 message를 얻기위해서 
			System.out.println(message);
			//예외 발생 코드 추적
			e.printStackTrace();
		}
		System.out.println(account.getBalance());
	}

}

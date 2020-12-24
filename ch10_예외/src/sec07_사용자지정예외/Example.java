package sec07_�������������;

public class Example {

	public static void main(String[] args) {
		Account account = new Account();
		account.deposit(1000);
		System.out.println(account.getBalance());
		
		try {
			account.withdraw(5000);
		} catch (BalanceInsufficientException e) {
			String message = e.getMessage();
			//account���� ���� message�� ������ؼ� 
			System.out.println(message);
			//���� �߻� �ڵ� ����
			e.printStackTrace();
		}
		System.out.println(account.getBalance());
	}

}

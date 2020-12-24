package sec07_사용자지정예외.myprac;

import java.text.DecimalFormat;

public class MyExam {

	public static void main(String[] args) {
		Account account = new Account();

		// 예금하기
		account.deposit(1000000);

		// 잔액 확인
		System.out.println("잔액: " + account.getBalance());

		// 출금하기
		try {
			account.withdraw(100000000);
		} catch (BalanceAlarm e) {
			String msg = e.getMessage();
			System.out.println(msg);
			e.printStackTrace(); // 에러 메시지 표출해주기
		}
	}

}

package sec07_�������������.myprac;

import java.text.DecimalFormat;

public class MyExam {

	public static void main(String[] args) {
		Account account = new Account();

		// �����ϱ�
		account.deposit(1000000);

		// �ܾ� Ȯ��
		System.out.println("�ܾ�: " + account.getBalance());

		// ����ϱ�
		try {
			account.withdraw(100000000);
		} catch (BalanceAlarm e) {
			String msg = e.getMessage();
			System.out.println(msg);
			e.printStackTrace(); // ���� �޽��� ǥ�����ֱ�
		}
	}

}

package sec02;

public class Example {

	public static void main(String[] args) {
		int result = method("");
		System.out.println(result);
	}

	// static�� �־�� method�̸����� ���� ����Ҽ��ִ�.
	public static int method(String data) {

		try {
			int value = Integer.parseInt(data); //���ڿ��� ����������
			return value;
		} catch (NumberFormatException e/* �Ű���ó�� ����̵� �ֳĸ� ���ܵ� ��ü�� ������ */) {
			String message = e.getMessage();
			System.out.println(message);
			return 0;
		} finally {
			System.out.println("������ �۾�");
			
		}
	}
}

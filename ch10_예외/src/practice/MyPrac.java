package practice;

public class MyPrac {

	public static void main(String[] args) {
		int result = method("124");
		System.out.println(result);

		try {
			int[] arr = { 8, 6, 3 };
			for (int i = 0; i < arr.length; i++) {
				arr[i] = i;

				String data = "1p259";
				int value = Integer.parseInt(data);
				System.out.println(value);

			}

		} catch (ArrayIndexOutOfBoundsException e) {
			String msg = e.getMessage();
			System.out.println(msg);

		} catch (Exception e) {
			System.out.println("�˼����� �����߻�");
		}

	}

	public static int method(String data) {
		try {
			int a = Integer.parseInt(data);
			return a;
		} catch (NumberFormatException e) {
			String message = e.getMessage();
			System.out.println("�����߻�����: " + message);
			System.out.println("���� �߻�");
			System.out.println("�Էµ� ���� ���ڰ� �ƴ�");
		}

		return 0;

	}

}

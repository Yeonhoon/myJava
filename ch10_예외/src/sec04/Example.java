package sec04;

public class Example {

	//catch ����� ���������� �Ѱ��� catch�� �����
	//try�� ������ �Ǹ鼭 �ϳ��� ������ ���� �ٷ� catch�� ���� ������ �Ǳ⶧����
	public static void main(String[] args) {
	
		try {
			int [] arr = {0,0,0};
			for (int i=0; i<arr.length; i++) {
				System.out.println(arr[i]);
			}
		String data = "1o";
		int value = Integer.parseInt(data);	
//			catch�� ������ ������ �Ʒ��� ���⶧���� Exception e�� �������� �巯������
		} catch (ArrayIndexOutOfBoundsException | NumberFormatException e) {
			System.out.println("���ڰ� �ƴմϴ�.");
			
		} catch (Exception e) {/*��翹�ܰ� exception�� �ڽ��̱⶧���� ��� ���ܰ� �ش��*/
			System.out.println("�� �� ���� ���ܰ� �߻���");
		}
	}
}

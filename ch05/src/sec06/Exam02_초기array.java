package sec06;

public class Exam02_�ʱ�array {

	public static void main(String[] args) {
		// �迭�� ���鋚 �⺻���� �������� �ʰ�, new 'type'[]���� �Ѵٸ� 0�� �ǹ̸� ���� �ʱⰪ���� ������. 0/0.0/false/null
		int[] array = new int[5]; 
		double[] arr = new double[5];
		boolean[] arr2 = new boolean[5];
		String[] arr3 = new String[5];

		for(int i = 0; i<array.length; i++) {
			System.out.print(array[i] + ", ");
			System.out.print(arr[i] + ", ");
			System.out.print(arr2[i] + ", ");
			System.out.print(arr3[i] + ", ");

		}
		System.out.println();
	}

}

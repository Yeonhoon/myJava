package sec06;

import java.util.Scanner;

public class Exam04 {

	public static void main(String[] args) {
		
		int[] arr = new int[5]; 
		
		Scanner scanner = new Scanner(System.in); //new: ��ü���� ������, System.in: Ű����� �Է��� , 
		for(int i=0; i<arr.length; i++) {
			System.out.print(i+1 + "��° �����Է�:");
			String data = scanner.nextLine();
			int score = Integer.parseInt(data); // �������� ����������. �迭���� ���� �������θ� �Է����־�� ��. int�� �������ε� �ԷµǴ� data�� ���ڿ��̹Ƿ�
			arr[i] = score;
		}
		
		int sum= 0;
		for(int j = 0; j<arr.length;j++) {
			sum += arr[j];
		}
		
		double avg = (double)sum/arr.length;
		System.out.println("���:" + avg);


	}

}

package practice;

import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// ���� �迭
		int[] arr1 = {12,54,3,468,123};
		String[] arr_str = {"a","b","c","d","e"};
		String[] arr_str_a = new String[5];

		for(int i=0; i<arr1.length;i++) {
			System.out.print(arr1[i]+ "\t");
			System.out.print(arr_str[i] + "\t");
			
		} System.out.println();

		int[] part = {1,3,5,7,9};
		int[] arr1_a = new int[5];
		for(int i=0; i<arr1_a.length; i++) {
			arr1_a[i]=part[i];
			System.out.print(arr1_a[i] + "\t");
		} System.out.println();
		
		Scanner scanner = new Scanner(System.in);
		
		// ������ �迭
		
		int[][] arr2 = new int[4][10];
		
		for(int i=0;i<arr2.length; i++) {
			for(int j=0; j<arr2[i].length; j++) {
				System.out.print("("+i+ ","+j+")");
			} System.out.println();
		}
		
		// ���ڹ迭 �Է��ϱ� -------------------------------------------------
		String [][] arr2_str = new String[3][5];
		for (int i=0; i<arr2_str.length; i++) {

			System.out.print("�̸�");
			arr2_str[i][0]= scanner.nextLine();
			System.out.print("����");
			arr2_str[i][1]= scanner.nextLine();
			System.out.print("����");
			arr2_str[i][2]= scanner.nextLine();
			System.out.print("�з�");
			arr2_str[i][3]= scanner.nextLine();
			System.out.print("����");
			arr2_str[i][4]= scanner.nextLine();
			

			} 

		// �Է��� ���ڹ迭 ��� -------------------------------------------------
		System.out.println("---------------");
		for(int k=0; k<arr2_str.length; k++) {
			System.out.print(arr2_str[k][0] + " | "); 
			System.out.print(arr2_str[k][1] + " | "); 
			System.out.print(arr2_str[k][2] + " | "); 
			System.out.print(arr2_str[k][3] + " | "); 
			System.out.print(arr2_str[k][4] + " | "+"\n"); 
			
		}
		System.out.println("---------------");
		
		// �Է��� ���ڹ迭 �����Ͽ� ����
		System.out.println("���° ���� ���ðڽ��ϱ�?");
		int a = Integer.parseInt(scanner.nextLine());
		for(int i=0; i<arr2_str[0].length; i++) {
			System.out.print(arr2_str[a-1][i]+",");

		}
	
	}
	
}
package sec06;

import java.util.Scanner;

public class practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int nb =1;
		Scanner scanner = new Scanner(System.in);
		String[][] boards = new String[100][4];

		System.out.println("----------------------------------");
		for(nb = 1; nb<10; nb++) {
			for(int j=0; j<boards[nb].length; j++) {
				System.out.println(j+1+"번째 숫자를 입력해봐라");
				boards[nb][j]=scanner.nextLine();

				
		

			} System.out.print(boards + " | ");
			
			

			
			// 탈출해야함.

			System.out.println();
		}
		System.out.println("----------------------------------");


	

	}

}

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
				System.out.println(j+1+"��° ���ڸ� �Է��غ���");
				boards[nb][j]=scanner.nextLine();

				
		

			} System.out.print(boards + " | ");
			
			

			
			// Ż���ؾ���.

			System.out.println();
		}
		System.out.println("----------------------------------");


	

	}

}

package sec06;

import java.util.Scanner;

public class Exam09_다차원배열4 {

	public static void main(String[] args) {
		
		int[][] scores = {
				{90,80,70,},
				{95,80,70,}
		};
		
	
		for(int i=0; i<scores.length; i++) {
			for(int j=0; j<scores[i].length; j++) {
				System.out.println("scores["+i+"]["+j+"]:"+ scores[i][j]);
			}
		}

	}

}

package practice;

import java.util.Scanner;

public class Array2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 단일 배열
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
		
		
		
		// 이차원 배열
		
		int[][] arr2 = new int[4][10];
		
		for(int i=0;i<arr2.length; i++) {
			for(int j=0; j<arr2[i].length; j++) {
				System.out.print("("+i+ ","+j+")");
			} System.out.println();
		}
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("-------------------------------");
		System.out.println("원하시는 작업을 고르시오");
		System.out.println("a | b | c | d | end");
		String work = scanner.nextLine();
		System.out.println("-------------------------------");
		
		String[][] boards = new String[3][3]; 
		int number =1;
		while(true) {
			// 목록 만들기
			if(work.equals("a")) {
				for(int i=0; i<boards.length; i++) {
					for(int j=0; j<boards[i].length; j++) {
						System.out.print(boards[i][j]);
					} System.out.println();
				}
			// 게시물 생성하기
			} else if(work.equals("b")) {
				int index = number - 1;
				if(boards[index][0]!=null) {
					number ++;} 
				boards[index] = new String [] {"a","b","c"};
				System.out.println(number + "번 게시물의 제목은?");
				boards[index][0] = scanner.nextLine();
				System.out.println(number + "번 게시물의 작가는?");
				boards[index][1] = scanner.nextLine();
				System.out.println(number + "번 게시물의 유형은?");
				boards[index][2] = scanner.nextLine();

		
				
			} else if(work.equals("c")) {
				System.out.println("몇번째 게시물?");
//				for(int i; i<boards.length;i++) {
					
//				}
			} else if(work.equals("d")) {
				
			} else if(work.equals("end")){
				System.out.println("Bye Bye");
				break;
			}
			
		}
		
		
		
		
	}
	
	

}

package Homework;

import java.util.Scanner;

public class Homework_연습 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Board board = new Board();
		
		Board [] boards_form = new Board[100];
		
//		board.setNum(1);
//		board.setTitle("제목");
//		board.setContent("내용");
//		board.setWriter("장연훈");
//		boards_form[0]= board;
//		
//		System.out.print(board.getNum() +" | ");
//		System.out.print(board.getTitle()+ " | ");
//		System.out.print(board.getContent()+" | ");
//		System.out.print(board.getWriter()+" | ");
//
//		board.setNum(2);
//		board.setTitle("제목2");
//		board.setContent("내용2");
//		board.setWriter("장연훈2");
//		boards_form[1]= board;
//		
//		
//		System.out.print(boards_form[1].getNum() + " | ");
//		System.out.print(boards_form[1].getTitle()+ " | ");
//		System.out.print(boards_form[1].getContent()+ " | ");
//		System.out.print(boards_form[1].getWriter()+ " | ");
//			
		//결과를 한번에 출력할 수 있어야
		Scanner scanner = new Scanner(System.in);
		for(int i=0; i<2;i++) {
			Board board_new = new Board();
			String text1 = scanner.nextLine();
			board_new.setTitle(text1);
			String text2 = scanner.nextLine();
			board_new.setContent(text2);
			String text3 = scanner.nextLine();
			board_new.setWriter(text3);
			boards_form[i]=board_new;
			
			if(board_new !=null) {
				break;
			}
		}
		
		for(int i=0; i<2;i++) {
			System.out.print(boards_form[i].getNum() + " | ");
			System.out.print(boards_form[i].getTitle()+ " | ");
			System.out.print(boards_form[i].getContent()+ " | ");
			System.out.print(boards_form[i].getWriter()+ " | "+ "\n");
			
			if(boards_form[i+1]==null) {
				break;
			}
			
		}	
		
		
	}

}

package Homework;


public class Practice {

	public static void main(String[] args) {
		
		// class와 1차원 배열 ==> 객체로 활용하기
		Board[] board_list = new Board[100];
	
		// board 객체를 만들어서 boards 배열에 넣는 것.
		
		// 새로운 게시물 저장
		Board board1 = new Board();
		board1.setNum(1);
		board1.setTitle("제목1");
		board1.setContent("내용1");
		board1.setWriter("글쓴이1");
		board_list[0] = board1;

		Board board2 = new Board();
		board2.setNum(2);
		board2.setTitle("제목2");
		board2.setContent("내용2");
		board2.setWriter("글쓴이2");
		board_list[1] = board2;

		Board board3 = new Board();
		board3.setNum(3);
		board3.setTitle("제목3");
		board3.setContent("내용3");
		board3.setWriter("글쓴이3");
		board_list[2] = board3;
		

		// 게시물 삭제
		board_list[0] = null;
		board_list[1] = null;
		board_list[2] = null;
		
		// 게시물 번호가 2인 게시물 삭제 = 해당 게시물의 번지를 없앤다.
		for(int i =0; i<board_list.length; i++) {
			Board board = board_list[i]; //번지 얻기
			if(board_list[i] != null && board.getNum() == 2) {
				board_list[i]=null;
			}
		}
		
		// 게시물 번호가 2번인 게시물 수정 //제목과 내용만 변경됨
		for(int i =0; i<board_list.length; i++) {
			Board board = board_list[i]; //번지 얻기
			if(board_list[i] != null && board.getNum() == 2) {
				board.setTitle("수정된 제목");
				board.setContent("수정된 내용");
				board.setWriter("수정된 글쓴이");
			}
		}
				
		// 게시물 목록 보기
		System.out.println("-------------------------------");
		for(int i=0; i<board_list.length; i++) {
			Board board = board_list[i];
			if(board_list[i] != null) {
				System.out.println(board.getNum() + "\t");
				System.out.println(board.getTitle() + "\t");
				System.out.println(board.getContent() + "\t");
				System.out.println(board.getWriter() + "\t");
				}
			}
		System.out.println("-------------------------------");
	}
	
}

	


	

package sec02_list;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Vector;

public class ListExample02 {
	public static void main(String[] args) {

		List<Board> list = new Vector<Board>(); //다른 리스트의 객체 와도 상관없음. 사용방법이 달라지는 것은 아님. 성능이 달라짐.

		// 저장
		for (int i = 0; i < 10; i++) {
			Board board = new Board();
			board.setNum(i);
			board.setTitle("제목" + i);
			board.setContent("내용" + i);
			board.setWriter("글쓴이" + i);
			board.setDate(new Date());
			list.add(board);
		}
		System.out.println(list.size() + "개가 저장됨");

		// 가져오기
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd");	
		for(Board board : list) {
			System.out.print(board.getNum() + " | ");
			System.out.print(board.getTitle() + " | ");
			System.out.print(board.getContent() + " | ");
			System.out.print(board.getWriter() + " | ");
			System.out.print(sdf.format(board.getDate()) + " | ");
			System.out.println();
		} 
	}
}

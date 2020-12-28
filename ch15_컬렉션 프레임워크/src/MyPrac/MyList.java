package MyPrac;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Vector;

import sec02_list.Board;

public class MyList {
	public static void main(String[] args) {

		List myList = new ArrayList();

		myList.add("A");

		// 1. list 하나하나씩 반환하기: add한 길이만큼 get할수 있음.
		System.out.println(myList.get(0));

		// 2. generic list 선언하기
		List<Board> myList2 = new Vector<Board>();

		// 3. 반복문으로 객체 생성 후 한번에 list에 넣기
		for (int i = 1; i < 11; i++) {
			Board board = new Board();
			board.setNum(i);
			board.setTitle("제목" + i);
			board.setContent("내용" + i);
			board.setWriter("저자" + i);
			board.setDate(new Date());
			myList2.add(board); // 생성한 객체를 반드시 list에 넣어주자!
		}
		System.out.println(myList2.size() + "개가 선언됨");
		
		// 4. 생성한 list 호출하기

		SimpleDateFormat sdf = new SimpleDateFormat("yy-MM-dd");

		for (Board board : myList2) {
			System.out.print(board.getNum() + " | ");
			System.out.print(board.getTitle() + " | ");
			System.out.print(board.getContent() + " | ");
			System.out.print(board.getWriter() + " | ");
			System.out.print(sdf.format(board.getDate()) + " | ");
			System.out.println();
		}

	}
}

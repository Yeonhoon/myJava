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

		// 1. list �ϳ��ϳ��� ��ȯ�ϱ�: add�� ���̸�ŭ get�Ҽ� ����.
		System.out.println(myList.get(0));

		// 2. generic list �����ϱ�
		List<Board> myList2 = new Vector<Board>();

		// 3. �ݺ������� ��ü ���� �� �ѹ��� list�� �ֱ�
		for (int i = 1; i < 11; i++) {
			Board board = new Board();
			board.setNum(i);
			board.setTitle("����" + i);
			board.setContent("����" + i);
			board.setWriter("����" + i);
			board.setDate(new Date());
			myList2.add(board); // ������ ��ü�� �ݵ�� list�� �־�����!
		}
		System.out.println(myList2.size() + "���� �����");
		
		// 4. ������ list ȣ���ϱ�

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

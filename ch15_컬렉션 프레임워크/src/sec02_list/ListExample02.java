package sec02_list;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Vector;

public class ListExample02 {
	public static void main(String[] args) {

		List<Board> list = new Vector<Board>(); //�ٸ� ����Ʈ�� ��ü �͵� �������. ������� �޶����� ���� �ƴ�. ������ �޶���.

		// ����
		for (int i = 0; i < 10; i++) {
			Board board = new Board();
			board.setNum(i);
			board.setTitle("����" + i);
			board.setContent("����" + i);
			board.setWriter("�۾���" + i);
			board.setDate(new Date());
			list.add(board);
		}
		System.out.println(list.size() + "���� �����");

		// ��������
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

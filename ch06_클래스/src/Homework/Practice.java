package Homework;


public class Practice {

	public static void main(String[] args) {
		
		// class�� 1���� �迭 ==> ��ü�� Ȱ���ϱ�
		Board[] board_list = new Board[100];
	
		// board ��ü�� ���� boards �迭�� �ִ� ��.
		
		// ���ο� �Խù� ����
		Board board1 = new Board();
		board1.setNum(1);
		board1.setTitle("����1");
		board1.setContent("����1");
		board1.setWriter("�۾���1");
		board_list[0] = board1;

		Board board2 = new Board();
		board2.setNum(2);
		board2.setTitle("����2");
		board2.setContent("����2");
		board2.setWriter("�۾���2");
		board_list[1] = board2;

		Board board3 = new Board();
		board3.setNum(3);
		board3.setTitle("����3");
		board3.setContent("����3");
		board3.setWriter("�۾���3");
		board_list[2] = board3;
		

		// �Խù� ����
		board_list[0] = null;
		board_list[1] = null;
		board_list[2] = null;
		
		// �Խù� ��ȣ�� 2�� �Խù� ���� = �ش� �Խù��� ������ ���ش�.
		for(int i =0; i<board_list.length; i++) {
			Board board = board_list[i]; //���� ���
			if(board_list[i] != null && board.getNum() == 2) {
				board_list[i]=null;
			}
		}
		
		// �Խù� ��ȣ�� 2���� �Խù� ���� //����� ���븸 �����
		for(int i =0; i<board_list.length; i++) {
			Board board = board_list[i]; //���� ���
			if(board_list[i] != null && board.getNum() == 2) {
				board.setTitle("������ ����");
				board.setContent("������ ����");
				board.setWriter("������ �۾���");
			}
		}
				
		// �Խù� ��� ����
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

	


	

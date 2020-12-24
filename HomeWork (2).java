package sec06;

import java.util.Scanner;

public class HomeWork {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		//게시물이 저장되는 배열
		String[][] boards = new String[100][4];
		
		//게시물을 새로 저장할때 마다 1씩 증가 되어야 합니다.
		int nextBno = 1;
		
		while(true) {
			System.out.println("-------------------------------------------------");
			System.out.println("1:목록 | 2:생성 | 3:상세보기 | 4:수정 | 5:삭제 | 6:종료");
			System.out.println("-------------------------------------------------");
			System.out.print("번호 선택:");
			int selectNo = Integer.parseInt(scanner.nextLine());
			if(selectNo == 1) {
				System.out.println("목록을 보여줘야 합니다.");
			} else if(selectNo == 2) {
				System.out.println("새로운 게시물을 입력을 받아서 저장해야 합니다.(제목, 내용, 글쓴이)");
				System.out.println("게시물 번호는 입력을 받지 않고 nextBno의 값으로 저장해야 합니다.");
				System.out.println("게시물의 저장 위치는 게시물 번호가 null인 곳을 찾아서 저장해야 합니다.");
			} else if(selectNo == 3) {
				System.out.println("게시물 번호를 입력 받아서 해당 게시물의 게시물을 보여줘야 합니다.");
			} else if(selectNo == 4) {
				System.out.println("게시물 번호를 입력 받아서 해당 게시물의 제목과 내용을 입력받고 수정해야 합니다.");
			} else if(selectNo == 5) {
				System.out.println("게시물 번호를 입력 받아서 해당 게시물의 게시물을 삭제합니다.");
			} else if(selectNo == 6) {
				break;
			}
		}

	}

}

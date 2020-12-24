package sec06;

import java.util.Scanner;

public class Homework {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int nb = 1; // 게시물을 새로 저장할때마다 1씩 증가해야함.

		//게시물 저장되는 배열
		String[][] boards = new String[100][4];
		
		//1.목록 생성
		
		//2.게시물 입력
		boards[0] =new String[] {"제목","내용","글쓴이"}; 
		
		//3.게시물 상세보기
		//4.게시물 수정
		//5.게시물 삭제
		
		
		while(true) {
			System.out.println("--------------------------------------------------");
			System.out.println("1:목록 | 2:생성 | 3:상세보기 | 4:수정 | 5:삭제 | 6:종료");
			System.out.println("--------------------------------------------------");
			System.out.print("번호 선택:");
			int selectNum = Integer.parseInt(scanner.nextLine());

			
			if(selectNum ==1) {
				System.out.println("목록을 보여줘야합니다.");
				for(nb=1; nb<boards.length;nb++) {
					System.out.println(nb+ "\t");
				}
				
			} else if(selectNum ==2) {
				System.out.println("새로운 게시물을 입력받아서 저장해야 합니다(제목, 내용, 글쓴이).");			
				System.out.print("게시물 번호:");
				int input_num = Integer.parseInt(scanner.nextLine());
				

				System.out.print("제목과 내용, 글쓴이를 입력하세요");
				boards[selectNum]= new String[](scanner.nextLine());
				



				// 게시물 번호는 nextBno의 값으로 저장해야 함.
				// 게시물의 저장 위치는 게시물 번호가 null인 곳을 찾아서 저장해야 함.(번호에 맞게 알아서 위치찾아서 들어감)
			} else if(selectNum ==3) {
				System.out.println("인덱스 번호를 입력받아서 해당 인덱스 번호의 게시물을 보여줘야 합니다.");
			} else if(selectNum ==4) {
				System.out.println("인덱스 번호를 입력받아서 해당 인덱스의 제목과 내용을 입력받고 수정해야 합니다.");
			} else if(selectNum ==5) {
				System.out.println("인덱스 번호를 입력받아서 해당 인덱스의 게시물을 삭제합니다.");
			} else if(selectNum ==6) {
				break;
			} 

		}
		
	}

}

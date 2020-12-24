package Homework;

import java.util.Scanner;

public class Homework {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int nb = 1; // 게시물을 새로 저장할때마다 1씩 증가해야함.

		//게시물 저장되는 배열
		Board [] board_list = new Board[100];
		
		//1.목록 생성
				
		//2.게시물 입력
		//3.게시물 상세보기
		//4.게시물 수정
		//5.게시물 삭제
		
		
		while(true) {
			System.out.println("--------------------------------------------------");
			System.out.println("1:목록 | 2:생성 | 3:상세보기 | 4:수정 | 5:삭제 | 6:종료");
			System.out.println("--------------------------------------------------");
			System.out.print("작업하실 번호를 선택해주세요."+"\n");
			int selectNum = Integer.parseInt(scanner.nextLine());
			
			if(selectNum ==1) {
				System.out.println("-------------------------------");
				System.out.println("순서 | 제목 | 내용 | 글쓴이");
					
					for(int i=0; i<board_list.length; i++) {

						if(board_list[i] == null) {
							System.out.println("\n"+"** 게시물이 존재하지 않습니다 **");
						} 
						else {
							System.out.print(board_list[i].getNum() + " | ");
							System.out.print(board_list[i].getTitle() + " | ");
							System.out.print(board_list[i].getContent() + " | ");
							System.out.print(board_list[i].getWriter() + " | ");
		
						} System.out.println();
						
						if(board_list[i+1]==null) {
							break;
						}
						
						System.out.println("-------------------------------");
						
					}
			} else if(selectNum ==2) {
				for(int i=0; i<board_list.length;i++) {
					int ind = i+1;
					if(board_list[i]!=null) {
						ind = i+1;}
					else {
						Board board_new = new Board();
						board_new.setNum(ind);
						System.out.print(ind + "번째 게시물의 제목" + "\n");
						String text1 = scanner.nextLine();
						board_new.setTitle(text1);
						
						System.out.print(ind + "번째 게시물의 내용"+ "\n");
						String text2 = scanner.nextLine();
						board_new.setContent(text2);
						
						System.out.print(ind + "번째 게시물의 글쓴이" + "\n");
						String text3 = scanner.nextLine();
						board_new.setWriter(text3);
						board_list[i]=board_new;
						
						System.out.print(ind + "번째 게시물이 작성되었습니다." + "\n");
						if(board_new !=null) {
							break;
						}
						}
					
				}
				
			} else if(selectNum ==3) {
				System.out.println("보고자 하는 게시물은 몇 번 게시물입니까?");
				int post = Integer.parseInt(scanner.nextLine());
				int post_num = post -1;
				if(board_list[post_num]==null) {
					System.out.println(post + "번째 게시물이 존재하지 않습니다");
					break;
				}
				else {
					Board board = board_list[post_num];
					System.out.print(board.getNum() + " | ");
					System.out.print(board.getTitle() + " | ");
					System.out.print(board.getContent() + " | ");
					System.out.print(board.getWriter() + " | ");
				}
			}
			else if(selectNum ==4) {
					System.out.println("수정하고자 하는 게시물은 몇 번 게시물입니까?");
					int revise_num = Integer.parseInt(scanner.nextLine());
					for(int i =0; i<board_list.length;) {
						Board board_revise = board_list[revise_num-1];
						if(board_list[i]!=null) {
							System.out.println(revise_num + "번 게시물을 수정합니다.");
							System.out.println("제목을 수정해주세요.");
							String revise_title= scanner.nextLine();
							board_revise.setTitle(revise_title); 
							
							System.out.println("내용을 수정해주세요.");
							String revise_content = scanner.nextLine();
							board_revise.setContent(revise_content); 
							
							System.out.println("글쓴이를 수정해주세요.");
							String revise_writer = scanner.nextLine();
							board_revise.setWriter(revise_writer); 
							
							System.out.println(revise_num + "번 게시물의 수정이 완료되었습니다.");
							board_list[revise_num-1]=board_revise;
							
							break;
						}
						else {
							System.out.println("\n"+ "** "+revise_num + "번 게시물이 존재하지 않습니다. **" + "\n");
							break;
						}
					}
			}
			 else if(selectNum ==5) {
				//System.out.println("인덱스 번호를 입력받아서 해당 인덱스의 게시물을 삭제합니다.");

					System.out.println("삭제하고자 하는 게시물은 몇 번 게시물입니까?");
					int delete_sel = Integer.parseInt(scanner.nextLine());
						if(board_list[delete_sel-1]!=null) {
							board_list[delete_sel-1]=null;
							System.out.println(delete_sel + "번 게시물이 삭제되었습니다");

						} else {
							System.out.println("\n"+ "** "+ delete_sel + "번 게시물이 존재하지 않습니다. **" + "\n");
						}
					}
			
					
				
			 
				else if(selectNum ==6) {
			System.out.println("종료합니다.");
			break;
				} else {
					System.out.println("1부터 6번을 선택해주세요");
					}
		}
		
			
	}
	
	
	
}


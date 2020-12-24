package Homework;

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
			System.out.print("작업하실 번호를 선택해주세요."+"\n");
			int selectNum = Integer.parseInt(scanner.nextLine());
			
			if(selectNum ==1) {
				//System.out.println("목록을 보여줘야합니다.");
				System.out.println("목차 | 제목 | 내용 | 글쓴이");			
				if(boards[0][0]==null) {
					System.out.println("\n" + "** 게시물이 없습니다 .**" + "\n");
				}
				else {
					for(nb=1; nb<boards.length;nb++) {
						if(boards[nb][0]!=null) {
							for(int j=0; j<boards[nb].length; j++) {
								System.out.print(boards[nb][j] + " | ");
							} System.out.println();
						}  
					}
					
				}

				
			} else if(selectNum ==2) {
				if(boards[nb]!=null) {
					nb++;}
				int ind = nb-1; 
				boards[ind] = new String[] {"index","제목","내용","글쓴이"};
				boards[ind][0]= Integer.toString(ind);
				
				System.out.print(ind + "번째 게시물의 제목" + "\n");
				String text1 =scanner.nextLine();
				boards[ind][1] = text1;
				
				System.out.print(ind + "번째 게시물의 내용"+ "\n");
				String text2 =scanner.nextLine();
				boards[ind][2] = text2;
				
				System.out.print(ind + "번째 게시물의 글쓴이" + "\n");
				String text3 =scanner.nextLine();
				boards[ind][3] = text3;
				System.out.print(ind + "번째 게시물이 작성되었습니다." + "\n");
				
				// 게시물 번호는 nextBno의 값으로 저장해야 함.
				// 게시물의 저장 위치는 게시물 번호가 null인 곳을 찾아서 저장해야 함.(번호에 맞게 알아서 위치찾아서 들어감)
			} else if(selectNum ==3) {
				//System.out.println("인덱스 번호를 입력받아서 해당 인덱스 번호의 게시물을 보여줘야 합니다.");
				System.out.println("보고자 하는 게시물은 몇 번 게시물입니까?");
				int post = Integer.parseInt(scanner.nextLine());
				for(int i=0; i<4; i++) {
					System.out.print(boards[post][i] + " | ");
				}	System.out.println();
					
			} else if(selectNum ==4) {
				//System.out.println("인덱스 번호를 입력받아서 해당 인덱스의 제목과 내용을 입력받고 수정해야 합니다.");
				while(true) {
					System.out.println("수정하고자 하는 게시물은 몇 번 게시물입니까?");
					int revise_num = Integer.parseInt(scanner.nextLine());
					if(boards[revise_num][0]!=null) {
							System.out.println(revise_num + "번 게시물을 수정합니다.");
							System.out.println("제목을 수정해주세요.");
							String revise_title = scanner.nextLine();
							boards[revise_num][1] = revise_title; 
							
							System.out.println("내용을 수정해주세요.");
							String revise_content = scanner.nextLine();
							boards[revise_num][2] = revise_content;
							
							System.out.println("글쓴이를 수정해주세요.");
							String revise_writer = scanner.nextLine();
							boards[revise_num][3] = revise_writer;
							
							System.out.println(revise_num + "번 게시물의 수정이 완료되었습니다.");
							break;
					} else {
						System.out.println("\n"+ "** "+revise_num + "번 게시물이 존재하지 않습니다. **" + "\n");
						break;
					}
					
				}
				
			} else if(selectNum ==5) {
				//System.out.println("인덱스 번호를 입력받아서 해당 인덱스의 게시물을 삭제합니다.");

					System.out.println("삭제하고자 하는 게시물은 몇 번 게시물입니까?");
					int delete_sel = Integer.parseInt(scanner.nextLine());
					if(boards[delete_sel][0]!=null) {
						boards[delete_sel] = new String[] {null,null,null,null};
						System.out.println(delete_sel + "번 게시물이 삭제되었습니다");
//						System.out.println("게시물 삭제를 종료하시겠습니까 [Y/N]?");
//						String delete_contin = scanner.nextLine();
//						if(delete_contin.equals("Y") | delete_contin.equals("y")) {
//							break;
//							
//						} else {
//							continue;
//						}
					
					} else {
						System.out.println("\n"+ "** "+ delete_sel + "번 게시물이 존재하지 않습니다. **" + "\n");
					}
				
			} else if(selectNum ==6) {
				System.out.println("종료합니다.");
				break;
			} 

		}
		
	}

}

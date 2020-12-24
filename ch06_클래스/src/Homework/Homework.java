package Homework;

import java.util.Scanner;

public class Homework {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int nb = 1; // �Խù��� ���� �����Ҷ����� 1�� �����ؾ���.

		//�Խù� ����Ǵ� �迭
		Board [] board_list = new Board[100];
		
		//1.��� ����
				
		//2.�Խù� �Է�
		//3.�Խù� �󼼺���
		//4.�Խù� ����
		//5.�Խù� ����
		
		
		while(true) {
			System.out.println("--------------------------------------------------");
			System.out.println("1:��� | 2:���� | 3:�󼼺��� | 4:���� | 5:���� | 6:����");
			System.out.println("--------------------------------------------------");
			System.out.print("�۾��Ͻ� ��ȣ�� �������ּ���."+"\n");
			int selectNum = Integer.parseInt(scanner.nextLine());
			
			if(selectNum ==1) {
				System.out.println("-------------------------------");
				System.out.println("���� | ���� | ���� | �۾���");
					
					for(int i=0; i<board_list.length; i++) {

						if(board_list[i] == null) {
							System.out.println("\n"+"** �Խù��� �������� �ʽ��ϴ� **");
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
						System.out.print(ind + "��° �Խù��� ����" + "\n");
						String text1 = scanner.nextLine();
						board_new.setTitle(text1);
						
						System.out.print(ind + "��° �Խù��� ����"+ "\n");
						String text2 = scanner.nextLine();
						board_new.setContent(text2);
						
						System.out.print(ind + "��° �Խù��� �۾���" + "\n");
						String text3 = scanner.nextLine();
						board_new.setWriter(text3);
						board_list[i]=board_new;
						
						System.out.print(ind + "��° �Խù��� �ۼ��Ǿ����ϴ�." + "\n");
						if(board_new !=null) {
							break;
						}
						}
					
				}
				
			} else if(selectNum ==3) {
				System.out.println("������ �ϴ� �Խù��� �� �� �Խù��Դϱ�?");
				int post = Integer.parseInt(scanner.nextLine());
				int post_num = post -1;
				if(board_list[post_num]==null) {
					System.out.println(post + "��° �Խù��� �������� �ʽ��ϴ�");
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
					System.out.println("�����ϰ��� �ϴ� �Խù��� �� �� �Խù��Դϱ�?");
					int revise_num = Integer.parseInt(scanner.nextLine());
					for(int i =0; i<board_list.length;) {
						Board board_revise = board_list[revise_num-1];
						if(board_list[i]!=null) {
							System.out.println(revise_num + "�� �Խù��� �����մϴ�.");
							System.out.println("������ �������ּ���.");
							String revise_title= scanner.nextLine();
							board_revise.setTitle(revise_title); 
							
							System.out.println("������ �������ּ���.");
							String revise_content = scanner.nextLine();
							board_revise.setContent(revise_content); 
							
							System.out.println("�۾��̸� �������ּ���.");
							String revise_writer = scanner.nextLine();
							board_revise.setWriter(revise_writer); 
							
							System.out.println(revise_num + "�� �Խù��� ������ �Ϸ�Ǿ����ϴ�.");
							board_list[revise_num-1]=board_revise;
							
							break;
						}
						else {
							System.out.println("\n"+ "** "+revise_num + "�� �Խù��� �������� �ʽ��ϴ�. **" + "\n");
							break;
						}
					}
			}
			 else if(selectNum ==5) {
				//System.out.println("�ε��� ��ȣ�� �Է¹޾Ƽ� �ش� �ε����� �Խù��� �����մϴ�.");

					System.out.println("�����ϰ��� �ϴ� �Խù��� �� �� �Խù��Դϱ�?");
					int delete_sel = Integer.parseInt(scanner.nextLine());
						if(board_list[delete_sel-1]!=null) {
							board_list[delete_sel-1]=null;
							System.out.println(delete_sel + "�� �Խù��� �����Ǿ����ϴ�");

						} else {
							System.out.println("\n"+ "** "+ delete_sel + "�� �Խù��� �������� �ʽ��ϴ�. **" + "\n");
						}
					}
			
					
				
			 
				else if(selectNum ==6) {
			System.out.println("�����մϴ�.");
			break;
				} else {
					System.out.println("1���� 6���� �������ּ���");
					}
		}
		
			
	}
	
	
	
}


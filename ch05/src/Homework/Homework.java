package Homework;

import java.util.Scanner;

public class Homework {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int nb = 1; // �Խù��� ���� �����Ҷ����� 1�� �����ؾ���.

		//�Խù� ����Ǵ� �迭
		String[][] boards = new String[100][4];
		
		//1.��� ����
		//2.�Խù� �Է�
		boards[0] =new String[] {"����","����","�۾���"}; 
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
				//System.out.println("����� ��������մϴ�.");
				System.out.println("���� | ���� | ���� | �۾���");			
				if(boards[0][0]==null) {
					System.out.println("\n" + "** �Խù��� �����ϴ� .**" + "\n");
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
				boards[ind] = new String[] {"index","����","����","�۾���"};
				boards[ind][0]= Integer.toString(ind);
				
				System.out.print(ind + "��° �Խù��� ����" + "\n");
				String text1 =scanner.nextLine();
				boards[ind][1] = text1;
				
				System.out.print(ind + "��° �Խù��� ����"+ "\n");
				String text2 =scanner.nextLine();
				boards[ind][2] = text2;
				
				System.out.print(ind + "��° �Խù��� �۾���" + "\n");
				String text3 =scanner.nextLine();
				boards[ind][3] = text3;
				System.out.print(ind + "��° �Խù��� �ۼ��Ǿ����ϴ�." + "\n");
				
				// �Խù� ��ȣ�� nextBno�� ������ �����ؾ� ��.
				// �Խù��� ���� ��ġ�� �Խù� ��ȣ�� null�� ���� ã�Ƽ� �����ؾ� ��.(��ȣ�� �°� �˾Ƽ� ��ġã�Ƽ� ��)
			} else if(selectNum ==3) {
				//System.out.println("�ε��� ��ȣ�� �Է¹޾Ƽ� �ش� �ε��� ��ȣ�� �Խù��� ������� �մϴ�.");
				System.out.println("������ �ϴ� �Խù��� �� �� �Խù��Դϱ�?");
				int post = Integer.parseInt(scanner.nextLine());
				for(int i=0; i<4; i++) {
					System.out.print(boards[post][i] + " | ");
				}	System.out.println();
					
			} else if(selectNum ==4) {
				//System.out.println("�ε��� ��ȣ�� �Է¹޾Ƽ� �ش� �ε����� ����� ������ �Է¹ް� �����ؾ� �մϴ�.");
				while(true) {
					System.out.println("�����ϰ��� �ϴ� �Խù��� �� �� �Խù��Դϱ�?");
					int revise_num = Integer.parseInt(scanner.nextLine());
					if(boards[revise_num][0]!=null) {
							System.out.println(revise_num + "�� �Խù��� �����մϴ�.");
							System.out.println("������ �������ּ���.");
							String revise_title = scanner.nextLine();
							boards[revise_num][1] = revise_title; 
							
							System.out.println("������ �������ּ���.");
							String revise_content = scanner.nextLine();
							boards[revise_num][2] = revise_content;
							
							System.out.println("�۾��̸� �������ּ���.");
							String revise_writer = scanner.nextLine();
							boards[revise_num][3] = revise_writer;
							
							System.out.println(revise_num + "�� �Խù��� ������ �Ϸ�Ǿ����ϴ�.");
							break;
					} else {
						System.out.println("\n"+ "** "+revise_num + "�� �Խù��� �������� �ʽ��ϴ�. **" + "\n");
						break;
					}
					
				}
				
			} else if(selectNum ==5) {
				//System.out.println("�ε��� ��ȣ�� �Է¹޾Ƽ� �ش� �ε����� �Խù��� �����մϴ�.");

					System.out.println("�����ϰ��� �ϴ� �Խù��� �� �� �Խù��Դϱ�?");
					int delete_sel = Integer.parseInt(scanner.nextLine());
					if(boards[delete_sel][0]!=null) {
						boards[delete_sel] = new String[] {null,null,null,null};
						System.out.println(delete_sel + "�� �Խù��� �����Ǿ����ϴ�");
//						System.out.println("�Խù� ������ �����Ͻðڽ��ϱ� [Y/N]?");
//						String delete_contin = scanner.nextLine();
//						if(delete_contin.equals("Y") | delete_contin.equals("y")) {
//							break;
//							
//						} else {
//							continue;
//						}
					
					} else {
						System.out.println("\n"+ "** "+ delete_sel + "�� �Խù��� �������� �ʽ��ϴ�. **" + "\n");
					}
				
			} else if(selectNum ==6) {
				System.out.println("�����մϴ�.");
				break;
			} 

		}
		
	}

}

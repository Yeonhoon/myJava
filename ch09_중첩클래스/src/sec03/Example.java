package sec03;

public class Example {

	public static void main(String[] args) {

		Button btnCopy = new Button(); //5. ��ư�̶�� ��ü�� ���� ���� ����
		
		//��ư�� Ŭ���� �� � ��ü�� ������� �˷��־�� ��
		class FileCopy implements Button.OnClickListener{ //6. ����Ŭ���� �����
			@Override
			public void onClick() { //���������ֱ�
				System.out.println("���� ����");
			}
		}
		
		btnCopy.setListener(new FileCopy()); // 7.Ŭ���Ͽ� ����� ��ü ����
		btnCopy.click(); 
		btnCopy.click(); 	
		btnCopy.click(); 	

		// ���� ���� -------------
		
		Button btnPlay = new Button(); 
		
		class MusicPlay implements Button.OnClickListener{

			@Override
			public void onClick() {
				System.out.println("���");
			}
		}
		btnPlay.setListener(new MusicPlay());
		btnPlay.click();
		btnPlay.click();
		btnPlay.click();
		
		
		
		
	}

}

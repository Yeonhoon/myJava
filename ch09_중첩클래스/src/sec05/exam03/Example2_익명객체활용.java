package sec05.exam03;

import sec05.exam03.Button.OnClickListener;

public class Example2_�͸�üȰ�� {

	public static void main(String[] args) {

		Button btnCopy = new Button(); //5. ��ư�̶�� ��ü�� ���� ���� ����
		
		btnCopy.setListener(new OnClickListener() { //ctrl + shift + o
			
			@Override
			public void onClick() {
				System.out.println("������ ������"); //�͸� ��ü�� ���� ����
			}
		}); // 7.Ŭ���Ͽ� ����� ��ü ����
		btnCopy.click(); 
		btnCopy.click(); 	
		btnCopy.click(); 	

		// ���� ���� -------------
		
		Button btnPlay = new Button(); 
		
		btnPlay.setListener(new OnClickListener() {
			
			@Override
			public void onClick() {
				System.out.println("���� ���");
			}
		});
		btnPlay.click();
		btnPlay.click();
		btnPlay.click();
		
		
		
		
	}

}

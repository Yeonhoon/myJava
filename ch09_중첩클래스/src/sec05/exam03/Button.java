package sec05.exam03;

public class Button {

	//field
	private OnClickListener listener; //2. �ʵ尪 ����. setter�� ���� private
	
		
	//Constructor

	//Method

	public void setListener(OnClickListener listener) { //3. �Ű������� �Է¹޴� ���� �ʵ�� ����
		this.listener = listener;
	}
	
	
	public void click() { //4. �޼ҵ�
		listener.onClick();
	}
	

	//Nested
	static interface OnClickListener{ //1.button�� Ŭ���Ǿ��� �� ������ �������
		void onClick(); //��������
	}
	
	
}

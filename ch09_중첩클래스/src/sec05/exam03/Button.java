package sec05.exam03;

public class Button {

	//field
	private OnClickListener listener; //2. 필드값 형성. setter를 위해 private
	
		
	//Constructor

	//Method

	public void setListener(OnClickListener listener) { //3. 매개변수로 입력받는 값을 필드로 저장
		this.listener = listener;
	}
	
	
	public void click() { //4. 메소드
		listener.onClick();
	}
	

	//Nested
	static interface OnClickListener{ //1.button이 클릭되었을 때 무엇이 실행될지
		void onClick(); //변수선언
	}
	
	
}

package sec05.exam03;

import sec05.exam03.Button.OnClickListener;

public class Example2_익명객체활용 {

	public static void main(String[] args) {

		Button btnCopy = new Button(); //5. 버튼이라는 객체에 대한 변수 선언
		
		btnCopy.setListener(new OnClickListener() { //ctrl + shift + o
			
			@Override
			public void onClick() {
				System.out.println("파일을 복사함"); //익명 객체를 통한 구현
			}
		}); // 7.클릭하여 실행될 객체 제공
		btnCopy.click(); 
		btnCopy.click(); 	
		btnCopy.click(); 	

		// 음악 연주 -------------
		
		Button btnPlay = new Button(); 
		
		btnPlay.setListener(new OnClickListener() {
			
			@Override
			public void onClick() {
				System.out.println("음악 재생");
			}
		});
		btnPlay.click();
		btnPlay.click();
		btnPlay.click();
		
		
		
		
	}

}

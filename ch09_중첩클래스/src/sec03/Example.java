package sec03;

public class Example {

	public static void main(String[] args) {

		Button btnCopy = new Button(); //5. 버튼이라는 객체에 대한 변수 선언
		
		//버튼이 클릭될 때 어떤 객체가 실행될지 알려주어야 함
		class FileCopy implements Button.OnClickListener{ //6. 구현클래스 만들기
			@Override
			public void onClick() { //재정의해주기
				System.out.println("파일 복사");
			}
		}
		
		btnCopy.setListener(new FileCopy()); // 7.클릭하여 실행될 객체 제공
		btnCopy.click(); 
		btnCopy.click(); 	
		btnCopy.click(); 	

		// 음악 연주 -------------
		
		Button btnPlay = new Button(); 
		
		class MusicPlay implements Button.OnClickListener{

			@Override
			public void onClick() {
				System.out.println("재생");
			}
		}
		btnPlay.setListener(new MusicPlay());
		btnPlay.click();
		btnPlay.click();
		btnPlay.click();
		
		
		
		
	}

}

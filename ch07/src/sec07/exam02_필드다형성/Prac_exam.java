package sec07.exam02_필드다형성;

public class Prac_exam {

	public static void main(String[] args) {

		Prac_Overwatch overwatch = new Prac_Overwatch();
		overwatch.dealer.call(); //overwatch 객체에서 dealer 클래스의 Dealer 소환;
		
		overwatch.dealer = new Prac_Ash();
		overwatch.dealer.call();

		overwatch.dealer = new Prac_Macree();
		overwatch.dealer.call();

		
		//객체 생성시에는 부모클래스 활용
		
	

	
	}

}

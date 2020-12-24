package sec07.exam02_필드다형성;

public class Prac_Overwatch {
	Prac_Dealer dealer = new Prac_Dealer();
	
	public void call(Prac_Dealer dealer) {
		this.dealer = dealer;
		this.dealer.call();
		
	}
	
}

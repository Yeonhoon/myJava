package sec01_Á¶°Ç¹®;

public class Exam01 {

	public static void main(String[] args) {
		// 
		boolean run = true;
		int speed= 0 ;
		int gas = 100;
		System.out.println("1");
		
		if(speed==0) {
			System.out.println("4");
			run = false;
		} else {
			System.out.println("5");
			run = true;
		}
	
		if(run) {
			System.out.println("2");
			System.out.println("3");
		}
		
		if (speed<= 60) {
			gas --; 
		} else if (speed < 80) {
			gas -= 2;
		} else if (speed <= 100) {
			gas -= 10;
		} else {
			gas -= 20;
		}
		System.out.println("Remained gas:" + gas);

	}

}

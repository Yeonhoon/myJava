package sec02_반복문;

public class Homework {

	public static void main(String[] args) {
		// 
	
		//거꾸로 출력하기
		int i;
		for(i=5; i>0; i--) {
			if(i==5) {
				System.out.print("^^^^^" + "\n");
			} else if(i==4) {
				System.out.print("^^^^" + "\n");
			} else if(i==3) {
				System.out.print("^^^" + "\n");
			} else if(i==2) {
				System.out.print("^^" + "\n");
			} else {
				System.out.print("^" + "\n");
			} 
			
		}
		// 순서대로 출력하기
		for(i=1; i<6; i++) {
			if(i==5) {
				System.out.print("^^^^^" + "\n");
			} else if(i==4) {
				System.out.print("^^^^" + "\n");
			} else if(i==3) {
				System.out.print("^^^" + "\n");
			} else if(i==2) {
				System.out.print("^^" + "\n");
			} else {
				System.out.print("^" + "\n");
			} 
			
		}
		
		// 늘어나기
		String var = "";
		for(i=0; i<5; i++) {
			var = var + "^";
			System.out.println(var);
		}
		// 줄어들기
		String var2="^^^^^^";
		for(i=6; i>0; i--) {
			var2 = var2.substring(0, var2.length()-1);
			System.out.println(var2);
		}
		
		System.out.println();


	}
	
	

}

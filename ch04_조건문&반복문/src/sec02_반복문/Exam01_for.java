package sec02_반복문;

public class Exam01_for {
	
	public static void main(String[] args) {
		
		int sum =0;
		int sum2 = 1;
		for (int i=0; i<10; i+=2) {// +=2씩 증가 ++: 1씩 증가
 			sum += i;
			System.out.println(i);
			System.out.println("Total Sum:" + sum);

		}
		for (int j=10; j>0; j--) {
			sum2 += j;
			System.out.println(j);
			System.out.println("Total Sum2:" + sum2);
			
		}
		
		// 구구단 출력
	
		for (int l=1; l<10; l++) {
			for (int k=2; k<10; k++) {
				System.out.print(k + "*" + l+ "="+ k*l + "\t");
			}
			System.out.println();
			}
		}
	
}


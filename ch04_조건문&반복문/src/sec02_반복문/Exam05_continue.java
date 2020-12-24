package sec02_반복문;

public class Exam05_continue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 1부터 100까지 합을 구할 때, 최초로 300이 되는 마지막 수는?
		
		int count =1;
		int sum = 0;
		while(true) {
			sum += count;
			if(sum>=300) {
				break;
			}
			count++;
		} 
		System.out.println("300을 넘게 만드는 최초의 수는 " +count+"번째 수입니다.");

		
		// 3의 배수 출력
		for(int i=0; i<10; i++) {
			if(i%3!=0) {
				continue;
			} 
			System.out.println(i);
		}

	}

}

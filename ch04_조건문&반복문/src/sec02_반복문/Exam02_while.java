package sec02_반복문;

public class Exam02_while {

	public static void main(String[] args) {
		// while문
		
		int i =1;
		while(i<=10) {
			System.out.print(i + "\t");
			i ++;
		}
		int speed = 10;
		while(speed >0) {
			System.out.println("1씩 감속시킴. 현재 속도:" + speed);
			speed --;
			if(speed==3) {
				break;
			}
		} // 서버 등 계속 돌아가야 하는 곳에서 주로 쓰임.
		System.out.println();
		

	}

}

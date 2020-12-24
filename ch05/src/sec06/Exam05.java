package sec06;

import java.util.Scanner;

public class Exam05 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); //new: 객체생성 연산자, System.in: 키보드로 입력함 , 
		
		System.out.print("학생수:");
		String strStudentNum = scanner.nextLine();
		int studentNum = Integer.parseInt(strStudentNum);
		
		int[] arr = new int[studentNum]; 
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(i+1 + "번째 점수입력:");
			String data = scanner.nextLine();
			int score = Integer.parseInt(data); // 문자형을 정수형으로. 배열에는 같은 형식으로만 입력해주어야 함. int는 정수형인데 입력되는 data는 문자열이므로
			arr[i] = score;
		}
		
		int sum= 0;
		for(int j = 0; j<arr.length;j++) {
			sum += arr[j];
		}
		
		double avg = (double)sum/arr.length;
		System.out.println("평균:" + avg);


	}

}

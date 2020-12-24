package sec06;

public class Exam03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[5]; 
		
		arr[0] = 90; //값 저장
		arr[1] = 91; //값 저장
		arr[2] = 92; //값 저장
		arr[3] = 93; //값 저장
		arr[4] = 95; //값 저장
//		arr[5] = 95; //indexOutofBoundException
		
		int sum= 0;
		for(int i = 0; i<arr.length;i++) {
			sum += arr[i];
		}
		double avg = (double)sum / arr.length;
		System.out.println(avg);


	}

}

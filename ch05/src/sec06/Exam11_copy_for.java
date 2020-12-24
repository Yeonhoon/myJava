package sec06;

public class Exam11_copy_for {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] scores = {95,80,97};
		
		for(int score : scores) {
			System.out.println(score);
		}
		
		int sum = 0;
		for(int score: scores) {
			sum += score;
		}
		double avg = (double)sum / scores.length;
		System.out.println(avg);
		
		String[] names = {"Java","Python","Tensorflow"};
		for(String name: names) {
			System.out.println(name);
			if(name.equals("Python")){
				break;
			}
		}
	}
}

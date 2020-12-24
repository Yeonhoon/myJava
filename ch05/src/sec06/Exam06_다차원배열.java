package sec06;

public class Exam06_다차원배열 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] scores = new int[2][3];
		System.out.println(scores.length);
		System.out.println(scores[0].length);
		System.out.println(scores[1].length);
		
		for(int i=0; i<scores.length; i++) {
			for(int j=0; j<scores[i].length; j++) {
				System.out.println("scores["+i+"]["+j+"]:"+ scores[i][j]);
			}
		}

	}

}

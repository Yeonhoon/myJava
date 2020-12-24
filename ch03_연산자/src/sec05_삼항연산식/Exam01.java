package sec05_삼항연산식;

public class Exam01 {

	public static void main(String[] args) {
		// 삼항(조건)연산식
		
		int score = 100;
		String grade = (score>90) ? "A. Congratulations!" : 
			(score>80) ? "B. Good job" : 
				(score >70) ? "C. Study hard." : "F. You failed.";
		System.out.println("Your score is " + grade);

	}

}

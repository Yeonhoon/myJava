package sec01_Á¶°Ç¹®;

public class Exam02_ifelse {
	public static void main(String[] agrs) {
		
		int score = 80;
		String grade;
		if(score > 90) {
			if(score >=95) {
				grade = "A+";
				System.out.println("Your score is "+score + "(" + grade + ")");
				} else {
					grade = "A";
					System.out.println("Your score is "+score + "(" + grade + ")");
					}
			}

		if(score > 80) {
			if(score >=85) {
				grade = "B+";
				System.out.println("Your score is "+score + "(" + grade + ")");
				} else {
					grade = "B";
					System.out.println("Your score is "+score + "(" + grade + ")");
					}
			}
		
		if(score > 70) {
			if(score >=70) {
				grade = "C+";
				System.out.println("Your score is "+score + "(" + grade + ")");
				} else {
					grade = "C";
					System.out.println("Your score is "+score + "(" + grade + ")");
					}
			}
		else {
			grade ="D";
			System.out.println("Your score is "+score + "(" + grade + ")" + "You failed.");
			
		}
			

	}

}
	

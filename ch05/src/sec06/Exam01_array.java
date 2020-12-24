package sec06;

public class Exam01_array {

	public static void main(String[] args) {
		
		int[] scores = {95,80,91,78,99};
		for(int i=0; i<scores.length; i++) {
			System.out.println(scores[i]);
		}
		
		int[] scores2 = null;
		if(scores2 == null) {
			scores2 = new int[] {95,80,91,78,99};
		}
		System.out.println(scores2[0]); //변수선언 자체만으로는 컴파일 안됨.
		
		
		// 메소드를 실행하려면 반드시 메소드를 호출해야함(메소드 블록을 실행하라)
		String[] arr = {"Java","Python", "JavaScript"};
		printNames(arr); //번지 복사
		printNames(new String[] {"a","b","c"}); //동일한 타입으로 맞추어 배열을 생성하고 전달해야함.
		
	}
	
	
	
	 //메소드 선언(정의)
	public static void printNames(String[] names) { //names: 매개변수. 어떤 변수를 호출함. //arr의 번지가 names로 복사됨

		for(int i=0; i<names.length; i++) {
			System.out.println(names[i]);
			}
		}
	}

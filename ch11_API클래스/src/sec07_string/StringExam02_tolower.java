package sec07_string;

public class StringExam02_tolower {
	public static void main(String[] args) {
		String data1 = "java is good";
		String data2 = "Java is good";
		
		data1 = data1.toLowerCase();
		data2 = data2.toLowerCase(); // toUpperCase()
		
		
		if(data1.equals(data2)) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}
		
		
		
		
	}
}

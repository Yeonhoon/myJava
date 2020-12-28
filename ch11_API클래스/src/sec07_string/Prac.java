package sec07_string;

public class Prac {
	public static void main(String[] args) {
		
		String x = "¾È ³ç ÇÏ ¼¼ ¿ä ¹Ý °© ½À ´Ï ´Ù";
		String [] arr = x.split(" ");
		for(int i = 0; i<arr.length; i++) {
			System.out.print(arr[i]);
		}
		System.out.println( );
	}
}

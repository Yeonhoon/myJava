package sec06;

public class Exam02_초기array {

	public static void main(String[] args) {
		// 배열을 만들떄 기본값을 지정하지 않고, new 'type'[]으로 한다면 0의 의미를 갖는 초기값으로 형성됨. 0/0.0/false/null
		int[] array = new int[5]; 
		double[] arr = new double[5];
		boolean[] arr2 = new boolean[5];
		String[] arr3 = new String[5];

		for(int i = 0; i<array.length; i++) {
			System.out.print(array[i] + ", ");
			System.out.print(arr[i] + ", ");
			System.out.print(arr2[i] + ", ");
			System.out.print(arr3[i] + ", ");

		}
		System.out.println();
	}

}

package sec08;

public class Calculator {

	// field;

	// constructor
	Calculator() {

	}

	// �����ڿ� �޼ҵ��� ����
	// �����ڴ� Ŭ������ ������ ���� �̸�, �޼ҵ�� ������ �ٸ� �̸��̾�� ��.
	// �޼ҵ忡�� �̸� �տ� void �� ����. �� �����ϰ� ����.

	// method
	void print (String message) {
		for(int i=0;i<5;i++) {
			System.out.println(message);
			if(i==2) {
				break;
			}
			
		}
		System.out.println("�����Ѵ�");
	}

	void print2(String message) {
		System.out.println(message);
	}

	void print(String message, int temp) {
		System.out.println(message);
		System.out.println("�µ�:" + temp);
	}

	// �޼ҵ� ����
	int plus(int x, int y) {
		int result = x + y;
		return result;
	}

	String join(String s1, String s2) {
		String result = s1 + "+" + s2;
		return result;
	}

	// �迭 �޼ҵ� ����/
	
	  int sum(int[] arr) { int sum = 0; for(int value : arr) { sum += value; }
	  return sum; }
	 

	String append(String[] arr2) {
		String line = "";
		for (String value : arr2) {
			line += value;
		}
		return line;
	}

	int sum2(int... arr) { // ...: ������ �𸣴� �Ű����� Ÿ�� ����. ����� �𸣰ڴٴ� �� �ǹ�. 
		int sum = 0;
		if(arr == null) {
			System.out.println("�Էº����� �����ϴ�");
			}
		for (int value : arr) {
			sum += value;
		}
		return sum;
	}
	
	
	

}

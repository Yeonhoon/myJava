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
		System.out.println(scores2[0]); //�������� ��ü�����δ� ������ �ȵ�.
		
		
		// �޼ҵ带 �����Ϸ��� �ݵ�� �޼ҵ带 ȣ���ؾ���(�޼ҵ� ����� �����϶�)
		String[] arr = {"Java","Python", "JavaScript"};
		printNames(arr); //���� ����
		printNames(new String[] {"a","b","c"}); //������ Ÿ������ ���߾� �迭�� �����ϰ� �����ؾ���.
		
	}
	
	
	
	 //�޼ҵ� ����(����)
	public static void printNames(String[] names) { //names: �Ű�����. � ������ ȣ����. //arr�� ������ names�� �����

		for(int i=0; i<names.length; i++) {
			System.out.println(names[i]);
			}
		}
	}

package sec07.exam01;

public class Example {

	public static void main(String[] args) {
		
		Child child = new Child(); // �ڳ�Ŭ������ ��ü 
		child.method1(); // �θ� ��� -> �θ��� method1 �����
		child.method2();
		child.method3();
		
		
		Parent parent = child;
		parent.method1();
		parent.method2(); // child�� method2�� �����. parent�� child�� ��ü�� ����. ������
//		
	}
}

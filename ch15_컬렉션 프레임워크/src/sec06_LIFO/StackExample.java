package sec06_LIFO;

import java.util.Stack;

public class StackExample {
	public static void main(String[] args) {
		
		Stack<String> stack = new Stack<>();
		
		//����
		stack.push("�忬��");
		stack.push("ȫ�̷�");
		stack.push("���ε� Ʈ����");
		
		while(!stack.empty()) { //stack.empty(): stack�� ������� Ȯ�� 
			System.out.println(stack.pop());
			System.out.println(stack.size()); // pop�ϸ� stack���� ������ �����.

		}
		
		for(String str : stack) {
			System.out.println(str);
		}
		

	}
}

package MyPrac;

import java.util.Stack;

public class MyStack {

	public static void main(String[] args) {
		
		Stack <String> myStack = new Stack<>();
		
		//stack: LIFO: �������� �Է��� ���� ���� ���� ����.
		myStack.push("�忬��");
		myStack.push("ȫ�̷�");
		myStack.push("�層��");
		myStack.push("���缭");
		myStack.push("�����");

		
		while(!myStack.empty()) {
			System.out.println(myStack.pop());
			System.out.println(myStack.size());
			
		}
		
	}
	
}

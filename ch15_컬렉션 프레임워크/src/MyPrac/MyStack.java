package MyPrac;

import java.util.Stack;

public class MyStack {

	public static void main(String[] args) {
		
		Stack <String> myStack = new Stack<>();
		
		//stack: LIFO: 마지막에 입력한 것이 가장 먼저 나감.
		myStack.push("장연훈");
		myStack.push("홍미령");
		myStack.push("장광진");
		myStack.push("이재서");
		myStack.push("백승훈");

		
		while(!myStack.empty()) {
			System.out.println(myStack.pop());
			System.out.println(myStack.size());
			
		}
		
	}
	
}

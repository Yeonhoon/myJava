package sec06_LIFO;

import java.util.Stack;

public class StackExample {
	public static void main(String[] args) {
		
		Stack<String> stack = new Stack<>();
		
		//저장
		stack.push("장연훈");
		stack.push("홍미령");
		stack.push("도널드 트럼프");
		
		while(!stack.empty()) { //stack.empty(): stack이 비었는지 확인 
			System.out.println(stack.pop());
			System.out.println(stack.size()); // pop하면 stack에서 영구히 사라짐.

		}
		
		for(String str : stack) {
			System.out.println(str);
		}
		

	}
}

package sec06_LIFO;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
	public static void main(String[] args) {
	
		Queue<String> queue = new LinkedList <>();
		
		queue.offer("A");
		queue.offer("B");
		queue.offer("C");
		
			System.out.println(queue.poll());
			System.out.println(queue.size()); 

			System.out.println(queue.poll());
			System.out.println(queue.size()); 

			System.out.println(queue.poll());
			System.out.println(queue.size()); 

			System.out.println(queue.poll());

			queue.offer("A");
			queue.offer("B");
			queue.offer("C");
			
		
			while(true) {
				String str = queue.poll();
				if(str == null) break;
				System.out.println(str);
			}
	}	
}

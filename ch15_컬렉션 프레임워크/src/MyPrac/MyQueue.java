package MyPrac;

import java.util.LinkedList;
import java.util.Queue;

public class MyQueue {
	public static void main(String[] args) {

		Queue <String> myQ = new LinkedList <> ();
		
		myQ.offer("a");
		myQ.offer("b");
		
		while(true) {
			System.out.println(myQ.poll());
			System.out.println(myQ.size());
			if(myQ.poll()==null) break;
			
		}
		
		
	}
}

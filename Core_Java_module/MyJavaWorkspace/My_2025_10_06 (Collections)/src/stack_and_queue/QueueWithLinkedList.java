package stack_and_queue;

import java.util.LinkedList;
public class QueueWithLinkedList {

	public static void main(String[] args) {
		LinkedList <Integer> ll = new LinkedList <Integer>();
		
		ll.addLast(10);
		ll.addLast(20);
		ll.addLast(30);
		
		ll.removeFirst();
		ll.removeFirst();
		ll.removeFirst();
	}

}

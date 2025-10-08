package stack_and_queue;

import java.util.LinkedList;
public class StackWithLinkedList {
	public static void main(String[] args) {
		LinkedList <Integer> ll = new LinkedList <Integer>();
		
		ll.addFirst(10);
		ll.addFirst(20);
		ll.addFirst(30);
		
		ll.removeFirst();
		ll.removeFirst();
		ll.removeFirst();
	}
}

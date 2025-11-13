package p1;

public class Node {
	int data;
	Node next;
	Node prev;
	
	public Node(int data) {
		this.data = data;
	}

	public int getData() {
		return data;
	}

	public Node getNext() {
		return next;
	}

	
	public Node getPrev() {
		return prev;
	}

	public void setPrev(Node prev) {
		this.prev = prev;
	}

	public void setData(int data) {
		this.data = data;
	}

	public void setNext(Node next) {
		this.next = next;
	}
	
	
}

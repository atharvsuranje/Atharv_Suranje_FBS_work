package p1;

public class Node {
	Employee employee;
	Node next;
	Node prev;
	
	public Node(Employee data) {
		this.employee = data;
		this.next=null;
		this.prev=null;
	}

	public Employee getData() {
		return employee;
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

	public void setData(Employee employee) {
		this.employee = employee;
	}

	public void setNext(Node next) {
		this.next = next;
	}
	
	
}
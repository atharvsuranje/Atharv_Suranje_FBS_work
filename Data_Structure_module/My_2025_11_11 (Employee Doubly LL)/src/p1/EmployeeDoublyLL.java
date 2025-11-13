package p1;

public class EmployeeDoublyLL {
	Node start,end;
	int count;
	
	public void addFirst(Employee data) {
		Node temp=new Node(data);
		if(start==null) {
			start=temp;
			end=temp;
		}
		else {
			temp.next=start;
			start.prev=temp;
			start=temp;
		}
		count++;
		System.out.println("Employee Added at Start");
	}
	
	public void addPosition(Employee data, int position) {
		if(position<=0 || position>count+1) {
			System.out.println(".......Invalid Position.......");
			return;
		}
		
		if(position==1) {
			addFirst(data);
			return;
		}
		if(position==count+1) {
			addLast(data);
			return;
		}
		
		Node temp=new Node(data);
		Node itr=null;
		
		if(position<=count/2) {
			itr=start;
			for(int i=1; i<position-1 ; i++)
				itr=itr.next;
		}
		else {
			itr=end;
			for(int i=count; i>position-1 ; i--)
				itr=itr.prev;
		}
		Node nextNode = itr.next;
		
		temp.prev=itr;
		temp.next=nextNode;
		
		itr.next=temp;
		nextNode.prev = temp;
		
		count++;
        System.out.println("Employee Added at position " + position);
	}
	
	public void addLast(Employee data) {
		Node temp=new Node(data);
		if(start==null) {
			start=temp;
			end=temp;
		}
		else {
			temp.prev=end;
			end.next=temp;
			end=temp;
		}
		count++;
		System.out.println("Employee Added at End");
	}
	
	public void deleteFirst() {
		if(start==null) {
			System.out.println("List is Empty\n");
			return;
		}
		else {
			if(count==1) {
				start=null;
				end=null;
			}
			else {
				start=start.next;
				start.prev=null;
			}
		}
		count--;
		System.out.println("Employee Deleted From Start");
	}
	
	public void deleteLast() {
		if(start==null) {
			System.out.println("List is Empty\n");
			return;
		}
		else {
			if(count==1) {
				start=null;
				end=null;
			}
			else {
				end=end.prev;
				end.next=null;
			}
		}
		count--;
		System.out.println("Employee Deleted From End");
	}
	
	public void deleteAtPosition(int position) {
		if(count==0) {
			System.out.println("List is Empty\n");
			return;
		}
		
		if(position<=0 || position>count) {
			System.out.println(".......Invalid Position.......");
			return;
		}
		
		if(position==1) {
			deleteFirst();
			return;
		}
		
		if(position==count) {
			deleteLast();
			return;
		}
		
		Node itr=null;
		
		if(position<=count/2) {
			itr=start;
			for(int i=1;i<position;i++) {
				itr=itr.next;
			}
		}
		else {
			itr=end;
			for(int i=count;i>position;i--) {
				itr=itr.prev;
			}
		}
		
		Node prevNode=itr.prev;
		Node nextNode=itr.next;
		
		prevNode.next=nextNode;
		nextNode.prev=prevNode;
		
		count--;
		System.out.println("Node deleted from position " + position);
	}
	
	public void display() {
		if(start==null) {
			System.out.println("List is Empty\n");
		}
		else {
			Node itr=start;
			System.out.println("\nLinked List is : \n");
			System.out.print("NULL <--> ");
			while(itr.next != null) {
				System.out.print(itr.employee+" <--> ");
				itr=itr.next;
			}
			System.out.print(itr.employee+" <--> NULL\n\n");
		}
	}
	
	public void displayReverse() {
		if(start==null) {
			System.out.println("List is Empty\n");
		}
		else {
			Node itr=end;
			System.out.println("\nLinked List is : \n");
			System.out.print("NULL <--> ");
			while(itr.prev != null) {
				System.out.print(itr.employee+" <--> ");
				itr=itr.prev;
			}
			System.out.print(itr.employee+" <--> NULL\n\n");
		}
	}
}

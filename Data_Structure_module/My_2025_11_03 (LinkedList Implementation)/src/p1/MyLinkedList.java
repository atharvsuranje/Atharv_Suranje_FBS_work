package p1;

public class MyLinkedList {
	Node start;
	
	public void addFirst(int data) {
		Node temp=new Node(data);
		temp.next=start;
		start=temp;
		System.out.println("Data added at First.");
	}
	
	public void addPosition(int data, int position) {
		Node temp=new Node(data);
		if(position<=0) {
			System.out.println("Invalid Position.");
			System.out.println("Adding element at First");
			addFirst(data);
		}
		else {
			if(position == 1) 
				addFirst(data);
			else {
				if(start == null) {
					System.out.println("List is empty. Adding at first position.");
					addFirst(data);
					return;
				}
				int counter=1;
				Node itr=start;
				
				while(counter < position-1 && itr.next != null) {
					itr=itr.next;
					counter++;
				}
				temp.next=itr.next;
				itr.next=temp;
				if(counter<position-1) {
					System.out.println("Invalid Position");
					System.out.println("Data Added at Last");
				}
				else
					System.out.println("Data Added at Position "+position);
			}
		}
	}
	
	public void addLast(int data) {
		Node temp= new Node(data);
		if(start==null)
			start=temp;
		else {
			Node itr=start;
			while(itr.next != null) {
				itr=itr.next;
			}
			itr.next=temp;
		}
		System.out.println("Data added at Last.");
	}
	
	public void display() {
		if(start==null) System.out.println("Linked List is empty..");
		else {
			Node itr=start;
			System.out.println("\nLinked List is : \n");
			while(itr.next != null) {
				System.out.print(itr.getData()+" --> ");
				itr=itr.next;
			}
			System.out.print(itr.getData()+" --> NULL\n");
		}
	}

	public void deleteFirst() {
		if(start==null) {
			System.out.println("List is already empty.");
	        return;
		}
		start=start.next;
		System.out.println("First element deleted.");
	}

	public void deleteLast() {
		if(start==null) {
			System.out.println("List is already empty.");
	        return;
		}
		
		if(start.next==null) {
			start=null;
			System.out.println("Last element deleted (list is now empty).");
	        return;
		}
		
		Node itr=start;
		while(itr.next.next != null) itr=itr.next;
		itr.next=null;
		System.out.println("Last element deleted.");
	}

	public void deleteAtPosition(int position) {
		if (start == null) {
	        System.out.println("List is already empty.");
	        return;
	    }
	    
	    if (position <= 0) {
	        System.out.println("Invalid position. Must be 1 or greater.");
	        return;
	    }

	    if (position == 1) {
	        deleteFirst();
	        return;
	    }
	    
	    Node itr=start;
	    int counter=1;
	    
	    while(counter<position-1 && itr.next!= null) {
	    	itr=itr.next;
	    	counter++;
	    }
	    if(itr.next == null)
	    	System.out.println("Position " + position + " is out of bounds.");
	    else {
	    	itr.next=itr.next.next;
	    	System.out.println("Element at position " + position + " deleted.");
	    }
	}

//	public void displayReverse() {
//		Node itr=start;
//		while(itr.next!=null) {
//			itr=itr.next;
//		}
//	}
}

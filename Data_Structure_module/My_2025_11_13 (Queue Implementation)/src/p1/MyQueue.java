package p1;

public class MyQueue {
	private Node[] queue=new Node[5];
	private int head=0,tail=0,size=0;
	private static MyQueue queueObject=new MyQueue();
	
	private MyQueue() {

	}

	private MyQueue(Node[] queue) {
		this.queue = queue;
	}
	
	public static MyQueue getObject() {
		return queueObject;
	}
	
	public boolean isFull() {
		return size==queue.length;
	}
	
	public boolean isEmpty() {
		return size==0;
	}
	public void push(int data) {
		//size =10 then I push 5 elements then pop 5 elements then tail=5 and head=5 now it will show an full queue even if it is totally empty
		/*if(tail+head == queue.length) {
			System.out.println("Queue is Full\n");
		}
		else {
			if(tail==queue.length && head!=0) {
				tail=0;
			}
			Node temp=new Node(data);
			queue[tail]=temp;
			tail++;
		}*/
		
		if(isFull()) {
			System.out.println("Queue is Full\n");
            return;
		}
		queue[tail] = new Node(data);
		tail= (tail+1)%queue.length;
		size++;
	}
	
	public Node pop() {
		/*if(head==tail) {
			System.out.println("Queue is Empty\n");
			return null;
		}
		else {
			if(head==queue.length) {
				head=0;
			}
			Node removedNode=queue[head];
			head++;
			return removedNode;
			
		}*/
		
		if(isEmpty()) {
			System.out.println("Queue is Empty\n");
            return null;
		}
		Node removedNode=queue[head];
		head = (head+1)%queue.length;
		size--;
		return removedNode;
	}

	
	public void display() {
		if(isEmpty()) {
			System.out.println("Queue is Empty");
			return;
		}
		System.out.print("Queue Elements: ");
		int index=head;
		for(int it=0;it<size;it++) {
			System.out.print(queue[index]+"  ");
			index= (index+1)%queue.length;
		}
		System.out.println();
	}
}

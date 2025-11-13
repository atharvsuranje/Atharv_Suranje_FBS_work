package p1;

public class MyStack {
	private Node[] stack=new Node[10];
	private int top=0;
	private static MyStack myStack=new MyStack();
	
	private MyStack() {

	}

	private MyStack(Node[] ref) {
		stack=ref;
	}
	
	public Node[] getStack() {
		return stack;
	}

	public void setStack(Node[] stack) {
		this.stack = stack;
	}

	public static MyStack getObject() {
		return myStack;
	}
	
	public Node push(int data) {
		if (isFull()) {
            return null;
        }
		Node temp=new Node(data);
		stack[top]=temp;
		top++;
		return temp;
	}
	
	public Node pop() {
		if (isEmpty()) {
            return null;
        }
		top--;
        Node removed = stack[top];
        stack[top]=null;
        return removed;
	}
	
	public void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return;
        }
        System.out.println("Current Stack:");
        for (int i = top-1; i >= 0; i--) {
            System.out.println(stack[i]);
        }
    }
	
	public Node peek() {
		if(isEmpty()) {
			return null;
		}
		return stack[top-1];
	}
	
	public boolean isFull() {
        return top == stack.length;
    }

    public boolean isEmpty() {
        return top == 0;
    }
}

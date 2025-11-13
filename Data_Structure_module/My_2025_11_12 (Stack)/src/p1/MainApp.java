package p1;

import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		MainApp app = new MainApp();
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("\n=============================");
            System.out.println("          STACK MENU         ");
            System.out.println("=============================");
            System.out.println("1. Push (Add)");
            System.out.println("2. Pop (Delete)");
            System.out.println("3. Display Stack");
            System.out.println("4. Peek (View Top Element)");
            System.out.println("0. Exit");
            System.out.println("=============================");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter value to push: ");
                    int value = sc.nextInt();
                    app.insert(value);
                    break;

                case 2:
                    app.delete();
                    break;

                case 3:
                    app.show();
                    break;
                    
                case 4:
                	app.peek();
                	break;

                case 0:
                    System.out.println("\nExiting program...");
                    break;

                default:
                    System.out.println("\nInvalid choice! Please try again.");
            }

        } while (choice != 0);
        sc.close();
        
	}
	
	public void insert(int value) {
		MyStack ref=MyStack.getObject();
		Node added=ref.push(value);
		if(added != null) {
			System.out.println(added+" Added into Stack.");
		}
		else {
			System.out.println("Stack Full!");			
		}
	}

	public void delete() {
		MyStack ref=MyStack.getObject();
		Node removed = ref.pop();
		if(removed != null) {
			System.out.println("Removed: " + removed);	
		}
		else {
			System.out.println("Stack Empty.");			
		}
	}
	
	public void peek() {
		MyStack ref = MyStack.getObject();
	    Node topNode = ref.peek();
	    if (topNode != null) {
	        System.out.println("Top Element: " + topNode);
	    } 
	    else {
	        System.out.println("Stack is empty.");
	    }
	}
	
	public void show() {
        MyStack ref = MyStack.getObject();
        ref.display();
    }
}

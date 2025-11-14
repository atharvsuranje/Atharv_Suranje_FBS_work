package p1;

import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		MainApp app=new MainApp();
		int choice;
		Scanner sc=new Scanner(System.in);
		do {
			System.out.println("=======MENU=======");
			System.out.println("\t1. Add Data");
			System.out.println("\t2. Delete Data");
			System.out.println("\t3. Display Data");
			System.out.println("\t0. Exit");
			System.out.print("Enter Your Choice : ");
			choice=sc.nextInt();
			
			switch(choice) {
				case 1:{
					System.out.print("Enter data :");
					int data=sc.nextInt();
					app.insert(data);
					break;
				}
					
				case 2:{
					app.delete();
					break;
				}
				
				case 3:{
					app.displayQueue();
					break;
				}
				
				case 0:{
					System.out.println("Exiting.....");
					break;
				}
				default :{
					System.out.println("Invalid Choice");
				}
					
			}
		}
		while(choice !=0);
		sc.close();
	}

	public void insert(int data){
		MyQueue ref=MyQueue.getObject();
		ref.push(data);
	}
	
	public void delete() {
		MyQueue ref=MyQueue.getObject();
		Node temp=ref.pop();
		System.out.println(temp+" Removed");
	}
	
	public void displayQueue() {
		MyQueue ref=MyQueue.getObject();
		ref.display();
		System.out.println("\n");
	}
}

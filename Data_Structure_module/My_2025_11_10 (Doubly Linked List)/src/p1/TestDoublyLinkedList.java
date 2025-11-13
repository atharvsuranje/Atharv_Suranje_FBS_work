package p1;

import java.util.Scanner;

public class TestDoublyLinkedList {

	public static void main(String[] args) {
		MyDoublyLinkedList myDLL = new MyDoublyLinkedList();
		Scanner sc = new Scanner(System.in);
		int choice;
		
		do {
			System.out.println("\t1. Add at Start");
			System.out.println("\t2. Add at Position");
			System.out.println("\t3. Add at End");
			System.out.println("\t4. Delete from Start");
			System.out.println("\t5. Delete Position");
			System.out.println("\t6. Delete from End");
			System.out.println("\t7. Display");
			System.out.println("\t8. Display in Reverse");
			System.out.println("\t0. Exit");
			System.out.print("Enter Choice : ");
			choice=sc.nextInt();
			
			switch(choice) {
				case 1:{
					System.out.print("Enter Data : ");
					int data=sc.nextInt();
					myDLL.addFirst(data);
					break;
				}
				
				case 2:{
					System.out.print("Enter Data : ");
					int data=sc.nextInt();
					System.out.print("Enter Position : ");
					int position=sc.nextInt();
					myDLL.addPosition(data,position);
					break;
				}
				
				case 3:{
					System.out.print("Enter Data : ");
					int data=sc.nextInt();
					myDLL.addLast(data);
					break;
				}
				
				case 4:{
					myDLL.deleteFirst();
					break;
				}
				
				case 5:{
					System.out.print("Enter Position : ");
					int position=sc.nextInt();
					myDLL.deleteAtPosition(position);
					break;
				}
				
				case 6:{
					myDLL.deleteLast();
					break;
				}
				
				case 7:{
					myDLL.display();
					break;
				}
				
				case 8:{
					myDLL.displayReverse();
					break;
				}
				
				case 0:{
					System.out.println("Exiting.........");
					break;
				}
				
				default:{
					System.out.println(".......Invalid Choice.......");
				}
			}
		}
		while(choice!=0);
		sc.close();
	}

}

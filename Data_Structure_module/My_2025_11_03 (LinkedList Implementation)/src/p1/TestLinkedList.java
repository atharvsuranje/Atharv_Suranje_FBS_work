package p1;

//Implement addPosition, deleteFirst, deleteLast, deletePos
import java.util.Scanner;

public class TestLinkedList {
	public static void main(String[] args) {
		MyLinkedList myLL = new MyLinkedList();
		Scanner sc=new Scanner(System.in);
		
		int choice,data;
		do {
			System.out.println("\t1. Add");
			System.out.println("\t2. Display");
			System.out.println("\t3. Delete");
//			System.out.println("\t4. Reverse Display");
			System.out.println("\t4. Exit");
			System.out.print("Enter your Choice :");
			choice =sc.nextInt();
			
			switch(choice) {
				case 1:{
					int subChoice,loopChoice;
					do {
						System.out.print("Enter data : ");
						data=sc.nextInt();
						System.out.println("\t1. Add First");
						System.out.println("\t2. Add Position");
						System.out.println("\t3. Add Last");
						System.out.print("Enter Your Choice : ");
						subChoice=sc.nextInt();
						boolean continueAddition=true;
						
						switch(subChoice) {
							case 1:{
								myLL.addFirst(data);
								break;
							}
							case 2:{
								int position;
								System.out.print("\nEnter position : ");
				                position = sc.nextInt();
								myLL.addPosition(data,position);
								break;
							}
							case 3:{
								myLL.addLast(data);
								break;
							}
							default:{
								System.out.println("Invalid. Enter a Valid Choice.");
								continueAddition=false;
								break;
							}
						}
						if(continueAddition) {
							System.out.println("\n\t1. To Continue Adding Elements.");
				            System.out.println("\t2. GO to Main Menu.");
				            System.out.print("\tEnter Your Choice : ");
				            loopChoice=sc.nextInt();
				            
				            while(loopChoice != 1 && loopChoice != 2) {
				            	System.out.println("Invalid. Enter a Valid Choice.");
				            	loopChoice=sc.nextInt();
				            }
						}
						else loopChoice=1;
						
					}while(loopChoice == 1);
					
					System.out.println("Returning to main menu.");
					break;
				}
				
				case 2:{
					myLL.display();
					break;
				}
				
				case 3:{
					int subChoice,loopChoice=1;
					do {
						System.out.println("\t1. Delete First");
						System.out.println("\t2. Delete Position");
						System.out.println("\t3. Delete Last");
						System.out.println("\t4. Back to Main Menu");
						System.out.print("Enter Your Choice : ");
						subChoice=sc.nextInt();
						
						switch(subChoice) {
							case 1:{
								myLL.deleteFirst();
								break;
							}
							case 2:{
								System.out.print("\nEnter Postion to Delete : ");
								int position=sc.nextInt();
								myLL.deleteAtPosition(position);
								break;
							}
							case 3:{
								myLL.deleteLast();
								break;
							}
							case 4: {
								System.out.println("Returning to main menu.");
								loopChoice = 2;
								break;
							}
							default:{
								System.out.println("Invalid. Enter a Valid Choice.");
								break;
							}
						}
						
						if(subChoice >=1 && subChoice <=3) {
							System.out.println("\n\t1. To Continue Deleting Elements.");
				            System.out.println("\t2. GO to Main Menu.");
				            System.out.print("\tEnter Your Choice : ");
				            loopChoice=sc.nextInt();
				            
				            while(loopChoice != 1 && loopChoice != 2) {
				            	System.out.println("Invalid. Enter a Valid Choice.");
				            	loopChoice=sc.nextInt();
				            }
						}
					} while(loopChoice == 1);
					break;
				}
				
//				case 4:{
//					myLL.displayReverse()
//				}
				case 4:{
					System.out.println("Exiting......");
					break;
				}
				
				
				default:{
					System.out.println("Invalid. Enter a Valid Choice");
				}
			}
		}while(choice != 4);
		sc.close();
	}
	
}

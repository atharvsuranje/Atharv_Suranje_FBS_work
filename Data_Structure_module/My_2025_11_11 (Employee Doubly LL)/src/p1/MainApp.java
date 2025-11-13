package p1;

import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		EmployeeDoublyLL myEDLL=new EmployeeDoublyLL();
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
					System.out.print("Enter id : ");
					int id=sc.nextInt();
					sc.nextLine();
					System.out.print("Enter name :");
					String name=sc.nextLine();
					System.out.print("Enter salary :");
					double salary=sc.nextDouble();
					myEDLL.addFirst(new Employee(id, name, salary));
					break;
				}
				
				case 2:{
					System.out.print("Enter id : ");
					int id=sc.nextInt();
					sc.nextLine();
					System.out.print("Enter name :");
					String name=sc.nextLine();
					System.out.print("Enter salary :");
					double salary=sc.nextDouble();
					System.out.println("Enter position : ");
					int position=sc.nextInt();
					myEDLL.addPosition(new Employee(id, name, salary),position);
					break;
				}
				
				case 3:{
					System.out.print("Enter id : ");
					int id=sc.nextInt();
					sc.nextLine();
					System.out.print("Enter name :");
					String name=sc.nextLine();
					System.out.print("Enter salary :");
					double salary=sc.nextDouble();
					myEDLL.addLast(new Employee(id, name, salary));
					break;
				}
				
				case 4:{
					myEDLL.deleteFirst();
					break;
				}
				
				case 5:{
					System.out.print("Enter Position : ");
					int position=sc.nextInt();
					myEDLL.deleteAtPosition(position);
					break;
				}
				
				case 6:{
					myEDLL.deleteLast();
					break;
				}
				
				case 7:{
					myEDLL.display();
					break;
				}
				
				case 8:{
					myEDLL.displayReverse();
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

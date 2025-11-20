package p1;

import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		Graph graph=new Graph();
		Scanner sc = new Scanner(System.in);
		int choice;
		
		do {
			System.out.println("\n========= GRAPH MENU =========");
            System.out.println("\t1. Insert Node");
            System.out.println("\t2. Connect Nodes");
            System.out.println("\t3. Print Graph");
            System.out.println("\t4. Exit");
            System.out.print("Enter choice : ");
            choice = sc.nextInt();
            sc.nextLine();
            
            switch(choice) {
            	case 1:{
            		System.out.print("Enter Node Value : ");
            		String value=sc.nextLine();
            		graph.insertNode(new Node(value));
            		System.out.println("Node Inserted");
            		break;
            	}
            	
            	case 2:{
            		System.out.print("Enter source node: ");
                    String srcVal = sc.nextLine();
                    System.out.print("Enter destination node: ");
                    String destVal = sc.nextLine();

                    Node source = new Node(srcVal);
                    Node desti = new Node(destVal);

                    graph.connectNodes(source, desti);
                    break;
            	}
            	
            	case 3:{
            		graph.print();
            		break;
            	}
            	
            	case 4:{
            		System.out.println("Exiting..........");
            		break;
            	}
            	
            	default:{
            		System.out.println("Invalid choice!");
            	}
            }
		}
		while(choice !=4);
		sc.close();
	}

}

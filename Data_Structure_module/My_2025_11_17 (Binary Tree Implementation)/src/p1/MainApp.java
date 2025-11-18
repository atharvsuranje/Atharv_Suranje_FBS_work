package p1;

import java.util.Scanner;

public class MainApp {
	Node root;
	public static void main(String[] args) {
		MainApp app=new MainApp();
		int choice;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("++++++MENU++++++");
			System.out.println("\t1.Add");
			System.out.println("\t2.InOrder Traversal");
			System.out.println("\t3.PreOrder Traversal");
			System.out.println("\t4.PostOrder Traversal");
			System.out.println("\t0.Exit");
			System.out.print("Enter your Choice : ");
			choice=sc.nextInt();
			sc.nextLine();
			
			switch (choice) {
				case 1: {
					System.out.print("Enter data : ");
					int data=sc.nextInt();
					app.insert(data);
					break;
				}
				
				case 2:{
					System.out.println("Data in InOrder :");
					app.inOrder(app.root);
					break;
				}
				
				case 3:{
					System.out.println("Data in PreOrder :");
					app.preOrder(app.root);
					break;
				}
				
				case 4:{
					System.out.println("Data in PostOrder :");
					app.postOrder(app.root);
					break;
				}
				
				case 0:{
					System.out.println("Exiting.........");
					break;
				}
				default:
					System.out.println("Invalid Choice");
					break;
				}
		}
		while(choice != 0);
		sc.close();
	}

	public void insert(int value) {
		root=insertValue(root,value);
	}
	
	public Node insertValue(Node root,int value) {
		if(root==null) {
			root=new Node(value);
			return root;
		}
		
		if(value > root.data) {
			root.right=insertValue(root.right, value);
		}
		else {
			root.left=insertValue(root.left, value);
		}
		return root;
	}
	
	public void inOrder(Node root) {
		inOrderTraversal(root);
	}
	
	public void inOrderTraversal(Node root) {
		if(root!=null) {
			inOrderTraversal(root.left);
			System.out.println(root.data);
			inOrderTraversal(root.right);
		}
	}
	public void preOrder(Node root) {
		preOrderTraversal(root);
	}
	
	public void preOrderTraversal(Node root) {
		if(root!=null) {
			System.out.println(root.data);
			preOrderTraversal(root.left);
			preOrderTraversal(root.right);
		}
	}
	public void postOrder(Node root) {
		postOrderTraversal(root);
	}
	
	public void postOrderTraversal(Node root) {
		if(root!=null) {
			postOrderTraversal(root.left);
			postOrderTraversal(root.right);
			System.out.println(root.data);
		}
	}
	
}

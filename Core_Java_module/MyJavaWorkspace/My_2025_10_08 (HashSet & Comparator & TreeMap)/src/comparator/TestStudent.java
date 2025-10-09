package comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class TestStudent {

	public static void main(String[] args) {
		
		ArrayList<Student> a1=new ArrayList<Student>();
		a1.add(new Student(101,90,"Atharv"));
		a1.add(new Student(103,60,"Soham"));
		a1.add(new Student(104,40,"Aditya"));
		a1.add(new Student(102,50,"Pranav"));
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("\n--- MENU ---");
            System.out.println("1. Sort by Roll Number");
            System.out.println("2. Sort by Name");
            System.out.println("3. Sort by Marks");
            System.out.println("0. Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();
            sc.nextLine();
            
            switch(choice) {
            	case 1:
            		StudentRollComparator rc=new StudentRollComparator();
            		Collections.sort(a1,rc);
            		System.out.println(a1);
            		break;
            		
            	case 2:
            		StudentMarkComparator mc=new StudentMarkComparator();
            		Collections.sort(a1,mc);
            		System.out.println(a1);
            		break;
            		
            	case 3:
            		StudentNameComparator nc=new StudentNameComparator();
            		Collections.sort(a1,nc);
            		System.out.println(a1);
            		break;
            		
            	case 0:
            		System.out.println("Exiting");
            		System.exit(0);
            }
		}
	}
}



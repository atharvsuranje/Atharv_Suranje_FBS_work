package p3;

import java.util.Scanner;
import p2.EmployeeDAO;
import p1.*;

public class TestEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		EmployeeDAO dao=new EmployeeDAO();
		
		int choice;
		do {
			System.out.println("\n--------------Management Menu--------------");
            System.out.println("1. Add Employee");
            System.out.println("2. Search Employee");
            System.out.println("3. Update Employee");
            System.out.println("4. Delete Employee");
            System.out.println("5. Display All Employees");
            System.out.println("6. Calculate Salary for Every Employee");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            
            switch(choice) {
            	case 1:
            		System.out.print("Enter Employee Type (1:HR, 2:Admin, 3:Sales Manager) : ");
            		int empType=sc.nextInt();
            		
            		System.out.print("Enter ID : ");
            		int id=sc.nextInt();
            		sc.nextLine();
            		System.out.print("Enter Name : ");
            		String name=sc.nextLine();
            		System.out.print("Enter Salary : ");
            		double salary=sc.nextDouble();
            		
            		switch(empType) {
            			case 1:
            				System.out.print("Enter Commission : ");
            				double commission=sc.nextDouble();
            				dao.addEmployee(new HR(id,name,salary,commission));
            				System.out.println("HR added successfully!");
            				break;
            			
            			case 2:
            				System.out.print("Enter Allowance : ");
            				double allowance=sc.nextDouble();
            				dao.addEmployee(new Admin(id,name,salary,allowance));
            				System.out.println("Admin added successfully!");
            				break;
            				
            			case 3:
            				System.out.print("Enter Incentive : ");
            				double incentive=sc.nextDouble();
            				System.out.print("Enter Target : ");
            				int target=sc.nextInt();
            				dao.addEmployee(new SalesManager(id, name, salary, incentive, target));
            				System.out.println("Sales Manager added successfully!");
            				break;
            				
            			default:
            				System.out.println("Invalid choice!");
            		}
            		break;
            		
            	case 2:
            		System.out.print("Enter ID to Search : ");
            		id=sc.nextInt();
            		Employee emp=dao.getEmployeeById(id);
            		if(emp!=null) {
            			System.out.println("Employee Found!\n"+emp);
            		}
            		else
            			System.out.println("Employee Not Found");
            		break;
            		
            	case 3:
            		System.out.print("Enter ID to update : ");
            		id=sc.nextInt();
            		int idx=dao.searchEmployeeById(id);
            		if(idx != -1) {
            			System.out.print("Enter New Salary : ");
            			salary=sc.nextDouble();
            			dao.updateEmployee(id, salary);
            			System.out.println("Slary Updated Successfully");
            		}
            		else {
            			System.out.println("Employee Not Found");
            		}
            		break;
            		
            	case 4:
            		System.out.print("Enter ID to update : ");
            		id=sc.nextInt();
            		if(dao.deleteEmployee(id))
            			System.out.println("Employee Deleted.");
            		else
            			System.out.println("Employee Not Found.");
            		break;
            		
            	case 5:
            		dao.displayAllEmployee();
            		break;
            	
            	case 6:
            		for(int i=0;i<EmployeeDAO.getEmpCount();i++) {
            			System.out.println(EmployeeDAO.getEmpArr()[i].getName() +" :: Total Salary : "+EmployeeDAO.getEmpArr()[i].calculateSalary());
            		}
            		break;
            		
            	case 0:
            		System.out.println("Exiting...");
            		break;
            	
            	default:
            		System.out.println("Invalid choice!");
            }
		} while(choice !=0);
		sc.close();
	}

}

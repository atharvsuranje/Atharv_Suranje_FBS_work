package p2;

import p1.*;

public class EmployeeDAO {
	private static Employee[] empArr;
	private static int empCount;
	
	static {
		empArr=new Employee[20];
		empCount=0;
		
		empArr[empCount++] = new HR(104, "Priya", 46000, 4200);
		empArr[empCount++] = new HR(105, "Vikas", 49000, 4800);
		empArr[empCount++] = new HR(106, "Nisha", 51000, 5200);

		empArr[empCount++] = new SalesManager(204, "Rahul", 61000, 8500, 14);
		empArr[empCount++] = new SalesManager(205, "Tina", 59000, 7800, 13);
		empArr[empCount++] = new SalesManager(206, "Deepak", 63000, 9200, 11);

		empArr[empCount++] = new Admin(305, "Kavita", 69000, 9700);
		empArr[empCount++] = new Admin(306, "Manoj", 74000, 11500);
		empArr[empCount++] = new Admin(307, "Ritu", 71000, 10200);
		empArr[empCount++] = new Admin(308, "Arjun", 76000, 12500);
	}

	//Getters
	public static Employee[] getEmpArr() {
		return empArr;
	}

	public static int getEmpCount() {
		return empCount;
	}

	public boolean addEmployee(Employee e) {
		if(empCount >= empArr.length) {
			Employee[] newArr=new Employee[empArr.length + 5];
			for(int i=0;i<empArr.length;i++) {
				newArr[i]=empArr[i];
			}
			empArr=newArr;
		}
		empArr[empCount++]=e;
		return true;
	}
	
	public void displayAllEmployee() {
		for(int i=0;i<empCount;i++) {
			System.out.println(empArr[i]);
		}
	}
	
	public int searchEmployeeById(int id) {
		for(int i=0;i<empCount;i++) {
			if(empArr[i].getId() == id) {
				return i;
			}
		}
		return -1;
	}
	
	public boolean updateEmployee(int id, double salary) {
		int idx=searchEmployeeById(id);
			empArr[idx].setSalary(salary);
			return true;
	}
	
	public boolean deleteEmployee(int id) {
		int idx=searchEmployeeById(id);
		if(idx!=-1) {
			for(int i=idx;i<empCount;i++) {
				empArr[i]=empArr[i+1];
			}
			empArr[--empCount]=null;
			return true;
		}
		return false;
	}
	
	public Employee getEmployeeById(int id) {
		int idx=searchEmployeeById(id);
		if(idx!= -1) {
			return empArr[idx];
		}
		else 
			return null;
	}
}






















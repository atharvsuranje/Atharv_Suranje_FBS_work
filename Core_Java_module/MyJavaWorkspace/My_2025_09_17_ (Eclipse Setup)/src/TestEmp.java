class Employee{
	int empId;
	String empName;
	double salary;
	Employee() { //default constructor
		this.empId=100;
		this.empName="Default";
		this.salary=10000;
	}
	
	Employee(int empId, String empName, double salary) { //parameterized constructor
		this.empId = empId;
		this.empName = empName;
		this.salary = salary;
	}

	int getEmpId() {
		return empId;
	}

	String getEmpName() {
		return empName;
	}

	double getSalary() {
		return salary;
	}

	void setEmpId(int empId) {
		this.empId = empId;
	}

	void setEmpName(String empName) {
		this.empName = empName;
	}

	void setSalary(double salary) {
		this.salary = salary;
	}
	
	void display() {
		System.out.println("ID : "+this.empId);
		System.out.println("Name : "+this.empName);
		System.out.println("Salary: "+this.salary);
	}
}
class TestEmp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee employee1=new Employee();
		employee1.display();
	}

}

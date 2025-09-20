class Employee{
	int id;
	String name;
	double salary;

	void setId(int i){
		this.id=i;
	}

	void setName(String n){
		this.name=n;
	}

	void setSalary(double s){
		this.salary=s;
	}
} //Employee ends here

class TestEmployee{
	public static void main(String[] a){
		Employee e1=new Employee();
		e1.setId(101);
		e1.setName("Test");
		e1.setSalary(12345.258);
		System.out.println("Name is : "+e1.name);
		System.out.println("Id is : "+e1.id);
		System.out.println("Salary is : "+e1.salary);
	} //main ends here
} //TestEmployee ends here
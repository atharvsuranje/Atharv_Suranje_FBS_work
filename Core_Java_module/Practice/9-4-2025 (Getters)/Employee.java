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
	
	int getId(){
		return this.id;
	}

	String getName(){
		return this.name;
	}

	Double getSalary(){
		return this.salary;
	}

	void display(){
		System.out.println("Name is : "+this.name);
		System.out.println("Id is : "+this.id);
		System.out.println("Salary is : "+this.salary);
	}
} //Employee ends here

class TestEmployee{
	public static void main(String[] a){
		Employee e1=new Employee();
		e1.setId(101);
		e1.setName("Test");
		e1.setSalary(12345.258);
		e1.display();
	} //main ends here
} //TestEmployee ends here
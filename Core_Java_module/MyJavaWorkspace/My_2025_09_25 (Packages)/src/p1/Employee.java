package p1;

abstract public class Employee {
	int id;
	String name;
	double salary;

	public Employee(){
		this.name="Test";
		this.id=101;
		this.salary=9999.12;
	}

	public Employee(String n,int i,double s){
		this.name=n;
		this.id=i;
		this.salary=s;
	}
	
	public void setId(int i){
		this.id=i;
	}

	public void setName(String n){
		this.name=n;
	}

	public void setSalary(double s){
		this.salary=s;
	}
	
	public int getId(){
		return this.id;
	}

	public String getName(){
		return this.name;
	}

	public double getSalary(){
		return this.salary;
	}

	public void display(){
		System.out.println();
		System.out.println("Name is : "+this.name);
		System.out.println("Id is : "+this.id);
		System.out.println("Salary is : "+this.salary);
	}

	public double calSalary() {
		return this.salary;
	}
}

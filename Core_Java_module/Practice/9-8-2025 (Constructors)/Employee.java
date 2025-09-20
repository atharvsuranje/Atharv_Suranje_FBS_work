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

	Employee(){
		this.name="Test";
		this.id=101;
		this.salary=9999.12;
		System.out.println("Inside Default Constructor");
	}

	Employee(String n,int i,double s){
		this.name=n;
		this.id=i;
		this.salary=s;
		System.out.println("Inside Parameterized Constructor");
	}
} //Employee ends here

class TestEmployee{
	public static void main(String[] a){
		Employee e1=new Employee();
		e1.display();
		Employee e2=new Employee("Atharv",987,9876.12);
		e2.display();
	} //main ends here
} //TestEmployee ends here
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

	Employee(){
		this.name="Test";
		this.id=007;
		this.salary=9999.12;
	}

	Employee(int i,String n,double s){
		this.name=n;
		this.id=i;
		this.salary=s;
	}

	void display(){
		System.out.println("Name is : "+this.name);
		System.out.println("Id is : "+this.id);
		System.out.println("Salary is : "+this.salary);
	}
} //Employee ends here

class TestEmployee{
	public static void main(String[] a){
		Employee[] emp=new Employee[5];
		emp[0]=new Employee(101,"Atharv",30000);
		emp[1]=new Employee();
		emp[2]=new Employee(104,"Pranav",20000);
		emp[3]=new Employee();
		emp[4]=new Employee(105,"Nishikant",15000);
		System.out.println(emp[0]);
		for(int i=0;i<5;i++){
			emp[i].display();
		}
	} //main ends here
} //TestEmployee ends here
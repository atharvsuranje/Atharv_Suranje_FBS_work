class Admin{
	int id;
	String name;
	double salary,allowance;
	void setId(int i){
		this.id=i;
	}

	void setName(String n){
		this.name=n;
	}

	void setSalary(double s){
		this.salary=s;
	}

	void setAllowance(double a){
		this.allowance=a;
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
	
	Double getAllowance(){
		return this.allowance;
	}

	void display(){
		System.out.println("Name is : "+this.name);
		System.out.println("Id is : "+this.id);
		System.out.println("Salary is : "+this.salary);
		System.out.println("Allowance is : "+this.allowance);
	}

	Admin(){
		this.id=101;
		this.name="Ram";
		this.salary=12345.98;
		this.allowance=987.12;
		System.out.println("Inside Default Constructor");
	}
	
	Admin(int i,String s,double sa,double a){
		this.id=i;
		this.name=s;
		this.salary=sa;
		this.allowance=a;
		System.out.println("Inside Parameterized Constructor");
	}
}

class TestAdmin{
	public static void main(String[] a){
		Admin a1=new Admin();
		a1.display();
		Admin a2=new Admin(1001,"Shyam",98765.12,123.98);
		a2.display();
	} //main ends here
} //TestAdmin ends here
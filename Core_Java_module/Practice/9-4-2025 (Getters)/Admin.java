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
}

class TestAdmin{
	public static void main(String[] a){
		Admin a1=new Admin();
		a1.setId(101);
		a1.setName("Test");
		a1.setSalary(12345.258);
		a1.setAllowance(124.21);
		a1.display();
	} //main ends here
} //TestAdmin ends here
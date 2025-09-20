class HRM{
	int id;
	String name;
	double salary, commission;
	void setId(int i){
		this.id=i;
	}

	void setName(String n){
		this.name=n;
	}

	void setSalary(double s){
		this.salary=s;
	}

	void setCommission(double a){
		this.commission=a;
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
	
	Double getCommission(){
		return this.commission;
	}

	void display(){
		System.out.println("Name is : "+this.name);
		System.out.println("Id is : "+this.id);
		System.out.println("Salary is : "+this.salary);
		System.out.println("Commission is : "+this.commission);
	}
}

class TestHRM{
	public static void main(String[] a){
		HRM a1=new HRM();
		a1.setId(101);
		a1.setName("Test");
		a1.setSalary(12345.258);
		a1.setCommission(124.21);
		a1.display();
	} //main ends here
} //TestHRM ends here
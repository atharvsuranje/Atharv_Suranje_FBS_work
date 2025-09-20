class Employee{
	String name;
	double basicSalary;
	static double companyBonusRate;

	static{
		companyBonusRate=5;
	}
	Employee(){
		this.name="Default";
		this.basicSalary=1000;
	}

	Employee(String n,double b){
		this.name=n;
		this.basicSalary=b;
	}

	void setName(String n){
		this.name=n;
	}

	void setBasicSalary(double b){
		this.basicSalary=b;
	}
	
	static void setCompanyBonusRate(double b){
		companyBonusRate=b;
	}

	String getName(){
		return this.name;
	}

	double getBasicSalary(){
		return this.basicSalary;
	}
	
	static double getCompanyBonusRate(){
		return companyBonusRate;
	}

	void calcTotalSalary(){
		double total=this.basicSalary + (basicSalary*(companyBonusRate/100));
		System.out.println("Total Salary is : "+total);
	} 

	void display(){
		System.out.println("Name is : "+this.name);
		System.out.println("Basic Salary is : "+this.basicSalary);
	}
} //class Employee ends here

class TestEmployee{
 	public static void main(String[] args){
		Employee e1=new Employee("Atharv",20000);
		e1.display();
		e1.calcTotalSalary();
		Employee.setCompanyBonusRate(12.5);
		e1.display();
		e1.calcTotalSalary();
	} //main ends here
} //class TestEmployee ends here
























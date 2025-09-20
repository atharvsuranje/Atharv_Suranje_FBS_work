class SalesManager{
	int id,target;
	String name;
	double salary,incentive; 
	

	void setId(int i){
		this.id=i;
	}

	void setName(String n){
		this.name=n;
	}

	void setSalary(double s){
		this.salary=s;
	}

	void setIncentive(double i){
		this.incentive=i;
	}
	
	void setTarget(int t){
		this.target=t;
	}

} //SalesManager ends here

class TestSalesManager{
	public static void main(String[] a){
		SalesManager sm1=new SalesManager();
		sm1.setId(101);
		sm1.setName("Test");
		sm1.setSalary(12345.258);
		sm1.setIncentive(987.258);
		sm1.setTarget(10);
		System.out.println("Name is : "+sm1.name);
		System.out.println("Id is : "+sm1.id);
		System.out.println("Salary is : "+sm1.salary);
		System.out.println("Incentive is : "+sm1.incentive);
		System.out.println("Target is : "+sm1.target);
	} //main ends here
} //TestSalesManager ends here
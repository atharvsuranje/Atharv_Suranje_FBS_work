abstract class Employee1{
	int id;
	String name;
	double salary;

	Employee1(){
		this.name="Test";
		this.id=101;
		this.salary=9999.12;
	}

	Employee1(String n,int i,double s){
		this.name=n;
		this.id=i;
		this.salary=s;
	}
	
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

	double getSalary(){
		return this.salary;
	}

	void display(){
		System.out.println();
		System.out.println("Name is : "+this.name);
		System.out.println("Id is : "+this.id);
		System.out.println("Salary is : "+this.salary);
	}

	abstract double calSalary();
	
} //Employee ends here

class HR1 extends Employee1{
	double commission;

	HR1() {
		super();
		this.commission = 0;
	}

	HR1(String name,int id,double salary,double commission) {
		super(name,id,salary);
		this.commission = commission;
	}


	double getCommission() {
		return commission;
	}


	void setCommission(double commission) {
		this.commission = commission;
	}
	
	void display() {
		super.display();
		System.out.println("Commission is : "+this.commission);
	}
	
	double calSalary() {
		return this.salary+this.commission;
	}
} //HR ends here

class SalesManager1 extends Employee1{
	double incentive;
	int target;
	
	SalesManager1() {
		super();
		this.incentive = 100;
		this.target = 0;
	} 
	
	SalesManager1(String name,int id,double salary,double incentive, int target) {
		super(name,id,salary);
		this.incentive = incentive;
		this.target = target;
	}

	double getIncentive() {
		return incentive;
	}

	int getTarget() {
		return target;
	}

	void setIncentive(double incentive) {
		this.incentive = incentive;
	}

	void setTarget(int target) {
		this.target = target;
	}
	void display() {
		super.display();
		System.out.println("Incentive is : "+this.incentive);
		System.out.println("Target is : "+this.target);
	}	
	
	double calSalary() {
		return this.salary+this.incentive;
	}
} //SalesManager ends here

class Admin1 extends Employee1{
	double allowance;

	Admin1() {
		super();
		this.allowance = 0;
	}
	Admin1(String name,int id,double salary,double allowance) {
		super(name,id,salary);
		this.allowance = allowance;
	}
	
	double getAllowance() {
		return allowance;
	}
	void setAllowance(double allowance) {
		this.allowance = allowance;
	}
	
	void display(){
		super.display();
		System.out.println("Allowance is : "+this.allowance);
	}
	
	double calSalary() {
		return this.salary+this.allowance;
	}
} //Admin ends here


class TestEmployee1{
	public static void main(String[] a){
		Employee1 e1;
		
		e1=new SalesManager1("Hari",102,30000,3000,20);
		TestEmployee1.myFun(e1);
		
		e1=new Admin1("Soham",103,40000,4000);
		TestEmployee1.myFun(e1);
		
		e1=new HR1("Pranav",104,50000,5000);
		TestEmployee1.myFun(e1);
		
	} //main ends here
	
	static void myFun(Employee1 e1) {
		System.out.println(e1.getName());
		System.out.println(e1.calSalary());
		
		if(e1 instanceof SalesManager1) {
			SalesManager1 sm1=(SalesManager1) e1;
			System.out.println(sm1.getIncentive());
		}
		
		if(e1 instanceof HR1) {
			HR1 hr1=(HR1) e1;
			System.out.println(hr1.getCommission());
		}
		
		if(e1 instanceof Admin1) {
			Admin1 a1=(Admin1) e1;
			System.out.println(a1.getAllowance());
		}
	}
} //TestEmployee ends here


































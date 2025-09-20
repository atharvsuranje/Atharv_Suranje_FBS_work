class Employee{
	int id;
	String name;
	double salary;

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

class HR extends Employee{
	double commission;

	HR() {
		super();
		this.commission = 0;
		System.out.println("Inside Default Constructor");
	}

	HR(String name,int id,double salary,double commission) {
		super(name,id,salary);
		this.commission = commission;
		System.out.println("Inside Parameterized Constructor");
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
	
} //HR ends here

class SalesManager extends Employee{
	double incentive;
	int target;
	
	SalesManager() {
		super();
		this.incentive = 100;
		this.target = 0;
		System.out.println("Inside Default Constructor");
	} 
	
	SalesManager(String name,int id,double salary,double incentive, int target) {
		super(name,id,salary);
		this.incentive = incentive;
		this.target = target;
		System.out.println("Inside Parameterized Constructor");
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
} //SalesManager ends here

class Admin extends Employee{
	double allowance;

	Admin() {
		super();
		this.allowance = 0;
		System.out.println("Inside Default Constructor");
	}
	Admin(String name,int id,double salary,double allowance) {
		super(name,id,salary);
		this.allowance = allowance;
		System.out.println("Inside Parameterized Constructor");
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
	
} //Admin ends here

class AreaSalesManager extends SalesManager{
	String areaName;
	
	AreaSalesManager(){
		super();
		this.areaName="Pune";
		System.out.println("Inside Default Constructor");
	}

	AreaSalesManager(String name,int id,double salary,double incentive,int target,String areaName) {
		super(name,id,salary,incentive,target);
		this.areaName = areaName;
		System.out.println("Inside Parameterized Constructor");
	}
	
	void display() {
		super.display();
		System.out.println("Area Name is : "+this.areaName);
	}
	
}
class TestEmployee{
	public static void main(String[] a){
		Employee e1=new Employee();
		e1.display();
		Employee e2=new Employee("Atharv",101,20000);
		e2.display();
		HR h1=new HR();
		h1.display();
		HR h2=new HR("Pranav",102,30000,5000);
		h2.display();
		SalesManager sm1=new SalesManager();
		sm1.display();
		SalesManager sm2=new SalesManager("Aaditya",103,10000,10000,15);
		sm2.display();
		Admin a1=new Admin();
		a1.display();
		Admin a2= new Admin("Soham",104,50000,1000);
		a2.display();
		AreaSalesManager asm1=new AreaSalesManager();
		asm1.display();
		AreaSalesManager asm2=new AreaSalesManager("HAri",105,60000,2000,30,"NAgar");
		asm2.display();
	} //main ends here
} //TestEmployee ends here


































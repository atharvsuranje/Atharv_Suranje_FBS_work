class Employee{
	int id;
	String name;
	double salary;

	Employee(){
		this.name="Test";
		this.id=101;
		this.salary=9999.12;
	}

	Employee(String n,int i,double s){
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

	Double getSalary(){
		return this.salary;
	}

	void display(){
		System.out.println();
		System.out.println("Name is : "+this.name);
		System.out.println("Id is : "+this.id);
		System.out.println("Salary is : "+this.salary);
	}

	double calSalary() {
		return this.salary;
	}
	
} //Employee ends here

class HR extends Employee{
	double commission;

	HR() {
		super();
		this.commission = 0;
	}

	HR(String name,int id,double salary,double commission) {
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

class SalesManager extends Employee{
	double incentive;
	int target;
	
	SalesManager() {
		super();
		this.incentive = 100;
		this.target = 0;
	} 
	
	SalesManager(String name,int id,double salary,double incentive, int target) {
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

class Admin extends Employee{
	double allowance;

	Admin() {
		super();
		this.allowance = 0;
	}
	Admin(String name,int id,double salary,double allowance) {
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

class AreaSalesManager extends SalesManager{
	String areaName;
	
	AreaSalesManager(){
		super();
		this.areaName="Pune";
	}

	AreaSalesManager(String name,int id,double salary,double incentive,int target,String areaName) {
		super(name,id,salary,incentive,target);
		this.areaName = areaName;
	}
	
	void display() {
		super.display();
		System.out.println("Area Name is : "+this.areaName);
	}
	
	double calSalary() {
		return this.salary+this.incentive;
	}
}
class TestEmployee{
	public static void main(String[] a){
		Employee e1;
		e1=new Employee("Atharv",101,20000);
		e1.display();
		System.out.println("Employee Salary : "+e1.calSalary());
		
		e1=new SalesManager("Hari",102,30000,3000,20);
		e1.display();
		System.out.println("Sales Manager Salary : "+e1.calSalary());
		
		e1=new Admin("Soham",103,40000,4000);
		e1.display();
		System.out.println("Admin Salary : "+e1.calSalary());
		
		e1=new HR("Pranav",104,50000,5000);
		e1.display();
		System.out.println("HR Salary : "+e1.calSalary());
		
		e1=new AreaSalesManager("Nishikant",105,60000,6000,60,"Akola");
		e1.display();
		System.out.println("Area Sales Manager Salary : "+e1.calSalary());
	} //main ends here
} //TestEmployee ends here


































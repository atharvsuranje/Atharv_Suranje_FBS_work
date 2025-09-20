import java.util.Scanner;

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

	void display(){
		System.out.println("Name is : "+this.name);
		System.out.println("Id is : "+this.id);
		System.out.println("Salary is : "+this.salary);
		System.out.println("Incentive is : "+this.incentive);
		System.out.println("Target is : "+this.target);
	}

	SalesManager(){
		this.name="Test";
		this.id=101;
		this.salary=98765.12;
		this.incentive=1234.98;
		this.target=10;
		System.out.println("Inside Default Constructor");
	}

	SalesManager(String n,int i,double s,double in,int t){
		this.name=n;
		this.id=i;
		this.salary=s;
		this.incentive=i;
		this.target=t;
		System.out.println("Inside Parameterized Constructor");
	}
} //SalesManager ends here

class TestSalesManager{
	public static void main(String[] a){
		SalesManager sm1=new SalesManager();
		sm1.display();
		SalesManager sm2=new SalesManager("Atharv",111,98765.12,1234.98,5);
		sm2.display();
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter Name : ");
        String name=sc.nextLine();
        System.out.println("Enter ID : ");
        int id=sc.nextInt();
        System.out.println("Enter Salary : ");
        double salary=sc.nextDouble();
        System.out.println("Enter Incentive : ");
        double incentive=sc.nextDouble();
        System.out.println("Enter Target : ");
        int target=sc.nextInt();
		SalesManager e3=new SalesManager(name,id,salary,incentive,target);
        e3.display();
	} //main ends here
} //TestSalesManager ends here
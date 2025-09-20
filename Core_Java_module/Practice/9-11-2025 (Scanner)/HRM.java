import java.util.Scanner;

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

	HRM(){
		this.id=101;
		this.name="Test";
		this.salary=98765.12;
		this.commission=1234.98;
		System.out.println("Inside Default Constructor");
	}

	HRM(int i,String n,double s,double a){
		this.id=i;
		this.name=n;
		this.salary=s;
		this.commission=a;
		System.out.println("Inside Parameterized Constructor");
	}
}

class TestHRM{
	public static void main(String[] a){
		HRM a1=new HRM();
		a1.display();
		HRM a2=new HRM(111,"Atharv",12345.98,9876.12);
		a2.display();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Name : ");
        String name=sc.nextLine();
        System.out.println("Enter ID : ");
        int id=sc.nextInt();
        System.out.println("Enter Salary : ");
        double salary=sc.nextDouble();
        System.out.println("Enter Allownance : ");
        double allowance=sc.nextDouble();
		HRM a3=new HRM(id,name,salary,allowance);
        a3.display();
	} //main ends here
} //TestHRM ends here
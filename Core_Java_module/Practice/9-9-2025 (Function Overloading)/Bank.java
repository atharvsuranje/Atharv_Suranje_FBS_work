class Bank{
	void approveLoan(Student s){
		System.out.println("Student Name : "+s.name+" | Percentage : "+s.percentage);
		
		if(s.percentage>=80){
			System.out.println("Loan Approved : 2 Lakh");
		}
		else if(s.percentage>=60 && s.percentage<80){
			System.out.println("Loan Approved : 1 Lakh");
		}
		else if(s.percentage>=40 && s.percentage<60){
			System.out.println("Loan Approved : 50K");
		}
		else{
			System.out.println("Loan Not Approved");
		}
	}
	
	void approveLoan(Employee e){
		System.out.println("Employee Name : "+e.name+" | Salary : "+e.salary);

		if(e.salary>=12){
			System.out.println("Loan Approved : 7 Lakh");
		}
		else if(e.salary>=10 && e.salary<12){
			System.out.println("Loan Approved : 6 Lakh");
		}
		else if(e.salary>=6 && e.salary<10){
			System.out.println("Loan Approved : 5 Lakh");
		}
		else if(e.salary>=4 && e.salary<6){
			System.out.println("Loan Approved : 4 Lakh");
		}
		else{
			System.out.println("Loan Not Approved");
		}
	}
} //class Bank ends here

class Student{
	int rollNo;
	String name;
	double percentage;
	
	Student(){
		this.rollNo=0;
		this.name=0;
		this.percentage=0;
	}

	Student(int rollNo,String name,double percentage){
		this.rollNo=rollNo;
		this.name=name;
		this.percentage=percentage;
	}

	void setRollNo(int roll){
		this.rollNo=roll;
	}

	void setName(String s){
		this.name=s;
	}

	void setPercentage(double p){
		this.percentage=p;
	}

	int getRollNo(){
		return rollNo;
	}

	String getName(){
		return name;
	}

	double getPercentage(){
		return percentage;
	}
} //class Student ends here

class Employee{
	int id;
	String name;
	double salary;

	Employee(){
		this.id=0;
		this.name=0;
		this.salary=0;
	}

	Employee(int id,String name,double salary){
		this.id=id;
		this.name=name;
		this.salary=salary;
	}

	void setId(int id){
		this.id=id;
	}

	void setName(String s){
		this.name=s;
	}

	void setSalary(double s){
		this.salary=s;
	}

	int getId(){
		return id;
	}

	String getName(){
		return name;
	}

	double getSalary(){
		return salary;
	}
} //class Employee ends here

class TestBank{
	public static void main(String[] args){
		Bank b=new Bank();
		Student s1=new Student(1,"Rahul",85);
		Employee e1=new Employee(101,"Rohan",9);
		b.approveLoan(s1);
		b.approveLoan(e1);
	} //main ends here
} //class TestBank ends here
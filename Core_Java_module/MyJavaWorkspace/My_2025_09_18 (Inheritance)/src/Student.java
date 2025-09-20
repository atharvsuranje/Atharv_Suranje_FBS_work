class Student {
	int rollNo;
	String name;
	double distance;
	static int count;
	static {
		count=0;
	}
	Student(){
		this.rollNo=100;
		this.name="Test";
		this.distance=980;
		count++;
		System.out.println("Inside Default Constructor");
	}

	Student(int r,String n,double m){
		this.rollNo=r;
		this.name=n;
		this.distance=m;
		count++;
		System.out.println("Inside Parameterized Constructor");
	}
	
	void setRollNo(int r){
		this.rollNo=r;
	}

	void setMarks(double m){
		this.distance=m;
	}

	void setName(String n){
		this.name=n;
	}

	int getRollNo(){
		return this.rollNo;
	}

	String getName(){
		return this.name;
	}

	double getMarks(){
		return this.distance;
	}

	static int getCount() {
		return count;
	}

	void display(){
		System.out.println("Roll No is : "+this.rollNo);
		System.out.println("Name is : "+this.name);		
		System.out.println("Marks is : "+this.distance);
		
	}
	
	
} //Class Student ends here

class PlacedStudent extends Student{
	String companyName,designation;


	

	PlacedStudent(int rollNo,String name,double distance,String companyName, String designation) {
		super(rollNo,name,distance);
		this.companyName = companyName;
		this.designation = designation;
	}

	void setCompanyName(String n){
		this.companyName=n;
	}

	void setDesignation(String d){
		this.designation=d;
	}
	
	String getCompanyName(){
		return this.companyName;
	}

	String getDesignation(){
		return this.designation;
	}
	
	void display(){
		super.display();
		System.out.println("Company Name : "+this.companyName);
		System.out.println("DEsignation : "+this.designation);
	}

} // class PlacedStudent ends here
class TestStudent{
	public static void main(String[] a){
		Student s1=new Student();
		s1.display();
		Student s2=new Student(111,"Atharv",91.33);
		s2.display();
		System.out.println("Count is : "+Student.getCount());
		PlacedStudent ps1=new PlacedStudent(101,"Pranav",150,"TCS","SDE");
		ps1.display();
		System.out.println("Count is : "+Student.getCount());
		
	} //main ends here
} //Class TestStudent ends here


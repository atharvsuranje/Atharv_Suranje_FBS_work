class Student {
	int rollNo;
	String name;
	double marks;

	void setRollNo(int r){
		this.rollNo=r;
	}

	void setMarks(double m){
		this.marks=m;
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
		return this.marks;
	}

	void display(){
		System.out.println("Roll No is : "+this.rollNo);
		System.out.println("Name is : "+this.name);		
		System.out.println("Marks is : "+this.marks);
	}
	
	Student(){
		this.rollNo=101;
		this.name="Test";
		this.marks=98.12;
		System.out.println("Inside Default Constructor");
	}

	Student(int r,String n,double m){
		this.rollNo=r;
		this.name=n;
		this.marks=m;
		System.out.println("Inside Default Constructor");
	}
} //Class Student ends here

class TestStudent{
	public static void main(String[] a){
		Student s1;
		s1=new Student();
		s1.display();
		Student s2;
		s2=new Student(111,"Atharv",91.33);
		s2.display();
	} //main ends here
} //Class TestStudent ends here


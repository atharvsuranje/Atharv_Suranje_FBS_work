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

} //Class Student ends here

class TestStudent{
	public static void main(String[] a){
		Student s1;
		s1=new Student();
		System.out.println(s1);
		s1.setRollNo(10);
		s1.setMarks(95.24);
		s1.setName("Ram");		
		System.out.println(s1.getRollNo());
		System.out.println(s1.getName());		
		System.out.println(s1.getMarks());
		s1.display();
	} //main ends here
} //Class TestStudent ends here


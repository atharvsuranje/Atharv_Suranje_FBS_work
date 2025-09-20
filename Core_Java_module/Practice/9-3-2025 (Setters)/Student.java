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

} //Class Student ends here

class TestStudent{
	public static void main(String[] a){
		Student s1;
		s1=new Student();
		System.out.println(s1);
		s1.setRollNo(10);
		s1.setMarks(95.24);
		s1.setName("Ram");		
		System.out.println(s1.rollNo);
		System.out.println(s1.name);		
		System.out.println(s1.marks);
	} //main ends here
} //Class TestStudent ends here


class Course{
	int courseId,duration;
	String cName;
	double fees;

	void setCourseId(int c){
		this.courseId=c;
	}
	
	void setDuration(int d){
		this.duration=d;
	}
	
	void setCName(String n){
		this.cName=n;
	}

	void setFees(double f){
		this.fees=f;
	}

	int getCourseId(){
		return this.courseId;
	}

	int getDuration(){
		return this.duration;
	}	
	
	String getCName(){
		return this.cName;
	}
	
	double getFees(){
		return this.fees;
	}

	void display(){
		System.out.println("Course ID : "+this.courseId);
		System.out.println("Course Name : "+this.cName);
		System.out.println("Duration : "+this.duration+" months");
		System.out.println("Fees : "+this.fees);
	}

	Course(){
		this.courseId=101;
		this.duration=6;
		this.cName="Java FullStack";
		this.fees=50000.99;
		System.out.println("Inside Default Constructor");
	}
	
	Course(int i,int d,String c,double f){
		this.courseId=i;
		this.duration=d;
		this.cName=c;
		this.fees=f;
		System.out.println("Inside Parameterized Constructor");
	}
} //Course ends here

class TestCourse{
	public static void main(String[] a){
		Course c1=new Course();
		c1.display();
		Course c2=new Course(104,8,"Python Fullstack",50000.11);
		c2.display();
	} //main ends here
} //class TestCourse ends here
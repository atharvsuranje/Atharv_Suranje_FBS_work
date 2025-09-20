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
} //Course ends here

class TestCourse{
	public static void main(String[] a){
		Course c1=new Course();
		c1.setCourseId(101);
		c1.setDuration(6);
		c1.setCName("Java FullStack");
		c1.setFees(50000.99);
		c1.display();
	} //main ends here
} //class TestCourse ends here
class Student{
	int fbsId;
	String sName;
	double distanceTravelled;
	static int studentCount;

	static{
		studentCount=0;
	}

	Student(){
		this.fbsId=1;
		this.sName="Default";
		this.distanceTravelled=1;
		studentCount++;
	}

	Student(int i,String s,double d){
		this.fbsId=i;
		this.sName=s;
		this.distanceTravelled=d;
		studentCount++;
	}

	void setFbsId(int i){
		this.fbsId=i;
	}

	void setSName(String s){
		this.sName=s;
	}

	void setDistanceTravelled(double d){
		this.distanceTravelled=d;
	}

	/* static void setStudentCount(int i){
		studentCount=i;
	} Not Necessary */

	int getFbsId(){
		return this.fbsId;
	}

	String getSName(){
		return this.sName;
	}
	
	double getDistanceTravelled(){
		return this.distanceTravelled;
	}

	static int getStudentCount(){
		return studentCount;
	}

	void display(){
		System.out.println("Student FBS ID : "+fbsId);
		System.out.println("Student Name : "+sName);
		System.out.println("Student Distance Travelled : "+distanceTravelled);
	}
} //class Student ends here

class TestStudent{
	public static void main(String[] args) {
		Student s1=new Student(1,"Stud1",10);
		s1.display();
		Student s2=new Student(2,"Stud2",20);
		s2.display();
	} //main ends here
} //class TestStudent ends here
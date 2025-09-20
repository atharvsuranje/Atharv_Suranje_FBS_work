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
		Student[] stud=new Student[5];
		stud[0]=new Student(101,"Atharv",10);
		stud[1]=new Student();
		stud[2]=new Student(104,"Pranav",20);
		stud[3]=new Student();
		stud[4]=new Student(105,"Nishikant",15);
		System.out.println(stud[0]);
		for(int i=0;i<5;i++){
			stud[i].display();
		}
		
	} //main ends here
} //class TestStudent ends here
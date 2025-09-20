class PlacedStudent{
	String companyName,designation;
	double distance;

	void setCompanyName(String n){
		this.companyName=n;
	}

	void setDesignation(String d){
		this.designation=d;
	}

	void setDistance(double d){
		this.distance=d;
	}
	
	String getCompanyName(){
		return this.companyName;
	}

	String getDesignation(){
		return this.designation;
	}
	
	double getDistance(){
		return this.distance;
	}

	void display(){
		System.out.println("Company Name : "+this.companyName);
		System.out.println("DEsignation : "+this.designation);
		System.out.println("Distance : "+this.distance);
	}

	PlacedStudent(){
		this.companyName="TCS";
		this.designation="Intern";
		this.distance=5;
		System.out.println("Inside Default Constructor");
	}

	PlacedStudent(String c,String d,double di){
		this.companyName=c;
		this.designation=d;
		this.distance=di;
		System.out.println("Inside Parameterized Constructor");
	}
} // class PlacedStudent ends here

class TestPlacedStudent{
	public static void main(String[] args){
		PlacedStudent ps1=new PlacedStudent();
		ps1.display();
		PlacedStudent ps2=new PlacedStudent("Wipro","SDA",9);
		ps2.display();
	} //main ends
} // TestPlacedStudent ends
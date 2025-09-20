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
} // class PlacedStudent ends here

class TestPlacedStudent{
	public static void main(String[] args){
		PlacedStudent ps1=new PlacedStudent();
		ps1.setCompanyName("TCS");
		ps1.setDesignation("ASE");
		ps1.setDistance(10);
		ps1.display();
	} //main ends
} // TestPlacedStudent ends
class Distance{
	int feet,inch;
	
	void setFeet(int f){
		this.feet=f;
	}

	void setInch(int i){
		this.inch=i;
	}

	int getFeet(){
		return this.feet;
	}

	int getInch(){
		return this.inch;
	}

	void display(){
		System.out.println("Distance is : "+this.feet+" feet and "+this.inch+" inch");
	}
} //class Distance ends here

class TestDistance{
	public static void main(String[] args){
		Distance d1=new Distance();
		d1.setFeet(5);
		d1.setInch(9);
		d1.display();
	} //main ends here
} //class TestDistance ends here
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

	Distance(){
		this.feet=5;
		this.inch=9;
		System.out.println("Inside Default Constructor");
	}

	Distance(int f,int i){
		this.feet=f;
		this.inch=i;
		System.out.println("Inside Parameterized Constructor");
	}
} //class Distance ends here

class TestDistance{
	public static void main(String[] args){
		Distance d1=new Distance();
		d1.display();
		Distance d2=new Distance(4,5);
		d2.display();
	} //main ends here
} //class TestDistance ends here
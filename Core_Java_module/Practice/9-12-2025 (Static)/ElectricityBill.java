class ElectricityBill{
	int id,unit;
	String name;
	static double ratePerUnit;

	static{
		ratePerUnit=10;
	}

	ElectricityBill(){
		this.id=100;
		this.unit=10;
		this.name="Default";
	}
	
	ElectricityBill(int i,String n,int u){
		this.id=i;
		this.unit=u;
		this.name=n;
	}

	void setId(int i){
		this.id=i;
	}
	
	void setUnit(int u){
		this.unit=u;
	}

	void setName(String n){
		this.name=n;
	}
	
	static void setRatePerUnit(double r){
		ratePerUnit=r;
	}

	int getId(){
		return this.id;
	}

	int getUnit(){
		return this.unit;
	}

	String getName(){
		return this.name;
	}

	static double getRatePerUnit(){
		return ratePerUnit;
	}
	
	void calcBill(){
		System.out.println("Bill Amount  is : "+(this.unit) * ratePerUnit);
	}

	void display(){
		System.out.println("Id is : "+this.id);
		System.out.println("Name is : "+this.name);
		System.out.println("Unit is : "+this.unit);
		System.out.println("Rate Per Unit is : "+ratePerUnit);
	}
} // class ElectricityBill ends here

class TestElectricityBill{
	public static void main(String[] args){
		ElectricityBill e1=new ElectricityBill(101,"Atharv",100);
		e1.display();
		e1.calcBill();
		e1.setUnit(53);
		ElectricityBill.setRatePerUnit(5);
		e1.display();
		e1.calcBill();
	} //main ends here
} // class TestElectricityBill ends here


























class MedicalEquipment{
	String name;
	double price;
	int powerUsage;
	
	
	MedicalEquipment() {
		this.name = "Default";
		this.price = 100000;
		this.powerUsage = 1000;
	}
	
	MedicalEquipment(String name, double price, int powerUsage) {
		this.name = name;
		this.price = price;
		this.powerUsage = powerUsage;
	}

	String getName() {
		return name;
	}

	double getPrice() {
		return price;
	}

	int getPowerUsage() {
		return powerUsage;
	}

	void setName(String name) {
		this.name = name;
	}

	void setPrice(double price) {
		this.price = price;
	}

	void setPowerUsage(int powerUsage) {
		this.powerUsage = powerUsage;
	}
	
	//polymorphic behavior
	void scan() {
		System.out.println("Scan the Patient.");
	}
	void display() {
		System.out.println();
		System.out.println("Name : "+this.name);
		System.out.println("Price : "+this.price);
		System.out.println("Power Usage : "+this.powerUsage);
	}
	
} //MedicalEquipment ends here

class XRay extends MedicalEquipment{
	double radationLevel;

	XRay() {
		super();
		this.radationLevel = 4;
	}
	
	XRay(String name, double price, int powerUsage,double radationLevel) {
		super(name,price,powerUsage);
		this.radationLevel = radationLevel;
	}

	double getRadationLevel() {
		return radationLevel;
	}

	void setRadationLevel(double radationLevel) {
		this.radationLevel = radationLevel;
	}
	
	//polymorphic behavior
	void scan() {
		System.out.println("Scan the Patient using Radiation.");
	}
	void display() {
		super.display();
		System.out.println("Radation Level : "+this.radationLevel);
	}
	
} //XRay ends here

class MRI extends MedicalEquipment{
	double magneticStrength;
	int scanTime;
	
	MRI() {
		super();
		this.magneticStrength = 5;
		this.scanTime = 50;
	}
	
	MRI(String name, double price, int powerUsage,double magneticStrength, int scanTime) {
		super(name,price,powerUsage);
		this.magneticStrength = magneticStrength;
		this.scanTime = scanTime;
	}
	
	//polymorphic behavior
	void scan() {
		System.out.println("Scan the Patient using Magnetic Resonance.");
	}
	void display() {
		super.display();
		System.out.println("Magnetic Strength : "+this.magneticStrength);
		System.out.println("Scan Time : "+this.scanTime);
	}
} //MRI ends here

class TestMedicalEquipment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MedicalEquipment me1;
		
		me1=new MedicalEquipment("Ventilator", 250000, 1500);
        me1.display();
        me1.scan();
        
        me1=new XRay("XRay Model X", 500000, 2000, 8.5);
        me1.display();
        me1.scan();
        
        me1=new MRI("MRI Scanner Pro", 2000000, 5000, 7.5, 45);
        me1.display();
        me1.scan();
	} //main ends here

} //TestMedicalEquipment ends here

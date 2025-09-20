class ElectronicDevice{
	String brand,model;
	int battery;
	String processor;
	
	ElectronicDevice() {
		this.brand = "Default";
		this.model = "Max";
		this.battery = 5000;
		this.processor = "SnapDragon";
	}
	
	ElectronicDevice(String brand, String model, int battery, String processor) {
		this.brand = brand;
		this.model = model;
		this.battery = battery;
		this.processor = processor;
	}

	String getBrand() {
		return brand;
	}

	String getModel() {
		return model;
	}

	int getBattery() {
		return battery;
	}

	String getProcessor() {
		return processor;
	}

	void setBrand(String brand) {
		this.brand = brand;
	}

	void setModel(String model) {
		this.model = model;
	}

	void setBattery(int battery) {
		this.battery = battery;
	}

	void setProcessor(String processor) {
		this.processor = processor;
	}
	
	void display() {
		System.out.println();
		System.out.println("Brand : "+this.brand);
		System.out.println("Model : "+this.model);
		System.out.println("Battery : "+this.battery);
		System.out.println("Processor : "+this.processor);
	}
} //ElectronicDevice ends here

class Laptop extends ElectronicDevice{
	int noOfPort;
	String osType,graphicsCard;
	
	Laptop() {
		super();
		this.noOfPort = 3;
		this.osType = "Windows";
		this.graphicsCard = "NVIDIA GeForce";
	}
	
	Laptop(String brand, String model, int battery, String processor,int noOfPort, String osType, String graphicsCard) {
		super(brand,model,battery,processor);
		this.noOfPort = noOfPort;
		this.osType = osType;
		this.graphicsCard = graphicsCard;
	}
	int getNoOfPort() {
		return noOfPort;
	}
	String getOsType() {
		return osType;
	}
	String getGraphicsCard() {
		return graphicsCard;
	}
	void setNoOfPort(int noOfPort) {
		this.noOfPort = noOfPort;
	}
	void setOsType(String osType) {
		this.osType = osType;
	}
	void setGraphicsCard(String graphicsCard) {
		this.graphicsCard = graphicsCard;
	}
	
	void display() {
		super.display();
		System.out.println("No Of Ports : "+this.noOfPort);
		System.out.println("OS Type : "+this.osType);
		System.out.println("Graphics Card : "+this.graphicsCard);
	}
} //Laptop ends here

class Mobile extends ElectronicDevice{
	int simSlots,noOfCamera;

	Mobile() {
		super();
		this.simSlots = 2;
		this.noOfCamera = 3;
	}
	
	Mobile(String brand, String model, int battery, String processor,int simSlots, int noOfCamera) {
		super(brand,model,battery,processor);
		this.simSlots = simSlots;
		this.noOfCamera = noOfCamera;
	}

	int getSimSlots() {
		return simSlots;
	}

	int getNoOfCamera() {
		return noOfCamera;
	}

	void setSimSlots(int simSlots) {
		this.simSlots = simSlots;
	}

	void setNoOfCamera(int noOfCamera) {
		this.noOfCamera = noOfCamera;
	}
	
	void display() {
		super.display();
		System.out.println("Sim Slots : "+this.simSlots);
		System.out.println("No Of Camera : "+this.noOfCamera);
	}
} //Mobile ends here

class TestElectronicDevice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ElectronicDevice e1 = new ElectronicDevice();
        e1.display();
        ElectronicDevice e2 = new ElectronicDevice("Dell", "XPS 15", 6000, "Intel i7");
        e2.display();

        Laptop l1 = new Laptop();
        l1.display();
        Laptop l2 = new Laptop("Apple", "MacBook Pro", 5800, "M2", 4, "macOS", "Apple GPU");
        l2.display();

        Mobile m1 = new Mobile();
        m1.display();
        Mobile m2 = new Mobile("Samsung", "Galaxy S23", 5000, "Snapdragon 8", 2, 4);
        m2.display();
	} //main ends here

} //TestElectronicDevice ends here

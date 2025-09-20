class Vehicle{
	String brand,model;
	int speed;
	
	Vehicle() {
		this.brand = "Default";
		this.model = "Default";
		this.speed=50;
	}
	
	Vehicle(String brand, String model,int speed) {
		this.brand = brand;
		this.model = model;
		this.speed=speed;
	}
	
	String getBrand() {
		return brand;
	}

	String getModel() {
		return model;
	}

	int getSpeed() {
		return speed;
	}

	void setBrand(String brand) {
		this.brand = brand;
	}
	
	void setModel(String model) {
		this.model = model;
	}

	void setSpeed(int speed) {
		this.speed = speed;
	}
	
	//polymorphic behavior
	void startEngine() {
		System.out.println("Starting engine.");
	}
	void display() {
		System.out.println();
		System.out.println("Model : "+this.model);
		System.out.println("Brand : "+this.brand);
		System.out.println("Speed : "+this.speed);
	}
	
} //Vehicle ends here

class Bike extends Vehicle {
	int gearCount;

	Bike() {
		super();
		this.gearCount = 4;
	}
	
	Bike(String brand, String model,int speed,int gearCount) {
		super(brand,model,speed);
		this.gearCount = gearCount;
	}

	int getGearCount() {
		return gearCount;
	}

	void setGearCount(int gearCount) {
		this.gearCount = gearCount;
	}
	
	//polymorphic behavior
	void startEngine() {
		System.out.println("Starting engine with kick or cell start");
	}
	void display() {
		super.display();
		System.out.println("Gear Count : "+this.gearCount);
	}
} //Bike ends here

class Truck extends Vehicle {
	int loadCapacity,wheelCount;

	Truck() {
		super();
		this.loadCapacity = 1000;
		this.wheelCount = 10;
	}
	
	Truck(String brand, String model,int speed,int loadCapacity, int wheelCount) {
		super(brand,model,speed);
		this.loadCapacity = loadCapacity;
		this.wheelCount = wheelCount;
	}

	int getLoadCapacity() {
		return loadCapacity;
	}

	int getWheelCount() {
		return wheelCount;
	}

	void setLoadCapacity(int loadCapacity) {
		this.loadCapacity = loadCapacity;
	}

	void setWheelCount(int wheelCount) {
		this.wheelCount = wheelCount;
	}
	
	//polymorphic behavior
	void startEngine() {
		System.out.println("Starting engine with heavy duty engine");
	}
	void display() {
		super.display();
		System.out.println("Load Capacity : "+this.loadCapacity);
		System.out.println("Wheel Count : "+this.wheelCount);
	}
	
} //Truck ends here

class Car extends Vehicle {
	int bootSpace,airbagCount;

	Car() {
		super();
		this.bootSpace = 10;
		this.airbagCount = 2;
	}
	
	Car(String brand, String model,int speed,int bootSpace, int airbagCount) {
		super(brand,model,speed);
		this.bootSpace = bootSpace;
		this.airbagCount = airbagCount;
	}

	int getBootSpace() {
		return bootSpace;
	}

	int getAirbagCount() {
		return airbagCount;
	}

	void setBootSpace(int bootSpace) {
		this.bootSpace = bootSpace;
	}

	void setAirbagCount(int airbagCount) {
		this.airbagCount = airbagCount;
	}
	
	//polymorphic behavior
	void startEngine() {
		System.out.println("Starting engine with electronic ignition");
	}
	void display() {
		super.display();
		System.out.println("Boot Space : "+this.bootSpace);
		System.out.println("Airbag COunt : "+this.airbagCount);
	}
} //Car ends here
class TestVehicle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle v1;
		
		v1=new Vehicle("Toyota", "Corolla", 120);
		v1.display();
		v1.startEngine();
		
        v1=new Bike("Yamaha", "R15", 150, 6);
		v1.display();
		v1.startEngine();

        v1=new Truck("Volvo", "FH16", 90, 25000, 18);
        v1.display();
		v1.startEngine();

        v1=new Car("Tesla", "Model S", 200, 450, 6);
		v1.display();
		v1.startEngine();

	} //main ends here

} //TestVehicle ends here

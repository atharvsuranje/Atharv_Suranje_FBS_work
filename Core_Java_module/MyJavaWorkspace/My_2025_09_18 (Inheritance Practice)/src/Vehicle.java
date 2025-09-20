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
	
	void display() {
		super.display();
		System.out.println("Boot Space : "+this.bootSpace);
		System.out.println("Airbag COunt : "+this.airbagCount);
	}
} //Car ends here
class TestVehicle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle v1 = new Vehicle();
        v1.display();
        Vehicle v2 = new Vehicle("Toyota", "Corolla", 120);
        v2.display();

        Bike b1 = new Bike();
        b1.display();
        Bike b2 = new Bike("Yamaha", "R15", 150, 6);
        b2.display();

        Truck t1 = new Truck();
        t1.display();
        Truck t2 = new Truck("Volvo", "FH16", 90, 25000, 18);
        t2.display();

        Car c1 = new Car();
        c1.display();
        Car c2 = new Car("Tesla", "Model S", 200, 450, 6);
        c2.display();
	} //main ends here

} //TestVehicle ends here

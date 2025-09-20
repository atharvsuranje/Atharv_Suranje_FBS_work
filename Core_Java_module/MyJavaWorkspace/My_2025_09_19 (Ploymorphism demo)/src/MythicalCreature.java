class MythicalCreature{
	String name,type;
	double power;
	
	MythicalCreature() {
		this.name = "Default";
		this.type = "Normal";
		this.power = 40;
	}
	
	MythicalCreature(String name, String type, double power) {
		this.name = name;
		this.type = type;
		this.power = power;
	}

	String getName() {
		return name;
	}

	String getType() {
		return type;
	}

	double getPower() {
		return power;
	}

	void setName(String name) {
		this.name = name;
	}

	void setType(String type) {
		this.type = type;
	}

	void setPower(double power) {
		this.power = power;
	}
	
	//polymorphic behavior
	void attack() {
		System.out.println("Attacking...");
	}
	void display() {
		System.out.println();
		System.out.println("Name : "+this.name);
		System.out.println("Type : "+this.type);
		System.out.println("Power : "+this.power);
	}
} //MythicalCreature ends here

class Dragon extends MythicalCreature{
	String breathType;
	double flightSpeed;
	
	Dragon() {
		super();
		this.breathType = "Fire";
		this.flightSpeed = 50;
	}
	
	Dragon(String name, String type, double power,String breathType, double flightSpeed) {
		super(name,type,power);
		this.breathType = breathType;
		this.flightSpeed = flightSpeed;
	}

	String getBreathType() {
		return breathType;
	}

	double getFlightSpeed() {
		return flightSpeed;
	}

	void setBreathType(String breathType) {
		this.breathType = breathType;
	}

	void setFlightSpeed(double flightSpeed) {
		this.flightSpeed = flightSpeed;
	}
	
	//polymorphic behavior
	void attack() {
		System.out.println("Attacking using "+this.breathType+" breath");
	}
	void display() {
		super.display();
		System.out.println("Breath Type : "+this.breathType);
		System.out.println("Flight Speed : "+this.flightSpeed);
	}
} //Dragon ends here

class Phoenix extends MythicalCreature{
	int flameAura,rebirthCycle;

	Phoenix() {
		super();
		this.flameAura = 5;
		this.rebirthCycle = 3;
	}
	
	Phoenix(String name, String type, double power,int flameAura, int rebirthCycle) {
		super(name,type,power);
		this.flameAura = flameAura;
		this.rebirthCycle = rebirthCycle;
	}
	
	int getFlameAura() {
		return flameAura;
	}

	int getRebirthCylcle() {
		return rebirthCycle;
	}

	void setFlameAura(int flameAura) {
		this.flameAura = flameAura;
	}

	void setRebirthCylcle(int rebirthCycle) {
		this.rebirthCycle = rebirthCycle;
	}

	//polymorphic behavior
	void attack() {
		System.out.println("Attacking using Flame Aura");
	}
	void display() {
		super.display();
		System.out.println("Flame Aura : "+this.flameAura);
		System.out.println("Rebirth Cylcle : "+this.rebirthCycle);
	}
} //Phoenix ends here

class TestMythicalCreature {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        MythicalCreature mc1;
        
        mc1=new MythicalCreature("Unicorn", "Magical", 80);
        mc1.display();
        mc1.attack();
        
        mc1=new Dragon("FireDrake", "Dragon", 200, "Fire", 120);
        mc1.display();
        mc1.attack();
        
        mc1=new Phoenix("Blaze", "Phoenix", 150, 10, 5);
        mc1.display();
        mc1.attack();

	} //main ends here

} //TestMythicalCreature ends here

class AIRobot{
	int id;
	String model,powerSource;
	
	AIRobot() {
		this.id = 000;
		this.model = "Default";
		this.powerSource = "Electricity";
	}
	
	AIRobot(int id, String model, String powerSource) {
		this.id = id;
		this.model = model;
		this.powerSource = powerSource;
	}
	
	int getId() {
		return id;
	}
	String getModel() {
		return model;
	}
	String getPowerSource() {
		return powerSource;
	}
	void setId(int id) {
		this.id = id;
	}
	void setModel(String model) {
		this.model = model;
	}
	void setPowerSource(String powerSource) {
		this.powerSource = powerSource;
	}
	
	void display() {
		System.out.println();
		System.out.println("Id : "+this.id);
		System.out.println("Model is : "+this.model);
		System.out.println("Power Souce : "+this.powerSource);
	}
} //AIRobot ends here

class MedicalBot extends AIRobot{
	boolean surgeryMode;

	MedicalBot() {
		super();
		this.surgeryMode = false;
	}

	MedicalBot(int id, String model, String powerSource,boolean surgeryMode) {
		super(id, model, powerSource);
		this.surgeryMode = surgeryMode;
	}

	boolean isSurgeryMode() {
		return surgeryMode;
	}

	void setSurgeryMode(boolean surgeryMode) {
		this.surgeryMode = surgeryMode;
	}
	
	void display() {
		super.display();
		System.out.println("Surgery Mode : "+this.surgeryMode);
	}
} //MedicalBot ends here

class CombactBot extends AIRobot{
	String weaponType,armorType;

	CombactBot() {
		super();
		this.weaponType = "Taser";
		this.armorType = "Polycarbonate";
	}
	
	CombactBot(int id, String model, String powerSource,String weaponType, String armorType) {
		super(id, model, powerSource);
		this.weaponType = weaponType;
		this.armorType = armorType;
	}

	String getWeaponType() {
		return weaponType;
	}

	String getArmorType() {
		return armorType;
	}

	void setWeaponType(String weaponType) {
		this.weaponType = weaponType;
	}

	void setArmorType(String armorType) {
		this.armorType = armorType;
	}
	
	void display() {
		super.display();
		System.out.println("Weapon Type : "+this.weaponType);
		System.out.println("Armor Type Mode : "+this.armorType);
	}
} //CombactBot ends here
class TestAIRobot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AIRobot a1 = new AIRobot();
        a1.display();
        AIRobot a2 = new AIRobot(101, "Alpha-X", "Solar");
        a2.display();

        MedicalBot m1 = new MedicalBot();
        m1.display();
        MedicalBot m2 = new MedicalBot(202, "MediCare", "Battery", true);
        m2.display();

        CombactBot c1 = new CombactBot();
        c1.display();
        CombactBot c2 = new CombactBot(303, "Warrior-X", "Nuclear", "Laser", "Titanium");
        c2.display();
	} //main ends here

} //TestAIRobot ends here

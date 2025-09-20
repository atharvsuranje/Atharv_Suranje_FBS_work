class Chemical{
	String name,formula,state;
	double density;
	
	Chemical() {
		this.name = "Default";
		this.formula = "X";
		this.state = "solid";
		this.density = 1;
	}
	
	Chemical(String name, String formula, String state, double density) {
		this.name = name;
		this.formula = formula;
		this.state = state;
		this.density = density;
	}

	String getName() {
		return name;
	}

	String getFormula() {
		return formula;
	}

	String getState() {
		return state;
	}

	double getDensity() {
		return density;
	}

	void setName(String name) {
		this.name = name;
	}

	void setFormula(String formula) {
		this.formula = formula;
	}

	void setState(String state) {
		this.state = state;
	}

	void setDensity(double density) {
		this.density = density;
	}
	
	// Polymorphic behavior
	void react() {
		System.out.println("Start Reaction.");
	}
	void display() {
		System.out.println();
		System.out.println("Name : "+this.name);
		System.out.println("Formula : "+this.formula);
		System.out.println("State : "+this.state);
		System.out.println("Density : "+this.density);
	}
} //Chemical ends here

class Acid extends Chemical{
	double strength,corresiveness;

	Acid() {
		super();
		this.strength = 5;
		this.corresiveness = 5;
	}
	
	Acid(String name, String formula, String state, double density,double strength, double corresiveness) {
		super(name,formula,state,density);
		this.strength = strength;
		this.corresiveness = corresiveness;
	}

	double getStrength() {
		return strength;
	}

	double getCorresiveness() {
		return corresiveness;
	}

	void setStrength(double strength) {
		this.strength = strength;
	}

	void setCorresiveness(double corresiveness) {
		this.corresiveness = corresiveness;
	}
	
	// Polymorphic behavior
		void react() {
			System.out.println("React Vigorously and produce heat and H2 gas");
		}
	void display() {
		super.display();
		System.out.println("Strength : "+this.strength);
		System.out.println("corresiveness : "+this.corresiveness);
	}
} //Acid ends here

class Base extends Chemical{
	double alkalinity,neutarlizationPower;

	Base() {
		super();
		this.alkalinity = 5;
		this.neutarlizationPower = 5;
	}
	
	Base(String name, String formula, String state, double density,double alkalinity, double neutarlizationPower) {
		super(name,formula,state,density);
		this.alkalinity = alkalinity;
		this.neutarlizationPower = neutarlizationPower;
	}

	double getAlkalinity() {
		return alkalinity;
	}

	double getNeutarlizationPower() {
		return neutarlizationPower;
	}

	void setAlkalinity(double alkalinity) {
		this.alkalinity = alkalinity;
	}

	void setNeutarlizationPower(double neutarlizationPower) {
		this.neutarlizationPower = neutarlizationPower;
	}
	
	// Polymorphic behavior
		void react() {
			System.out.println("React mildly and produce salt and water.");
		}
	void display() {
		super.display();
		System.out.println("Aalkalinity : "+this.alkalinity);
		System.out.println("Neutarlization Power : "+this.neutarlizationPower);
	}
} //Base ends here

class Salt extends Chemical{
	double solubility,conductivity;

	Salt() {
		super();
		this.solubility = 5;
		this.conductivity = 5;
	}
	
	Salt(String name, String formula, String state, double density,double solubility, double conductivity) {
		super(name,formula,state,density);
		this.solubility = solubility;
		this.conductivity = conductivity;
	}

	double getSolubility() {
		return solubility;
	}

	double getConductivity() {
		return conductivity;
	}

	void setSolubility(double solubility) {
		this.solubility = solubility;
	}

	void setConductivity(double conductivity) {
		this.conductivity = conductivity;
	}
	
	// Polymorphic behavior
		void react() {
			System.out.println("Generally NO Reaction.");
		}
	void display() {
		super.display();
		System.out.println("Solubility : "+this.solubility);
		System.out.println("Conductivity : "+this.conductivity);
	}
} //Salt ends here
class TestChemical {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Chemical c1;
		c1=new Chemical("Water", "H2O", "Liquid", 1.0);
        c1.display();
        c1.react();
        
        c1= new Acid("Hydrochloric Acid", "HCl", "Liquid", 1.19, 10.0, 9.5);
        c1.display();
        c1.react();
        
        c1=new Base("Sodium Hydroxide", "NaOH", "Solid", 2.13, 9.0, 8.5);
        c1.display();
        c1.react();
        
        c1=new Salt("Sodium Chloride", "NaCl", "Solid", 2.16, 8.0, 7.5);
        c1.display();
        c1.react();
	} //main ends here

} //TestChemical ends here

class CelestialBody{
	String name,atmosphere;
	double mass,gravity;
	
	CelestialBody() {
		this.name = "Default";
		this.atmosphere = "Air";
		this.mass = 1;
		this.gravity = 10;
	}
	
	CelestialBody(String name, double mass, double gravity, String atmosphere) {
		this.name = name;
		this.mass = mass;
		this.gravity = gravity;
		this.atmosphere = atmosphere;
	}

	String getName() {
		return name;
	}

	String getAtmosphere() {
		return atmosphere;
	}

	double getMass() {
		return mass;
	}

	double getGravity() {
		return gravity;
	}

	void setName(String name) {
		this.name = name;
	}

	void setAtmosphere(String atmosphere) {
		this.atmosphere = atmosphere;
	}

	void setMass(double mass) {
		this.mass = mass;
	}

	void setGravity(double gravity) {
		this.gravity = gravity;
	}
	
	//polymorphic behavior
	void orbit() {
        System.out.println(this.name + " follow a general orbital path.");
    }
	
	void display() {
		System.out.println();
		System.out.println("Name : "+this.name);
		System.out.println("Mass : "+this.mass);
		System.out.println("Gravity : "+ this.gravity);
		System.out.println("Atmosphere : "+this.atmosphere);
	}
} //CelestialBody ends here

class Planet extends CelestialBody{
	String hostStar;
	boolean hasLife;
	
	Planet() {
		super();
		this.hostStar = "Sun";
		this.hasLife = false;
	}
	
	Planet(String name, double mass, double gravity, String atmosphere,String hostStar, boolean hasLife) {
		super(name,mass,gravity,atmosphere);
		this.hostStar = hostStar;
		this.hasLife = hasLife;
	}

	String getHostStar() {
		return hostStar;
	}

	boolean HasLife() {
		return hasLife;
	}

	void setHostStar(String hostStar) {
		this.hostStar = hostStar;
	}

	void setHasLife(boolean hasLife) {
		this.hasLife = hasLife;
	}
	
	//polymorphic behavior
	void orbit() {
        System.out.println(this.name + " orbits around its host star "+this.hostStar);
    }
	
	void display() {
		super.display();
		System.out.println("Host Star : "+this.hostStar);
		System.out.println("Has Life : "+this.hasLife);
	}
} //Planet ends here

class Star extends CelestialBody{
	int luminosity,stellarWindLevel;

	Star() {
		super();
		this.luminosity = 1;
		this.stellarWindLevel = 5;
	}
	
	Star(String name, double mass, double gravity, String atmosphere,int luminosity, int stellarWindLevel) {
		super(name,mass,gravity,atmosphere);
		this.luminosity = luminosity;
		this.stellarWindLevel = stellarWindLevel;
	}
	
	//polymorphic behavior
	void orbit() {
        System.out.println(this.name + " is a centre");
    }
	void display() {
		super.display();
		System.out.println("Luminosity : "+this.luminosity);
		System.out.println("Stellar Wind Level : "+this.stellarWindLevel);
	}
} //Star ends here

class Asteriod extends CelestialBody{
	String origin,orbiter;

	Asteriod() {
		super();
		this.origin = "Sun";
		this.orbiter = "Moon";
	}
	
	Asteriod(String name, double mass, double gravity, String atmosphere,String origin, String orbiter) {
		super(name,mass,gravity,atmosphere);
		this.origin = origin;
		this.orbiter = orbiter;
	}
	
	
	String getOrigin() {
		return origin;
	}

	String getOrbiter() {
		return orbiter;
	}

	void setOrigin(String origin) {
		this.origin = origin;
	}

	void setOrbiter(String orbiter) {
		this.orbiter = orbiter;
	}

	//polymorphic behavior
	void orbit() {
		System.out.println(this.name + " orbits around " + this.orbiter);
    }
	void display() {
		super.display();
		System.out.println("Origin : "+this.origin);
		System.out.println("Orbiter : "+this.orbiter);
	}
} //Asteriod ends here

class TestCelestialBody {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 CelestialBody cb1;
		 
		 cb1=new CelestialBody("GenericBody", 0.000003, 9.8, "Nitrogen-Oxygen"); // Earth ~3e-6 Solar Mass
		 cb1.display();
		 cb1.orbit();
		 
	     cb1=new Planet("Earth", 0.000003, 9.8, "Nitrogen-Oxygen", "Sun", true);
		 cb1.display();
		 cb1.orbit();

	     cb1=new Star("Sun", 1.0, 274.0, "Plasma", 100, 50); // Sun = 1 Solar Mass
		 cb1.display();
		 cb1.orbit();

	     cb1=new Asteriod("Ceres", 4.7e-10, 0.27, "None", "Asteroid Belt", "Sun"); // Ceres ~4.7e-10 Solar Mass
		 cb1.display();
		 cb1.orbit();
	} //main ends here

} //TestCelestialBody ends here

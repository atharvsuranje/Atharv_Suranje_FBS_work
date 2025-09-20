class AnimeCharacter{
	String name,powerLevel,origin;

	AnimeCharacter() {
		this.name = "Default";
		this.powerLevel = "normal";
		this.origin = "earth";
	}
	
	AnimeCharacter(String name, String powerLevel, String origin) {
		this.name = name;
		this.powerLevel = powerLevel;
		this.origin = origin;
	}

	String getName() {
		return name;
	}

	String getPowerLevel() {
		return powerLevel;
	}

	String getOrigin() {
		return origin;
	}

	void setName(String name) {
		this.name = name;
	}

	void setPowerLevel(String powerLevel) {
		this.powerLevel = powerLevel;
	}

	void setOrigin(String origin) {
		this.origin = origin;
	}
	
	// Polymorphic behavior
	void transform() {
		System.out.println("Transformed into a new Form");
	}
	
	void display() {
		System.out.println();
		System.out.println("Name : "+this.name);
		System.out.println("Power Level : "+this.powerLevel);
		System.out.println("Origin : "+this.origin);
	}
} //AnimeCharacter ends here

class Sayian extends AnimeCharacter{
	int superSaiyanLevel;
	double kiAmount;
	
	Sayian() {
		super();
		this.superSaiyanLevel = 1;
		this.kiAmount = 100;
	}
	
	Sayian(String name,String powerLevel,String origin, int superSaiyanLevel, double kiAmount) {
		super(name,powerLevel,origin);
		this.superSaiyanLevel = superSaiyanLevel;
		this.kiAmount = kiAmount;
	}
	
	int getSuperSaiyanLevel() {
		return superSaiyanLevel;
	}
	
	double getKiAmount() {
		return kiAmount;
	}
	
	void setSuperSaiyanLevel(int superSaiyanLevel) {
		this.superSaiyanLevel = superSaiyanLevel;
	}
	
	void setKiAmount(double kiAmount) {
		this.kiAmount = kiAmount;
	}
	
	// Polymorphic behavior
	void transform() {
		System.out.println("Transformed into Super Sayian");
	}
	
	void display() {
		super.display();
		System.out.println("Super Saiyan Level : "+this.superSaiyanLevel);
		System.out.println("Ki Amount : "+this.kiAmount);
	} 
} //Sayian ends here

class Shinigami extends AnimeCharacter{
	String zanpaktoName;
	double spritualLevel;
	
	
	Shinigami() {
		this.zanpaktoName = "None";
		this.spritualLevel = 100;
	}
	
	Shinigami(String name,String powerLevel,String origin,String zanpaktoName, double spritualLevel) {
		super(name,powerLevel,origin);
		this.zanpaktoName = zanpaktoName;
		this.spritualLevel = spritualLevel;
	}

	String getZanpaktoName() {
		return zanpaktoName;
	}

	double getSpritualLevel() {
		return spritualLevel;
	}

	void setZanpaktoName(String zanpaktoName) {
		this.zanpaktoName = zanpaktoName;
	}

	void setSpritualLevel(double spritualLevel) {
		this.spritualLevel = spritualLevel;
	}
	
	// Polymorphic behavior
	void transform() {
		System.out.println("Used Bankai");
	}
	
	void display() {
		super.display();
		System.out.println("Zanpakto Name : "+this.zanpaktoName);
		System.out.println("Spritual Level : "+this.spritualLevel);
	}
	
} //Shinigami ends here

class Ninja extends AnimeCharacter{
	String jutsuType;
	double chakra;
	
	Ninja() {
		super();
		this.jutsuType = "Normal";
		this.chakra = 100;
	}
	
	Ninja(String name,String powerLevel,String origin,String jutsuType, double chakra) {
		super(name,powerLevel,origin);
		this.jutsuType = jutsuType;
		this.chakra = chakra;
	}
	
	String getJutsuType() {
		return jutsuType;
	}
	double getChakra() {
		return chakra;
	}
	void setJutsuType(String jutsuType) {
		this.jutsuType = jutsuType;
	}
	void setChakra(double chakra) {
		this.chakra = chakra;
	}
	
	// Polymorphic behavior
	void transform() {
		System.out.println("Started using Advanced Jutsus");
	}
	
	void display() {
		super.display();
		System.out.println("Jutsu Type : "+this.jutsuType);
		System.out.println("Chakra : "+this.chakra);
	}
} //Ninja ends here

class TestAnimeCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnimeCharacter a1 = new AnimeCharacter();
		a1.display();
		a1.transform();

		a1= new Sayian("Vegeta", "Ultra", "Planet Vegeta", 2, 5000.5);
		a1.display();
		a1.transform();
		
		a1=new Shinigami("Ichigo", "Captain", "Soul Society", "Zangetsu", 9000.9);
		a1.display();
		a1.transform();
		
		a1=new Ninja("Naruto", "Hokage", "Konoha", "Rasengan", 8000.8);
		a1.display();
		a1.transform();
	} //main ends here

} //TestAnimeCharacter ends here


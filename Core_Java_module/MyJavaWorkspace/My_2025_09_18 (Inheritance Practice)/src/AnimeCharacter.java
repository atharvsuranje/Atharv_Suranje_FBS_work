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
        AnimeCharacter a2 = new AnimeCharacter("Goku", "High", "Earth");
        a2.display();

        Sayian s1 = new Sayian();
        s1.display();
        Sayian s2 = new Sayian("Vegeta", "Ultra", "Vegeta Planet", 2, 5000.5);
        s2.display();

        Shinigami sh1 = new Shinigami();
        sh1.display();
        Shinigami sh2 = new Shinigami("Ichigo", "Captain", "Soul Society", "Zangetsu", 9000.9);
        sh2.display();

        Ninja n1 = new Ninja();
        n1.display();
        Ninja n2 = new Ninja("Naruto", "Hokage", "Konoha", "Rasengan", 8000.8);
        n2.display();
	} //main ends here

} //TestAnimeCharacter ends here

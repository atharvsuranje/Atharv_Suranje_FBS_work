class GamingCharacter{
	String name;
	int level,health,damage;
	
	GamingCharacter() {
		this.name = "Default";
		this.level = 1;
		this.health = 10;
		this.damage = 10;
	}
	
	GamingCharacter(String name, int level, int health, int damage) {
		this.name = name;
		this.level = level;
		this.health = health;
		this.damage = damage;
	}

	String getName() {
		return name;
	}

	int getLevel() {
		return level;
	}

	int getHealth() {
		return health;
	}

	int getDamage() {
		return damage;
	}

	void setName(String name) {
		this.name = name;
	}

	void setLevel(int level) {
		this.level = level;
	}

	void setHealth(int health) {
		this.health = health;
	}

	void setDamage(int damage) {
		this.damage = damage;
	}
	
	void display() {
		System.out.println();
		System.out.println("Name is : "+this.name);
		System.out.println("Level is : "+this.level);
		System.out.println("Health is : "+this.health);
		System.out.println("Damage is : "+this.damage);
	}
} //GamingCharacter ends here

class Warrior extends GamingCharacter{
	String weapon;

	Warrior() {
		super();
		this.weapon = "Sword";
	}
	
	Warrior(String name,int level,int health,int damage,String weapon) {
		super(name,level,health,damage);
		this.weapon = weapon;
	}

	String getWeaponType() {
		return weapon;
	}

	void setWeaponType(String weapon) {
		this.weapon = weapon;
	}
	
	void display() {
		super.display();
		System.out.println("Weapon Type : "+this.weapon);
	}
} //Warrior ends here

class Mage extends GamingCharacter{
	int mana;

	Mage() {
		super();
		this.mana = 10;
	}
	
	Mage(String name,int level,int health,int damage,int mana) {
		super(name,level,health,damage);
		this.mana = mana;
	}

	int getMana() {
		return mana;
	}

	void setMana(int mana) {
		this.mana = mana;
	}
	
	void display() {
		super.display();
		System.out.println("Mana is : "+this.mana);
	}
} //Mage ends here

class Archer extends GamingCharacter{
	int longVision;
	Archer() {
		super();
		this.longVision = 10;
	}
	
	Archer(String name,int level,int health,int damage,int longVision) {
		super(name,level,health,damage);
		this.longVision = longVision;
	}

	int getLongVision () {
		return longVision;
	}

	void setLongVision (int longVision) {
		this.longVision = longVision;
	}
	
	void display() {
		super.display();
		System.out.println("Long Vision is : "+this.longVision);
	}
} //Archer ends here

class TestGamingCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GamingCharacter g1 = new GamingCharacter();
        g1.display();
        GamingCharacter g2 = new GamingCharacter("Hero", 5, 100, 20);
        g2.display();

        Warrior w1 = new Warrior();
        w1.display();
        Warrior w2 = new Warrior("Thor", 10, 150, 30, "Hammer");
        w2.display();

        Mage m1 = new Mage();
        m1.display();
        Mage m2 = new Mage("Merlin", 8, 80, 15, 50);
        m2.display();

        Archer a1 = new Archer();
        a1.display();
        Archer a2 = new Archer("Legolas", 12, 90, 25, 40);
        a2.display();
	} //main ends here

} //TestGamingCharacter ends here

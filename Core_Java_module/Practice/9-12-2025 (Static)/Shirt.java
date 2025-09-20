class Shirt {
	int sid;
	String brand,type,size;
	double basePrice;
	static double small,medium,large,xl;
	
	static{
		small=1.0;
		updateSizes();
	}

	static void updateSizes(){
		medium=small+0.1;
		large=small+0.2;
		xl=small+0.3;
	}

	Shirt(){
		this.sid=100;
		this.brand="Default Brand";
		this.type="Default Type";
		this.basePrice=100;
		this.size="medium";
	}

	Shirt(int i,String b,String t,double p,String s){
		this.sid=i;
		this.brand=b;
		this.type=t;
		this.basePrice=p;
		this.size=s;
	}

	void setSid(int i){
		this.sid=i;
	}

	void setBrand(String b) {
        this.brand=b;
    }

	void setType(String t) {
		this.type=t;
    }

	void setBasePrice(double p) {
        this.basePrice=p;
    }
	
    void setSize(String s) {
		this.size=s;
    }
	
	static void setSmall(double p) {
		small=p;
		updateSizes();
	}

	int getSid() {
    	return sid;
    }

    String getBrand() {
    	return brand;
    }

    String getType() {
    	return type;
    }

    double getBasePrice() {
    	return basePrice;
    }

    String getSize() {
    	return size;
    }

	double finalPrice(){
		if(this.size.equals("small")){
			return this.basePrice*small;
		}
		else if(this.size.equals("medium")){
			return this.basePrice*medium;
		}
		else if(this.size.equals("large")){
			return this.basePrice*large;
		}
		else if(this.size.equals("xl")){
			return this.basePrice*xl;
		}
		else{
			System.out.println("Invalid Size");
			return 0;
		}
	}

	static void displayMultipliers(){
		System.out.println("Current Multipliers");
		System.out.println("Small : "+small+" Medium : "+medium+" Large : "+large+" X-Large : "+xl);
	}

	void display() {
        	System.out.println("Shirt ID: "+this.sid);
        	System.out.println("Brand: "+this.brand);
	        System.out.println("Type: "+this.type);
        	System.out.println("Size: "+this.size);
        	System.out.printf("Final Price: %.2f%n",this.finalPrice());
	}	
} //class Shirt ends here

class TestShirt{
	public static void main(String[] args) {
	    Shirt s1=new Shirt(1,"Nike","Casual",1000,"small");
	    Shirt s2=new Shirt(2,"Adidas","Formal",1000,"medium");
	    Shirt s3=new Shirt(3,"Puma","Sports",1000,"large");
        Shirt s4=new Shirt(4,"Levis","Casual",1000,"xl");
		Shirt.displayMultipliers();
		s1.display();
        s2.display();
	    s3.display();
	    s4.display();
		Shirt.setSmall(2);
		Shirt.displayMultipliers();
		s1.display();
        s2.display();
	    s3.display();
		s4.display();
	} //main ends here
} //class TestShirt ends here
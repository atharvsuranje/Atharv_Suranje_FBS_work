class Car{
	String model,brand;
	int year;
	double price;

	void setYear(int y){
		this.year=y;
	}
	
	void setModel(String m){
		this.model=m;
	}

	void setBrand(String b){
		this.brand=b;
	}

	void setPrice(double p){
		this.price=p;
	}

	int getYear(){
		return this.year;
	}

	String getModel(){
		return this.model;
	}

	String getBrand(){
		return this.brand;
	}

	double getPrice(){
		return this.price;
	}

	void display(){
		System.out.println("Brand : "+this.brand);
		System.out.println("Model : "+this.model);
		System.out.println("Year : "+this.year);
		System.out.println("Price : "+this.price);
	}
} //Car ends here

class TestCar{
	public static void main(String[] a){
		Car c1=new Car();
		c1.setBrand("Mahindra");
		c1.setModel("BE 9e");
		c1.setYear(2025);
		c1.setPrice(50000.99);
		c1.display();
	} //main ends here
} //TestCar ends here

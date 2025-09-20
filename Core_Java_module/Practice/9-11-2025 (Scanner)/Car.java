import java.util.Scanner;

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

	Car(){
		this.brand="Mahindra";
		this.model="BE 9e";
		this.year=2025;
		this.price=50000.99;
		System.out.println("Inside Default Constructor");
	}

	Car(String b,String m,int y,double p){
		this.brand=b;
		this.model=m;
		this.year=y;
		this.price=p;
		System.out.println("Inside Parameterized Constructor");
	}
} //Car ends here

class TestCar{
	public static void main(String[] a){
		Car c1=new Car();
		c1.display();
		Car c2=new Car("Tesla","Cybertruck",2024,99999.98);
		c2.display();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Brand : ");
        String brand=sc.nextLine();
        System.out.println("Enter Model : ");
        String model=sc.nextLine();
        System.out.println("Enter Year : ");
        int year=sc.nextInt();
        System.out.println("Enter Price : ");
        double price=sc.nextDouble();
        Car c3 = new Car(brand,model,year,price);
        c3.display();
	} //main ends here
} //TestCar ends here

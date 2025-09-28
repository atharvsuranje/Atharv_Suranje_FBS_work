package myInterfaces;

interface Product{
	void sell();
	void buy();
}

interface Traveller{
	void travel();
}

public class Animal implements Product{
	public void buy() {
		System.out.println("Buy");
	}
	
	public void sell() {
		System.out.println("Sell");
	}
}

class Vehicle implements Product,Traveller{
	public void buy() {
		System.out.println("Buy");
	}
	
	public void sell() {
		System.out.println("Sell");
	}
	
	public void travel() {
		System.out.println("Travel");
	}
	
}
class Horse extends Animal implements Traveller{
	public void travel() {
		System.out.println("Travel");
	}
}

class Bike extends Vehicle{
	void go() {
		System.out.println("Bike");
	}
}

class Test{
	public static void main(String[] args) {
		Animal a1;
		a1=new Horse();
		a1.buy();
		a1.sell();
//		a1.travel();
		
		Horse h1=new Horse();
		h1.travel();
		
		Vehicle v1;
		v1=new Bike();
		v1.travel();
	}
}
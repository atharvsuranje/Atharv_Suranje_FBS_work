class Product{
	int id,quantity;
	String name;
	double price;
	
	void setId(int i){
		this.id=i;
	}

	void setQuantity(int q){
		this.quantity=q;
	}

	void setName(String n){
		this.name=n;
	}

	void setPrice(double p){
		this.price=p;
	}

	int getId(){
		return this.id;
	}

	int getQuantity(){
		return this.quantity;
	}

	String getName(){
		return this.name;
	}

	double getPrice(){
		return this.price;
	}

	void display(){
		System.out.println("Id : "+this.id);
		System.out.println("Quantity : "+this.quantity);
		System.out.println("Name : "+this.name);
		System.out.println("price : "+this.price);
	}
} //class Product ends here

class TestProduct{
	public static void main(String[] a){
		Product p1=new Product();
		p1.setId(101);
		p1.setName("Laptop");
		p1.setQuantity(10);
		p1.setPrice(50000.1234);
		p1.display();
	}		
}

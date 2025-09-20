class Product{
	int pid,quantity;
	String name;
	double costPrice;
	static double discount;

	static{
		discount=10;
	}
	Product(){
		this.pid=100;
		this.name="Default";
		this.costPrice=100;
		this.quantity=1;
	}

	Product(int i,String n,double c,int q){
		this.pid=i;
		this.name=n;
		this.costPrice=c;
		this.quantity=q;
	}

	void setPid(int i){
		this.pid=i;
	}

	void setName(String s){
		this.name=s;
	}
		
	void setCostPrice(double c){
		this.costPrice=c;
	}

	void setQuantity(int q){
		this.quantity=q;
	}

	static void setDiscount(double d){
		discount=d;
	}

	int getPid(){
		return this.pid;
	}

	String getName(){
		return this.name;
	}

	double getCostPrice(){
		return this.costPrice;
	}

	int getQuantity(){
		return this.quantity;
	}

	static double getDiscount(){
		return discount;
	}

	void applyDiscount(){
		this.costPrice=this.costPrice - (this.costPrice*discount/100);
	}

	double getSellingPrice(){
		return this.costPrice*this.quantity;
	}

	void display() {
        	System.out.println("Product ID: "+this.pid);
        	System.out.println("Product Name: "+this.name);
        	System.out.println("Cost Price (after discount): "+this.costPrice);
        	System.out.println("Quantity: "+this.quantity);
        	System.out.println("Total Selling Price: "+this.getSellingPrice());
    }
} //class Product ends here

class TestProduct{
	public static void main(String[] args) {
		Product p1=new Product(101,"Laptop",50000,5);
		p1.applyDiscount();
		p1.display();
	} //main ends here
} //class TestProduct ends here


























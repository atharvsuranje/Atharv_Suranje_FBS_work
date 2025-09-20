import java.util.Scanner;

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

	Product(){
		this.id=101;
		this.quantity=5;
		this.name="Laptop";
		this.price=59999.12;
		System.out.println("Inside Default Constructor");
	}

	Product(int i,int q,String n,double p){
		this.id=i;
		this.quantity=q;
		this.name=n;
		this.price=p;
		System.out.println("Inside Parameterized Constructor");
	}
} //class Product ends here

class TestProduct{
	public static void main(String[] a){
		Product p1=new Product();
		p1.display();
		Product p2=new Product(111,10,"Mouse",1200.98);
		p2.display();
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter ID : ");
        int id=sc.nextInt();
        System.out.println("Enter Quantity : ");
        int quantity=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Name : ");
        String name=sc.nextLine();
        System.out.println("Enter Price : ");
        double price=sc.nextDouble();
		Product p3=new Product(id,quantity,name,price);
        p3.display();
	} //main ends here	
} //class TestProduct ends here

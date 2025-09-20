class Book{
	int isbn;
	String title,author,publisher;
	double price;
	
	void setIsbn(int i){
		this.isbn=i;
	}
	
	void setTitle(String t){
		this.title=t;
	}

	void setAuthor(String t){
		this.author=t;
	}

	void setPublisher(String t){
		this.publisher=t;
	}

	void setPrice(double p){
		this.price=p;
	}

	int getIsbn(){
		return this.isbn;
	}

	String getTitle(){
		return this.title;
	}

	String getAuthor(){
		return this.author;
	}

	String getPublisher(){
		return this.publisher;
	}

	double getPrice(){
		return this.price;
	}	

	void display(){
		System.out.println("ISBN : "+this.isbn);
		System.out.println("Title : "+this.title);
		System.out.println("Author : "+this.author);
		System.out.println("Publisher : "+this.publisher);
		System.out.println("Price : "+this.price);
	}
	
	Book(){
		this.isbn=12345;
		this.title="TWSA";
		this.author="tsa@123";
		this.publisher="Unknown";
		this.price=999.99;
		System.out.println("Inside Default Constructor");
	}

	Book(int i,String t,String a,String p,double pr){
		this.isbn=i;
		this.title=t;
		this.author=a;
		this.publisher=p;
		this.price=pr;
		System.out.println("Inside Parameterized Constructor");
	}
} //Book ends here

class TestBook{
	public static void main(String[] a){
		Book b1=new Book();
		b1.display();
		Book b2=new Book(9876,"Naruto","Kishimoto","Shonen",12345.99);
		b2.display();
	} //main ends here
} //TestBook ends here
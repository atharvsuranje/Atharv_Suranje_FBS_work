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
} //Book ends here

class TestBook{
	public static void main(String[] a){
		Book b1=new Book();
		b1.setIsbn(106);
		b1.setTitle("TWSA");
		b1.setAuthor("tsa@123");
		b1.setPublisher("Unknown");
		b1.setPrice(999.99);
		b1.display();
	} //main ends here
} //TestBook ends here
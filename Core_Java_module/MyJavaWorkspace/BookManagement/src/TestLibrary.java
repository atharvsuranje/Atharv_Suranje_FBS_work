import java.util.Scanner;

class Books{
	int id;
    String bookName,authorName,category;
    double price,rating;
    
    // Default constructor
    Books() {
        this.id = 0;
        this.bookName = "";
        this.authorName = "";
        this.category = "";
        this.price = 0.0;
        this.rating = 0.0;
    }

    // Parameterized constructor
    Books(int id, String bookName, String authorName, String category, double price, double rating) {
        this.id = id;
        this.bookName = bookName;
        this.authorName = authorName;
        this.category = category;
        this.price = price;
        this.rating = rating;
    }

    //Getters
	int getId() {
		return id;
	}

	String getBookName() {
		return bookName;
	}

	String getAuthorName() {
		return authorName;
	}

	String getCategory() {
		return category;
	}

	double getPrice() {
		return price;
	}

	double getRating() {
		return rating;
	}

	//Setters
	void setId(int id) {
		this.id = id;
	}

	void setBookName(String bookName) {
		this.bookName = bookName;
	}

	void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	void setCategory(String category) {
		this.category = category;
	}

	void setPrice(double price) {
		this.price = price;
	}

	void setRating(double rating) {
		this.rating = rating;
	}
}
// The Library class manages all book-related operations.
class Library{
	static int MAX_BOOKS=100;
	Books[] bookArray;
	int bookCount;
	Scanner sc;

	// Constructor
	Library(){
		bookArray=new Books[MAX_BOOKS];
		bookCount=0;
		sc=new Scanner(System.in);
		loadPresetBooks();
	}

	// Getters
	Books[] getBookArray() {
        return bookArray;
    }
    
    int getBookCount() {
        return bookCount;
    }

	// Preset Books
    void loadPresetBooks() {
        addPresetBook(101, "ORV", "Sing Shong", "Fantasy", 499.0, 4.9);
        addPresetBook(102, "Naruto", "Masashi Kishimoto", "Action", 399.0, 4.8);
        addPresetBook(103, "Dragon Ball", "Akira Toriyama", "Adventure", 450.0, 4.7);
        addPresetBook(104, "One Piece", "Eiichiro Oda", "Adventure", 550.0, 4.95);
        addPresetBook(105, "Bleach", "Tite Kubo", "Supernatural", 420.0, 4.6);
    }

	void addPresetBook(int id, String name, String author, String category, double price, double rating) {
        if (bookCount < MAX_BOOKS) {
            bookArray[bookCount] = new Books(id, name, author, category, price, rating);
            bookCount++;
        }
    }

	// function to display books
	void displayBooks(Books[] books,int count){
		if(count==0){
			System.out.println("No Books To Display");
			return;
		}

		System.out.printf("\n%-5s %-25s %-25s %-20s %-10s %-6s\n","ID", "Book Name", "Author", "Category", "Price", "Rating");
		System.out.println("---------------------------------------------------------------------------------------------------");
        
		for(int i=0;i<count;i++){
			System.out.printf("%-5d %-25s %-25s %-20s %-10.2f %-6.1f\n",
								books[i].getId(),
								books[i].getBookName(),
								books[i].getAuthorName(),
								books[i].getCategory(),
								books[i].getPrice(),
								books[i].getRating()
							);
		}
	}

	// function to check unique id
	boolean isBookIdUnique(int id){
		for(int i=0;i<bookCount;i++){
			if(bookArray[i].getId()==id){
				return false;
			}
		}
		return true;
	}
	// function to add books
	void addBook(){
		if(bookCount>=MAX_BOOKS){
			System.out.println("Library Full, Cannot Add Books");
			return;
		}

		System.out.println("Enter Book DEtails : ");
		int id;
		do{
			System.out.println("Enter Unique Book Id : ");
			id=sc.nextInt();
			if(!isBookIdUnique(id)){
				System.out.println("Book ID already exists! Please enter a different ID.");
			}
		}
		while(!isBookIdUnique(id));
		sc.nextLine();

		System.out.println("Enter Book Name : ");
		String bookName =sc.nextLine();
		System.out.println("Enter Author Name : ");
		String authorName =sc.nextLine();
		System.out.println("Enter Cateegory : ");
		String category =sc.nextLine();
		double price;
		do{
			System.out.println("Enter Price : ");
			price=sc.nextDouble();
			if(price<=0){
				System.out.println("Please Enter a Valid Price");
			}
		}
		while(price<=0);
		double rating;
		do{
			System.out.println("Enter Rating : ");
			rating=sc.nextDouble();
			if(rating<=0 || rating>5){
				System.out.println("Please Enter a Valid Rating");
			}
		}
		while(rating<=0);
		bookArray[bookCount]=new Books(id, bookName, authorName, category, rating, price);
		bookCount++;
		System.out.println("\nBook Added Successfully");
	}

	// Remove book by ID
	void removeBook(){
		System.out.println("Enter ID of the Book to be removed");
		int id=sc.nextInt();
		boolean found=false;
		for(int i=0;i<bookCount;i++){
			if(bookArray[i].getId()==id){
				found=true;
				for(int j=i;j<bookCount-1;j++){
					bookArray[j]=bookArray[j+1];
				}
				bookCount--;
				System.out.println("Book Removed Successfully.");
				break;
			}
		}
		if(!found) System.out.println("Book with ID : "+id+" Not Found");
	}

	// function to search books by id,bookName,authorName,category
	void searchBooks(){
		System.out.println("\nSearch Options : ");
		System.out.println("1. Search by ID");
        System.out.println("2. Search by Book Name");
        System.out.println("3. Search by Author Name");
        System.out.println("4. Search by Category");
        System.out.print("Enter your choice: ");
        int searchChoice = sc.nextInt();

		switch(searchChoice){
			case 1:
				System.out.println("Enter ID of Book : ");
				int id=sc.nextInt();
				for(int i=0;i<bookCount;i++){
					if(bookArray[i].getId()==id){
						Books[] singleBook={bookArray[i]};
						displayBooks(singleBook, 1);
						return;
					}
				}
				System.out.println("Book with ID : "+id+" Not Found");
				break;

			case 2:
				sc.nextLine();
				System.out.println("Enter Name of Book : ");
				String name=sc.nextLine().toLowerCase();

				Books[] nameResults=new Books[MAX_BOOKS];
				int nameResultCount=0;

				for(int i=0;i<bookCount;i++){
					if(bookArray[i].getBookName().toLowerCase().contains(name)){
						nameResults[nameResultCount]=bookArray[i];
						nameResultCount++;
					}
				}
				if(nameResultCount==0) System.out.println("Book Not Found");
				else displayBooks(nameResults, nameResultCount);
				break;
				
			case 3:
				sc.nextLine();
				System.out.println("Enter Name of Author : ");
				String author=sc.nextLine().toLowerCase();

				Books[] authorResults=new Books[MAX_BOOKS];
				int authorResultCount=0;

				for(int i=0;i<bookCount;i++){
					if(bookArray[i].getAuthorName().toLowerCase().contains(author)){
						authorResults[authorResultCount]=bookArray[i];
						authorResultCount++;
					}
				}
				if(authorResultCount==0) System.out.println("Author Not Found");
				else displayBooks(authorResults, authorResultCount);
				break;
					
			case 4:
				sc.nextLine();
				System.out.println("Enter Category : ");
				String category=sc.nextLine().toLowerCase();

				Books[] categoryResults=new Books[MAX_BOOKS];
				int categoryResultCount=0;

				for(int i=0;i<bookCount;i++){
					if(bookArray[i].getCategory().toLowerCase().contains(category)){
						categoryResults[categoryResultCount]=bookArray[i];
						categoryResultCount++;
					}
				}
				if(categoryResultCount==0) System.out.println("Category Not Found");
				else displayBooks(categoryResults, categoryResultCount);
				break;

			default:
				System.out.println("Invalid search option.");
            	break;
		}
	}

	// function to Update book (price and rating)
	void updateBook(){
		System.out.println("Enter ID of Book : ");
		int id=sc.nextInt();

		for(int i=0;i<bookCount;i++){
			if(bookArray[i].getId()==id){
				double price;
				do{
					System.out.println("Enter Updated Price : ");
					price=sc.nextDouble();
					if(price<=0) System.out.println("Please enter a valid price.");
				}
				while (price<=0);

				double rating;
				do{
					System.out.println("Enter Updated Rating : ");
					rating=sc.nextDouble();
					if(rating<=0 || rating>5) System.out.println("Please enter a valid rating.");
				}
				while (rating<=0);

				bookArray[i].setPrice(price);
				bookArray[i].setRating(rating);
				System.out.println("Details Updated");
				return;
			}
		}
		System.out.println("Book with ID : "+id+" Not Found");
	}
	
	// fuction to give sorting options
	Books[] getSortedBooks() {
		if(bookCount==0){
			System.out.println("No Books to Sort.");
			return null;
		}
		
		System.out.println("Sort By Options :");
		System.out.println("1. By Price.");
		System.out.println("2. By Rating.");
		System.out.println("Enter your choice : ");
		int sortBy=sc.nextInt();
		System.out.println("Order By Options :");
		System.out.println("1. By Increasing.");
		System.out.println("2. By Decreasing.");
		System.out.println("Enter your choice : ");
		int order=sc.nextInt();

		if(sortBy!=1 && sortBy!=2){
			System.out.println("Invalid choice. Using by Price as default");
			sortBy=1;
		}
		
		if(order!=1 && order!=2){
			System.out.println("Invalid choice. Using by Increasing as default");
			order=1;
		}

		Books[] sortedBooks=new Books[bookCount];
		sortBooks(sortedBooks,bookCount,sortBy,order);
		return sortedBooks;
	}

	// Actual function for sorting
	void sortBooks(Books[] sortedBooks,int count,int sortBy,int order){
		for(int i=0;i<count;i++){
			sortedBooks[i]=bookArray[i];
		}

		for(int i=0;i<count-1;i++){
			for(int j=0;j<count-i-1;j++){
				boolean condition;
				if(sortBy==1){
					condition=(order==1) ?
					(sortedBooks[j].getPrice() > sortedBooks[j+1].getPrice()) :
					(sortedBooks[j].getPrice() < sortedBooks[j+1].getPrice());
				}
				else{
					condition=(order==1) ?
					(sortedBooks[j].getRating() > sortedBooks[j+1].getRating()) :
					(sortedBooks[j].getRating() < sortedBooks[j+1].getRating());

				}
				if(condition){
					Books temp=sortedBooks[j];
					sortedBooks[j]=sortedBooks[j+1];
					sortedBooks[j+1]=temp;
				}
			}
		}
	}
}

class TestLibrary{
	public static void main(String[] args) {
		Library l1=new Library();
		Scanner sc=new Scanner(System.in);
		int choice;

		// MENU
		while(true){
			System.out.println("\n\n====== Book Management System ======");
            System.out.println("1. Display All Books");
            System.out.println("2. Add Book");
            System.out.println("3. Remove Book by ID");
            System.out.println("4. Search Books");
            System.out.println("5. Update Book (Price and Rating)");
            System.out.println("6. Display All Books (Sorted)");
            System.out.println("7. Display Top 3 Books");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

			switch (choice){
				case 0:
					System.out.println("Exxiting.....");
					sc.close();
					System.exit(0);
					break;

				case 1:
					l1.displayBooks(l1.getBookArray(),l1.getBookCount());
					break;

				case 2:
					l1.addBook();
					break;

				case 3:
					l1.removeBook();
					break;

				case 4:
					l1.searchBooks();
					break;

				case 5:
					l1.updateBook();
					break;

				case 6:
					Books[] sortedBooks=l1.getSortedBooks();
					if(sortedBooks!=null){
						l1.displayBooks(sortedBooks,l1.getBookCount());
					}
					break;

				case 7:
					Books[] topBooks=l1.getSortedBooks();
					if(topBooks!=null){
						l1.displayBooks(topBooks,Math.min(3,l1.getBookCount()));
					}
					break;
				
			}
		}
	}
}
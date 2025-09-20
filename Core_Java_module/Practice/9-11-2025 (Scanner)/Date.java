import java.util.Scanner;

class Date{
	int day,month,year;
	String dow;

	void setDay(int d){
		this.day=d;
	}

	void setMonth(int m){
		this.month=m;
	}


	void setYear(int y){
		this.year=y;
	}

	void setDow(String d){
		this.dow=d;
	}

	int getDay(){
		return this.day;
	}

	int getMonth(){
		return this.month;
	}

	int getYear(){
		return this.year;
	}

	String getDow(){
		return this.dow;
	}
	
	void display(){
		System.out.println(this.day+"/"+this.month+"/"+this.year+"  "+this.dow);
	}

	Date(){
		this.day=7;
		this.month=9;
		this.year=2023;
		this.dow="Sat";
		System.out.println("Default Constructor called");
	}

	Date(int d, int m, int y, String s){
		this.day=d;
		this.month=m;
		this.year=y;
		this.dow=s;
		System.out.println("Parameterized Constructor called");
	}

} //Class Date ends here

class TestDate{
	public static void main(String[] a){
		Date d1;
		d1=new Date();
		d1.display();
		Date d2=new Date(14,8,2025,"Thur");
		d2.display();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter day : ");
        int day=sc.nextInt();
        System.out.println("Enter month : ");
        int month=sc.nextInt();
        System.out.println("Enter year : ");
        int year=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter day of week : ");
        String dow=sc.nextLine();
        Date d3=new Date(day,month,year,dow);
        d3.display();
	} //main ends here
} //Class TestDate ends here


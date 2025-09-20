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
		System.out.println(this.day+"/"+this.month+"/"+this.year);
	}

} //Class Date ends here

class TestDate{
	public static void main(String[] a){
		Date d1;
		d1=new Date();
		Date d2=new Date();
		d1.setDay(3);
		d1.setMonth(9);
		d1.setYear(2025);
		d1.setDow("Wed");
		d2.setDay(4);
		d2.setMonth(9);
		d2.setYear(2025);
		d2.setDow("Thur");		
		System.out.println(d1.day+"/"+d1.month+"/"+d1.year+" :: "+d1.dow);
		System.out.println(d2.day+"/"+d2.month+"/"+d2.year+" :: "+d2.dow);
		
		if(d1.getDay() > d2.getDay()){
			System.out.println("d1 is younger");
		}
		else{
			System.out.println("d2 is younger");
		}

		d1.display();
	} //main ends here
} //Class TestDate ends here


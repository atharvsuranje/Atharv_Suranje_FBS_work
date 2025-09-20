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

} //Class Date ends here

class TestDate{
	public static void main(String[] a){
		Date d1;
		d1=new Date();
		System.out.println(d1);
		//Date d2=new Date();
		//System.out.println(d2);
		d1.setDay(3);
		d1.setMonth(9);
		d1.setYear(2025);
		d1.setDow("Wed");		
		System.out.println(d1.day+"/"+d1.month+"/"+d1.year);
		System.out.println(d1.dow);
	} //main ends here
} //Class TestDate ends here


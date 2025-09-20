class Time{
	int hr,min,sec;

	void format(){
		if(this.sec>=60){
			this.min += this.sec/60;
			this.sec=this.sec%60;
		}
		if(this.min>=60){
			this.hr += this.min/60;
			this.min=this.min%60;
		}
		this.hr=this.hr%24;
	}

	Time(int hr,int min,int sec){
		this.hr=hr;
		this.min=min;
		this.sec=sec;
		format();
	}

	Time(){
		this.hr=0;
		this.min=0;
		this.sec=0;
	}

	Time add(Time t1,Time t2){
		Time result=new Time();
		result.hr=t1.hr+t2.hr;
		result.min=t1.min+t2.min;
		result.sec=t1.sec+t2.sec;
		result.format();
		return result;
	}

	void add(int h,int m,int s){
		this.hr=this.hr+h;
		this.min=this.min+m;
		this.sec=this.sec+s;
		this.format();
	}

	void setHour(int hr){
		this.hr=hr;
	}
	
	void setMinute(int min){
		this.min=min;
	}

	void setSecond(int sec){
		this.sec=sec;
	}

	int setHour(){
		return this.hr;
	}
	
	int setMinute(){
		return this.min;
	}

	int setSecond(){
		return this.sec;
	}

	void display(){
		System.out.println("Time is : "+this.hr+":"+this.min+":"+this.sec);
	}
} //class Time ends here

class TestTime{
	public static void main(String[] args){
		Time t1=new Time(5,10,20);
		t1.display();
		Time t2=new Time(20,50,12);
		t2.display();
		Time result= new Time();
		result=result.add(t1,t2);
		result.display();
		t1.add(15,20,20);
		t1.display();
	} //main ends here
} //class TestTime ends here
package p1;

public class Mobile implements Observer{

	private float temp;
	WeatherStation weather;
	
	
	public Mobile(WeatherStation w) {
		this.weather=w;
		weather.register(this);
	}


	public Mobile() {

	}


	@Override
	public void update(float temp) {
		this.temp=temp;
		display();
	}

	public void display() {
		System.out.println(this+" Temperature is : "+temp);
	}
}

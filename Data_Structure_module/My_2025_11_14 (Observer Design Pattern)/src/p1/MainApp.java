package p1;

public class MainApp {

	public static void main(String[] args) {
		WeatherStation w1 = new WeatherStation();
		
		Mobile m1=new Mobile(w1);
		Mobile m2=new Mobile(w1);
		Mobile m3=new Mobile();
		
		w1.changeTemperature(12);
		w1.changeTemperature(22);
	}

}

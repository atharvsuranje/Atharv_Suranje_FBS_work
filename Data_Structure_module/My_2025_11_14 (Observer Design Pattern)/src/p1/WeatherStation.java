package p1;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements Observable{

	List<Observer> registered=new ArrayList <Observer>();
	float temp;
	
	public WeatherStation() {

	}

	@Override
	public void register(Observer o) {
		registered.add(o);
	}

	@Override
	public void unRegister(Observer o) {
		if(registered.contains(o)) {
			registered.remove(o);
		}
		else {
			System.out.println("NOt Registered");
		}
	}

	@Override
	public void notifyAllObserver() {
		for(Observer o:registered) {
			o.update(temp);
		}
	}

	public float getTemp() {
		return temp;
	}

	public void changeTemperature(float temp) {
		this.temp = temp;
		tempChanged();
	}
	
	public void tempChanged() {
		notifyAllObserver();
	}
}

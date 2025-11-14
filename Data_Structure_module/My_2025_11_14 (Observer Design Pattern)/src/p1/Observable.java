package p1;

public interface Observable {
	void register(Observer o);
	void unRegister(Observer o);
	void notifyAllObserver();
}

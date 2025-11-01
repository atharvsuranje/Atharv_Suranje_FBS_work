package p1;
public interface payFees {
	void payOnline();
	default void payOffline() {
		System.out.println("Can't do offline payment so doing online payment");
		payOnline();
	}
}

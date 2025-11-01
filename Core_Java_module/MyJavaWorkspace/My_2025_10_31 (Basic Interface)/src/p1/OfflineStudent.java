package p1;

public class OfflineStudent implements payFees{

	public OfflineStudent() {

	}
	@Override
	public void payOnline() {
		System.out.println("Offline Student fees paid");
	}
	@Override
	public void payOffline() {
		System.out.println("Offline Student Offline fees paid");
	}
	
}

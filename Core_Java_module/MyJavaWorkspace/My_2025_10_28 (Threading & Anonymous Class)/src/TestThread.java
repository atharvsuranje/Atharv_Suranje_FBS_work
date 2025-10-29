class Worker implements Runnable{
	public void run() {
		String numbers="0123456789876543210";
		for(int i=0;i<numbers.length();i++) {
			System.out.print(" "+numbers.charAt(i));
			try {
				Thread.sleep(500);
			} 
			catch (InterruptedException e) {
				e.printStackTrace();
			}
		}		
	}
} //Worker Class Ends Here

public class TestThread {

	public static void main(String[] args) {
		Worker w1=new Worker();
		Thread t1=new Thread(w1);
		t1.start();
		String alphabet = "abcdefghijklmnopqrstuvwxyz";
		for(int i=0;i<alphabet.length();i++) {
			System.out.print(" "+alphabet.charAt(i));
			try {
				Thread.sleep(500);
			} 
			catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

} //TestThread Class Ends Here
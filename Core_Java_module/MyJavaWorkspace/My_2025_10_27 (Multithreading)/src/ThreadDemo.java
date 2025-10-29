class Worker extends Thread{
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

public class ThreadDemo {
	public static void main(String[] args) {
		Worker w1=new Worker();
		w1.start();
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

} //Worker Class Ends Here
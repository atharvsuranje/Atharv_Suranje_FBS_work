package p1;

class BankAccount {
	private int balance = 1000;

	public synchronized void deposit(int amount) {
		System.out.println(" depositing " + amount);
		this.balance = this.balance + amount;
		System.out.println("Balance after deposit: " + this.balance);
		notifyAll();
	}

	public synchronized void withdraw(int amount) {
		System.out.println(" wants to withdraw " + amount);

		while (this.balance < amount) {
			System.out.println("Insufficient funds (" + this.balance + "). Waiting...");
			try {
				wait();
			} catch (InterruptedException e) {
				System.out.println("Withdrawal interrupted");
				return;
			}
		}

		this.balance = this.balance - amount;
		System.out.println("Withdrawn " + amount + ". Balance now: " + this.balance);
	}

	public synchronized int getBalance() {
		return this.balance;
	}
}

public class WaitNotifyAnonymousDemo {

	public static void main(String[] args) {

		final BankAccount account = new BankAccount();

		//  Withdraw thread using Anonymous class
		Thread t1 = new Thread(new Runnable() {
			public void run() {
				account.withdraw(30000);
				System.out.println(" completed withdrawal");
			}
		});

		// Deposit thread using Anonymous class
		Thread t2 = new Thread(new Runnable() {
			public void run() {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				account.deposit(800);
				System.out.println(" completed deposit");
			}
		}

		);

		t1.start();
		t2.start();

		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
		}

		System.out.println("Final Balance: " + account.getBalance());
	}
}
import java.util.Scanner;

class BankAccount{
	int accNo;
	String holderName;
	double balance;
	static double intrest;

	static{
		intrest=7.5;
	}
	void setAccNo(int a){
		this.accNo=a;
	}
	
	void setHolderName(String h){
		this.holderName=h;
	}

	void setBalance(double b){
		this.balance=b;
	}

	static void setIntrest(double i){
		intrest=i;
	}

	int getAccNo(){
		return this.accNo;
	}

	String getHolderName(){
		return this.holderName;
	}	
	
	double setBalance(){
		return this.balance;
	}

	double getIntrest(){
		return this.intrest;
	}

	void display(){
		System.out.println("Account No : "+this.accNo);
		System.out.println("Account Holder Name : "+this.holderName);
		System.out.println("Balance : "+this.balance);
		System.out.println("Intrest : "+this.intrest);
	}

	BankAccount(){
		this.accNo=12345;
		this.holderName="Default";
		this.balance=9999.99;
	}

	BankAccount(int a,String hn,double ba){
		this.accNo=a;
		this.holderName=hn;
		this.balance=ba;
	}
} //class BankAccount ends here

class TestBankAccount{
	public static void main(String[] a){
		BankAccount b1=new BankAccount();
		b1.display();
		BankAccount b2=new BankAccount(102,"atharv",1234.98);
		b2.display();
               	BankAccount b3=new BankAccount(103,"ram",952085);
        	b3.display();
		BankAccount.setIntrest(10);
		b1.display();
		b2.display();
		b3.display();
	} //main ends here

}//class TestBankAccount ends here

class BankAccount{
	int accNo;
	String holderName,branch;
	double balance;

	void setAccNo(int a){
		this.accNo=a;
	}
	
	void setHolderName(String h){
		this.holderName=h;
	}
	
	void setBranch(String b){
		this.branch=b;
	}

	void setBalance(double b){
		this.balance=b;
	}

	int getAccNo(){
		return this.accNo;
	}

	String getHolderName(){
		return this.holderName;
	}	
	
	String setBranch(){
		return this.branch;
	}
	
	double setBalance(){
		return this.balance;
	}

	void display(){
		System.out.println("Account No : "+this.accNo);
		System.out.println("Account Holder Name : "+this.holderName);
		System.out.println("Branch : "+this.branch);
		System.out.println("Balance : "+this.balance);
	}

	BankAccount(){
		this.accNo=12345;
		this.holderName="Atharv";
		this.branch="Pune";
		this.balance=9999.99;
		System.out.println("Inside Default Constructor");
	}

	BankAccount(int a,String hn,String b,double ba){
		this.accNo=a;
		this.holderName=hn;
		this.branch=b;
		this.balance=ba;
		System.out.println("Inside Parameterized Constructor");
	}
} //class BankAccount ends here

class TestBankAccount{
	public static void main(String[] a){
		BankAccount b1=new BankAccount();
		b1.display();
		BankAccount b2=new BankAccount(98765,"Test","Pune",1234.98);
		b2.display();
	} //main ends here

}//class TestBankAccount ends here

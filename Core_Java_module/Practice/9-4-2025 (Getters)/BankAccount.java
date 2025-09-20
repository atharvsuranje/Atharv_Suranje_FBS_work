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
} //class BankAccount ends here

class TestBankAccount{
	public static void main(String[] a){
		BankAccount b1=new BankAccount();
		b1.setAccNo(123456);
		b1.setHolderName("Atharv");
		b1.setBranch("Pune");
		b1.setBalance(999.99);
		b1.display();
	} //main ends here

}//class TestBankAccount ends here

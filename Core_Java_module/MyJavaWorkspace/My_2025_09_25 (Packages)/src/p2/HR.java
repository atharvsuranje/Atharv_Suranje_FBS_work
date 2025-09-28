package p2;

import p1.Employee;

public class HR extends Employee{
	double commission;

	public HR() {
		super();
		this.commission = 0;
	}

	public HR(String name,int id,double salary,double commission) {
		super(name,id,salary);
		this.commission = commission;
	}


	public double getCommission() {
		return commission;
	}


	public void setCommission(double commission) {
		this.commission = commission;
	}
	
	public void display() {
		super.display();
		System.out.println("Commission is : "+this.commission);
	}
	
	public double calSalary() {
		return this.getSalary()+this.commission;
	}
}

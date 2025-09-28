package p2;

import p1.Employee;

public class Admin extends Employee{
	public double allowance;

	public Admin() {
		super();
		this.allowance = 0;
	}
	public Admin(String name,int id,double salary,double allowance) {
		super(name,id,salary);
		this.allowance = allowance;
	}
	
	public double getAllowance() {
		return allowance;
	}
	public void setAllowance(double allowance) {
		this.allowance = allowance;
	}
	
	public void display(){
		super.display();
		System.out.println("Allowance is : "+this.allowance);
	}
	
	public double calSalary() {
		return this.getSalary()+this.allowance;
	}
}

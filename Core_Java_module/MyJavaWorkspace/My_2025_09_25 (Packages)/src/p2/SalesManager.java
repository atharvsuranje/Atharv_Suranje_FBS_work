package p2;

import p1.Employee;

public class SalesManager extends Employee{
	double incentive;
	int target;
	
	public SalesManager() {
		super();
		this.incentive = 100;
		this.target = 0;
	} 
	
	public SalesManager(String name,int id,double salary,double incentive, int target) {
		super(name,id,salary);
		this.incentive = incentive;
		this.target = target;
	}

	public double getIncentive() {
		return incentive;
	}

	public int getTarget() {
		return target;
	}

	public void setIncentive(double incentive) {
		this.incentive = incentive;
	}

	public void setTarget(int target) {
		this.target = target;
	}
	public void display() {
		super.display();
		System.out.println("Incentive is : "+this.incentive);
		System.out.println("Target is : "+this.target);
	}	
	
	public double calSalary() {
		return this.getSalary()+this.incentive;
	}
}

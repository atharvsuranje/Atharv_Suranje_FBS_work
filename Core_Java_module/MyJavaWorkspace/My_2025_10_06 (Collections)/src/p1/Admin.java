package p1;

public class Admin extends Employee{
	private double allowance;

	//constructor
	public Admin(int id, String name, double salary, double allowance) {
		super(id, name, salary);
		// TODO Auto-generated constructor stub
		this.allowance=allowance;
	}

	//getter
	public double getAllowance() {
		return allowance;
	}

	//setter
	public void setAllowance(double allowance) {
		this.allowance = allowance;
	}
	
	public String toString() {
		return super.toString()+"\nAllowance : "+this.getAllowance();
	}

	@Override
	public double calculateSalary() {
		// TODO Auto-generated method stub
		return this.getSalary()+this.getAllowance();
	}
}

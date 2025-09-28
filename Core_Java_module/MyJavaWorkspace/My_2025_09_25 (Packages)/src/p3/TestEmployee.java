package p3;

import p1.Employee;

public class TestEmployee {
	public static void main(String[] args) {
		Employee [] empArr = new Employee[3];
		
		empArr[0]=new p2.HR("Pranav",104,50000,5000);
		empArr[1]=new p2.SalesManager("Hari",102,30000,3000,20);
		empArr[2]=new p2.Admin("Nishikant",103,40000,4000);
		
		for(int i=0;i<empArr.length;i++) {
			empArr[i].display();
			System.out.println("Salary : "+empArr[i].calSalary());
		}
	}
}

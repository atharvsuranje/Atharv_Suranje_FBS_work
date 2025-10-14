package p1;

import java.io.Serializable;

public class Student implements Serializable{
	int rollNo;
	String name;
	double marks;
	
	public Student() {
		
	}
	
	public Student(int rollNo, String name, double marks) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", marks=" + marks + "]";
	}

}

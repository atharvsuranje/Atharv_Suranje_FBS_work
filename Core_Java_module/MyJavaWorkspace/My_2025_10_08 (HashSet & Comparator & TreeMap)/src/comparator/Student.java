package comparator;

class Student{
	int rollno;
	double marks;
	String name;
	
	public Student() {
		this.rollno = 0;
		this.marks = 0;
		this.name = "NA";
	}

	public Student(int rollno, double marks, String name) {
		this.rollno = rollno;
		this.marks = marks;
		this.name = name;
	}

	public int getRollno() {
		return rollno;
	}

	public double getMarks() {
		return marks;
	}

	public String getName() {
		return name;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public void setMarks(double marks) {
		this.marks = marks;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "\nStudent rollno=" + rollno + ", marks=" + marks + ", name=" + name;
	}
	
	
}

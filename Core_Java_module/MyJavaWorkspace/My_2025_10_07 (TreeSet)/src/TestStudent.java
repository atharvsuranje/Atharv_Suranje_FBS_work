import java.util.TreeSet;

public class TestStudent {

	public static void main(String[] args) {
		TreeSet <Student> ts= new TreeSet <Student> ();
		ts.add(new Student(101,90,"Atharv"));
		ts.add(new Student(103,60,"Soham"));
		ts.add(new Student(104,40,"Aditya"));
		ts.add(new Student(102,50,"Pranav"));

		System.out.println(ts);
		
		if(ts.contains(new Student(103,600,"Soham"))) {
			System.out.println("Found");
		}
		else {
			System.out.println("Not Found");
		}
	}

}

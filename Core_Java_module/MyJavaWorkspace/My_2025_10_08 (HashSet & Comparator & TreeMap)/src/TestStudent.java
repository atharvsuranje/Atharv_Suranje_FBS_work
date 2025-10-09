import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class TestStudent {

	public static void main(String[] args) {
		HashSet<Student >hs=new HashSet <Student>();
		hs.add(new Student(101,90,"Atharv"));
		hs.add(new Student(103,60,"Soham"));
		hs.add(new Student(104,40,"Aditya"));
		hs.add(new Student(102,50,"Pranav"));
		hs.add(new Student(104,40,"Aditya"));
		hs.add(new Student(104,40,"Aditya"));

		System.out.println(hs);
	}

	public static void main1(String[] args) {
		ArrayList<Student> a1=new ArrayList <Student>();
		a1.add(new Student(101,90,"Atharv"));
		a1.add(new Student(103,60,"Soham"));
		a1.add(new Student(104,40,"Aditya"));
		a1.add(new Student(102,50,"Pranav"));
		
		System.out.println("Before Sorting\n"+a1);
		Collections.sort(a1);
		System.out.println("After Sorting\n"+a1);
		
		for(Student s1:a1) {
			System.out.println(s1.getName());
		}
	}
}



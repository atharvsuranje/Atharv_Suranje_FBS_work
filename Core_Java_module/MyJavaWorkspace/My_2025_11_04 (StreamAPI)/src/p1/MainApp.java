package p1;

import java.util.ArrayList;
import java.util.List;

public class MainApp {

	public static void main(String[] args) {
		List<Student> allStudents = new ArrayList<Student>();
		allStudents.add(new Student(1,"Atharv",90,"M"));
		allStudents.add(new Student(2,"Soham",80,"M"));
		allStudents.add(new Student(3,"Pranav",70,"M"));
		allStudents.add(new Student(4,"Geeeta",95,"F"));
		
		//Iteration
		//forEach()
		//allStudents.stream().forEach(ref->System.out.println(ref.getName()));
		
		//Filtering
		//allStudents.stream().filter(anyRef->anyRef.getMarks()>=90).forEach(ref->System.out.println(ref.getName()));
		
		Double avg=allStudents.stream().filter(ref->ref.getGender().equals("M")).mapToDouble(ref->ref.getMarks()).average().getAsDouble();
		System.out.println(avg);
	}

}

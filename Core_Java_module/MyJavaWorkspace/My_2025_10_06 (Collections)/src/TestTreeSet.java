import java.util.TreeSet;

import employee.*;

public class TestTreeSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet ts= new TreeSet();
		ts.add(new HR(104, "Priya", 46000, 4200));
		ts.add(new SalesManager(204, "Rahul", 61000, 8500, 14));
		ts.add( new Admin(305, "Kavita", 69000, 9700));
		ts.add(new HR(105, "Vikas", 49000, 4800));
		ts.add(new SalesManager(205, "Tina", 59000, 7800, 13));
		ts.add(new Admin(306, "Manoj", 74000, 11500));
		
		System.out.println(ts);
	}

}

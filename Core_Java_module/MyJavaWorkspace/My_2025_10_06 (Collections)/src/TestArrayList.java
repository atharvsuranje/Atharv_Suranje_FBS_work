import java.util.ArrayList;
import p1.*;

public class TestArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al = new ArrayList();
		al.add(new HR(104, "Priya", 46000, 4200));
		al.add(new SalesManager(204, "Rahul", 61000, 8500, 14));
		al.add( new Admin(305, "Kavita", 69000, 9700));
		al.add(new HR(105, "Vikas", 49000, 4800));
		al.add(new SalesManager(205, "Tina", 59000, 7800, 13));
		al.add(new Admin(306, "Manoj", 74000, 11500));
		al.add(new Admin(306, "Manoj", 74000, 11500));
		
		System.out.println(al);
		
		for(int i=0;i<al.size();i++) {
			Employee e=(Employee) al.get(i);
			System.out.println(e.calculateSalary());
		}
	}

}

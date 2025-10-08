import java.util.LinkedList;
import p1.*;

public class TestLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList ll = new LinkedList();
		ll.add(new HR(104, "Priya", 46000, 4200));
		ll.add(new SalesManager(204, "Rahul", 61000, 8500, 14));
		ll.add( new Admin(305, "Kavita", 69000, 9700));
		ll.add(new HR(105, "Vikas", 49000, 4800));
		ll.add(new SalesManager(205, "Tina", 59000, 7800, 13));
		ll.add(new Admin(306, "Manoj", 74000, 11500));
		ll.add(new Admin(306, "Manoj", 74000, 11500));
		
		System.out.println(ll);
		
		for(int i=0;i<ll.size();i++) {
			Employee e=(Employee) ll.get(i);
			System.out.println(e.calculateSalary());
		}
	}

}

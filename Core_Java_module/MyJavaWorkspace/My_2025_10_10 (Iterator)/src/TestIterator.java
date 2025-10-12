import java.util.ArrayList;
import java.util.Iterator;

public class TestIterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al= new ArrayList<String>();
		al.add("Atharv");
		al.add("Gopal");
		al.add("Pranav");
		al.add("Kamlesh");
		
//		for(String str:al) {
//			if(str.equals("Gopal"))
//				al.remove(str);
//		}
//		
//		System.out.println(al);
		
		Iterator<String> myit=al.iterator();
		
		while(myit.hasNext()) {
			String str=myit.next();
			if(str.equals("Pranav"))
				myit.remove();
		}
		System.out.println(al);
	}

}

package map;

import java.util.TreeMap;

public class TestStudent {

	public static void main(String[] args) {
		TreeMap <MyKey, Student> tm=new TreeMap <MyKey, Student>();
		tm.put(new MyKey(101), new Student(101,90,"Atharv"));
		tm.put(new MyKey(103), new Student(103,60,"Soham"));
		tm.put(new MyKey(104), new Student(104,40,"Aditya"));
		tm.put(new MyKey(102), new Student(102,50,"Pranav"));
		
		System.out.println(tm);
	}

}

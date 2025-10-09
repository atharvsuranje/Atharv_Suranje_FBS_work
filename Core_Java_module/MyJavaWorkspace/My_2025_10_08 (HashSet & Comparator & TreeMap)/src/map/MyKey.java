package map;

public class MyKey implements Comparable<MyKey>{

	int key;
	
	MyKey(int key){
		this.key=key;
	}
	
	@Override
	public String toString() {
		return "\nkey is : " + key ;
	}


	@Override
	public int compareTo(MyKey o) {
		return this.key-o.key;
	}

}

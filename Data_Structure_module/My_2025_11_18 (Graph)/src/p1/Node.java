package p1;

public class Node {
	String value;

	public Node() {
		
	}

	public Node(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return value;
	}

	@Override
	public int hashCode() {
		return value.toLowerCase().hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if(this == obj) return true;
		if(!(obj instanceof Node)) return false;
		Node other=(Node) obj;
		return value.equalsIgnoreCase(other.value);
	}
	
	
}

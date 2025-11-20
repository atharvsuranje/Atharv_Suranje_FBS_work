package p1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Graph {
	Map<Node, ArrayList<Node>> myMap = new HashMap<Node, ArrayList<Node>>();
	
	
	public Graph(Map<Node, ArrayList<Node>> myMap) {
		this.myMap = myMap;
	}


	public Graph() {

	}


	public Map<Node, ArrayList<Node>> getMyMap() {
		return myMap;
	}


	public void setMyMap(Map<Node, ArrayList<Node>> myMap) {
		this.myMap = myMap;
	}


	public void insertNode(Node n) {
		myMap.put(n, new ArrayList<Node>());
	}


	public void connectNodes(Node source, Node destination) {
		if(myMap.containsKey(source)) {
			if(!(myMap.containsKey(destination))) {
				insertNode(destination);
			}
			myMap.get(source).add(destination);
			System.out.println("Nodes Connected");
		}
		else {
			System.out.println("Source not Found");
		}
	}


	public void print() {
		if(myMap.isEmpty()) {
			System.out.println("No data to Show");
		}
		else {
			Set<Entry<Node, ArrayList<Node>>> entries=myMap.entrySet();
			for(Entry<Node, ArrayList<Node>> entry:entries) {
				System.out.print("\n"+entry.getKey() + " --> ");
				ArrayList<Node> list = entry.getValue();
				
				if(list.isEmpty()) {
					System.out.println("No Connection");
				}
				else {
					for(Node n:list) {
						System.out.print(n+" ");
					}
					System.out.println();
				}
			}			
		}
	}
	
	
}

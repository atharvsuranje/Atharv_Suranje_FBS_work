package p1;

import java.util.Stack;

public class Checker {

	public boolean isValid(String text) {
		if(text==null) return true;
		Stack<String> stack = new Stack<>();
		int n=text.length();
		int i=0;
		
		while(i<n) {
			char c=text.charAt(i);
			if(c=='<') {
				int j=text.indexOf('>',i+1);
				if(j==-1) {
					return false;
				}
				
				String tagName=text.substring(i+1,j).trim().toLowerCase();
				
				boolean isClosingTag=false;
				String name=tagName;
				if(!tagName.isEmpty() && tagName.charAt(0) == '/') {
					isClosingTag=true;
					name=tagName.substring(1);
				}
				
				if(isClosingTag) {
					if(stack.isEmpty()) return false;
					String top=stack.pop();
					if(!top.equals(name)) {
						return false;
					}
				}
				
				else {
					stack.push(name);
				}
				i=j+1;
			}
			else {
				i++;
			}
		}
		return stack.isEmpty();
	}

}

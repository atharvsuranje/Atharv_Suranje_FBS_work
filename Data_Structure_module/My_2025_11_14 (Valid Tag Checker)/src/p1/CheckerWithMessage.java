package p1;

import java.util.Stack;

public class CheckerWithMessage {

	public String validate(String text) {
		if(text==null) return "File is VALID";
		
		Stack<String> stack = new Stack<>();
		int n=text.length();
		int i=0;
		int line=1;
		
		while(i<n) {
			char c=text.charAt(i);
			
			if(c == '\n') {
				line++;
				i++;
				continue;
			}
			
			if(c=='<') {
				int j=text.indexOf('>',i+1);
				if(j==-1) {
					return "Error on line "+line+" : missing '>' for the tag";
				}
				
				String tagName=text.substring(i+1,j).trim().toLowerCase();
				
				boolean isClosingTag=false;
				String name=tagName;
				if(!tagName.isEmpty() && tagName.charAt(0) == '/') {
					isClosingTag=true;
					name=tagName.substring(1);
				}
				
				if(isClosingTag) {
					if(stack.isEmpty()) {
						return "Error on line "+line+" : closing tag </"+name+"> missing a opening";
					}
					String top=stack.pop();
					if(!top.equals(name)) {
						return "Error on line "+line+" : mismatched tags.\nExpected </"+top+"> but found </"+name+">.";
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
		
		if(!stack.isEmpty()) {
			return "Error at end of file: unclosed tag <"+stack.peek()+">.";
		}
		return "File is VALID";
	}
}

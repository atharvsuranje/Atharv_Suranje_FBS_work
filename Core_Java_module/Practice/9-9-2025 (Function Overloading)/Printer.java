class Printer{
	void print(char c){
		System.out.println(c);
		System.out.println("void print(char c)");
	}
	
	void print(int i){
		System.out.println(i);
		System.out.println("void print(int i)");
	}

	void print(String s){
		System.out.println(s);
		System.out.println("void print(String s)");
	}
} //class Printer ends here

class TestPrinter{
	public static void main(String[] args){
		Printer p1=new Printer();
		p1.print('A');
		p1.print(101);
		p1.print("FirstBit");
	} //main ends here
} //class TestPrinter ends here
public class Test {

	public static void main(String[] args) {
		int a=10,b=0,c;
		
		try {
			String str1=args[0];
			String str2=args[1];
			
			System.out.println("Name is : "+str1+" "+str2);
			
		}
		catch(ArrayIndexOutOfBoundsException ar) {
			System.out.println("please provide atleast 2 arguments");
		}
		try {
			c=a/b;
			System.out.println("Answrr is : "+c);
		}
		catch(ArithmeticException ae) {
			System.out.println("Second value can't be 0");
		}
		catch(Exception e) {
			System.out.println("Some problem occurred.");
		}

	}

}

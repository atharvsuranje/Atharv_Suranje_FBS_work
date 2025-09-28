package p1;

public class A {
	public void myFunA() {
		System.out.println("Inside A");
	}
}

class B extends A{
	void myFunB() {
		A ref=new A();
		ref.myFunA();
	}
	
}

class C{
	void myFunC() {
		A ref=new A();
		ref.myFunA();
	}
}
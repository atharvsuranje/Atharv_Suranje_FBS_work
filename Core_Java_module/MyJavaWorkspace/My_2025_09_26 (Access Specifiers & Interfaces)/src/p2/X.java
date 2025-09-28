package p2;

import p1.A;

public class X {
	void myFunX() {
		A ref=new A();
		ref.myFunA();
	}
}

class Y extends A{
	void myFunY() {
		A ref=new A();
		ref.myFunA();
	}
}
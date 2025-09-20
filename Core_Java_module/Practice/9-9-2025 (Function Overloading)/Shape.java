class Shape{
	void calcArea(Triangle t){
		double area=0.5*(t.getBase()*t.getHeight());
		System.out.println("Area of Triangle is : "+area);
	}

	void calcArea(Rectangle r){
		double area=r.getLength()*r.getBreadth();
		System.out.println("Area of Rectangle is : "+area);
	}

	void calcArea(Circle c){
		double area=3.14*c.getRadius()*c.getRadius();
		System.out.println("Area of Circle is : "+area);
	}
} //class Shape ends here

class Triangle{
	double base,height;
	Triangle(){
		this.base=0;
		this.height=0;
	}

	Triangle(double b,double h){
		this.base=b;
		this.height=h;
	}

	void setBase(double b){
		this.base=b;
	}

	void setHeight(double h){
		this.height=h;
	}

	double getBase(){
		return this.base;
	}

	double getHeight(){
		return this.height;
	}

	void display(){
		System.out.println("Base : "+this.base);
		System.out.println("Height : "+this.height);
	}
} //class Triangle ends here

class Rectangle{
	double length,breadth;
	Rectangle(){
		this.length=0;
		this.breadth=0;
	}

	Rectangle(double l,double b){
		this.length=l;
		this.breadth=b;
	}
	
	void setLength(double l){
		this.length=l;
	}

	void setBreadth(double b){
		this.breadth=b;
	}

	double getLength(){
		return this.length;
	}

	double getBreadth(){
		return this.breadth;
	}

	void display(){
		System.out.println("Length : "+this.length);
		System.out.println("Breadth : "+this.breadth);
	}
} //class Rectangle ends here

class Circle{
	double radius;
	Circle(){
		this.radius=0;
	}

	Circle(double r){
		this.radius=r;
	}

	void setRadius(double r){
		this.radius=r;
	}

	double getRadius(){
		return this.radius;
	}

	void display(){
		System.out.println("Radius : "+this.radius);
	}
} //class Cricle ends here

class TestShape{
	public static void main(String[] args){
		Shape s1=new Shape();
		Triangle t1=new Triangle(5,10);
		t1.display();
		s1.calcArea(t1);
		Circle c1=new Circle(10);
		c1.display();
		s1.calcArea(c1);
		Rectangle r1=new Rectangle(10,5);
		r1.display();
		s1.calcArea(r1);
	} //main ends here
} //class TestShape ends here
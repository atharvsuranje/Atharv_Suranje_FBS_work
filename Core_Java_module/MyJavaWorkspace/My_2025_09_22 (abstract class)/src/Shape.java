abstract class Shape{
	double area;

	Shape() {
		this.area = 0;
	}
	
	Shape(double area) {
		this.area = area;
	}

	double getArea() {
		return area;
	}

	void setArea(double area) {
		this.area = area;
	}
	
	// Polymorphic behavior
	abstract void calcArea();
	void display() {
		System.out.println();
		System.out.println("Area of the shape : "+this.area);

	}
} //Shape ends here

class Triangle extends Shape{
	double base,height;

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

	// Polymorphic behavior
	void calcArea() {
		this.area=0.5*this.height*this.base;
	}
	void display(){
		System.out.println();
		System.out.println("Triangle:");
		System.out.println("Base : "+this.base);
		System.out.println("Height : "+this.height);
		System.out.println("Area : "+this.area);
	}
} //class Triangle ends here

class Rectangle extends Shape{
	double length,breadth;

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

	// Polymorphic behavior
	void calcArea() {
		this.area=this.length*this.breadth;
	}
	void display(){
		System.out.println();
		System.out.println("Rectangle :");
		System.out.println("Length : "+this.length);
		System.out.println("Breadth : "+this.breadth);
		System.out.println("Area : "+this.area);
	}
} //class Rectangle ends here

class Circle extends Shape{
	double radius;

	Circle(double r){
		this.radius=r;
	}

	void setRadius(double r){
		this.radius=r;
	}

	double getRadius(){
		return this.radius;
	}

	// Polymorphic behavior
	void calcArea(){
		this.area=Math.PI*this.radius*this.radius;
	}
	void display(){
		System.out.println();
		System.out.println("Circle :");
		System.out.println("Radius : "+this.radius);
		System.out.println("Area : "+this.area);
	}
} //class Cricle ends here

class TestShape{
	public static void main(String[] args) {
		Shape s1;
		
//		s1=new Shape();
//		s1.calcArea();
//		s1.display();
		
		s1=new Triangle(10,5);
		s1.calcArea();
		s1.display();
		
		s1=new Rectangle(10,4);
		s1.calcArea();
		s1.display();
		
		s1=new Circle(7);
		s1.calcArea();
		s1.display();
	} //main ends here
} //class TestShape ends here

















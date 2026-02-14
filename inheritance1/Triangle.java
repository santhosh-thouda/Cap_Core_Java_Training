package inheritance1;

public class Triangle extends Shape{
	int height;
	int base;
	
	Triangle(){}
	
	Triangle(String type ,int height, int base){
		super(type);
		this.height = height;
		this.base = base;
	}
	
	int area() {
		return ((height * base)/2);
	}
	
	void display() {
		System.out.println(type);
		System.out.println(base);
		System.out.println(height);
		System.out.println(area());
	}
}

package Factorydesign;

public class Circle implements Shape {
private double radius;
	
	public Circle(){				
		this.radius = 0;
	}
	
	public Circle(double radius){			
		this.radius = radius;
	}
	
	public void draw() {	
		
	      System.out.println("Display circle");
	}
	
	public double calculateArea() {			
		return 3.14*this.radius*this.radius;
	}
	
	public Shape getClone() {				
		return new Circle(this.radius);
	}


	
	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	

}

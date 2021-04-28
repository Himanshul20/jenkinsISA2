package Factorydesign;

public class SFactory {
public Shape getInstance(Stype type) {
		
		Shape shape = null;
			
		switch(type) 
		{
		
			
			case RECTANGLE:
				shape = new Rectangle(10,9);
				break;
				
			case TRIANGLE:
				shape = new Triangle(5,5);
				break;
				
			case CIRCLE:
				shape = new Circle(25);
				break;
				
		}
		
		return shape;
	}	
}

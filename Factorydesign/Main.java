package Factorydesign;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		SFactory shapefactory = new SFactory();
		System.out.println(" Select the Shape which you want to Draw the shape and Calculate Area  :- ");
        System.out.println("\1. Rectangle");
        System.out.println("\2. Triangle ");
        System.out.println("\3. Circle");
        System.out.println("\4. Exit ");
        int choice = s.nextInt();
		
        switch(choice) 
        {    
        	
        	
        	case 1:
        		Shape rectangle = shapefactory.getInstance(Stype.RECTANGLE);
        		rectangle.draw();
        		System.out.println("Area of Rectangle is "+rectangle.calculateArea());
        		
        		
        		break;
        		
        		
        	case 2:
        		Shape triangle = shapefactory.getInstance(Stype.TRIANGLE);
        		triangle.draw();
        		System.out.println("Area of Triangle is "+triangle.calculateArea());
        		
        		
        		break;
        			
        	case 3:
        		Shape circle = shapefactory.getInstance(Stype.CIRCLE);
        		circle.draw();
        		System.out.println("Area of Circle is "+circle.calculateArea());
        		
        		
        		break;
        		
        	case 4:
        		break;
        	
        	default:
        		System.out.println("Enter valid option");
        		break;
        }
        
        
        s.close();
        
	}

	}



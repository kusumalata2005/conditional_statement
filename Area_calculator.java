package conditional_statement;

public class Area_calculator {

	public static void main(String[] args) {
		
		int choice = 2;
		
		switch(choice) {
		
		case 1:
			double radius = 5;
			double circleArea = 3.14 * radius * radius;
			System.out.println("area of circle = " + circleArea);
			break;
		case 2:
			double length = 5;
			double breadth = 2;
			double rectanglearea = length*breadth;
			System.out.println("area of rectangle = " +rectanglearea );
			break;
		case 3:
			double side = 5;
			double squarearea = side*side;
			System.out.println("area of rectangle = " +squarearea );
			break;
			default:
				System.out.println("invalid choice");
		
		}

	}

}

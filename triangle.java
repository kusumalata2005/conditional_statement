package conditional_statement;

public class triangle {

	public static void main(String[] args) {
	
	int a = 5;
	int b = 5;
	int c = 5;
	if(a==b && b==c) {
		
		System.out.println("equilateral triangle");
	}else if(a==b || b==c || c==a) {
		
		System.out.println("isosceles triangle"); 
		
	}else {
		System.out.println("scalene triangle");
	}

	}

}

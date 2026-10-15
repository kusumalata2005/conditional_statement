package conditional_statement;

public class calculator_check {

	public static void main(String[] args) {
	    
		int a =20;
		int b =10;
		
		char operator ='*';
		
		switch(operator) {
		  
		case '+':
			System.out.println("result = " +(a+b));
			break;
		case '-':
			System.out.println("result = " +(a-b));
			break;
		case '*':
			System.out.println("result = " +(a*b));
			break;
		case '/':
			System.out.println("result = " +(a/b));
			break;
			default:
				System.out.println("invalid operator....");


		
		
		}

	}

}

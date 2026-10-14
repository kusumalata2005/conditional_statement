package conditional_statement;

public class Grade_check {

	public static void main(String[] args) {
		
      char grade = 'A';
		
		switch(grade) {
		
		case 'A':
			System.out.println("excellent");
			break;
		case 'B':
			System.out.println("good");
			break;
		case 'C':
			System.out.println("average");
			break;
		case 'D':
			System.out.println("pass");
			break;
		case 'f':
			System.out.println("fail");
			break;
			default:
				System.out.println("grade not exist");
				}

		

	}

}

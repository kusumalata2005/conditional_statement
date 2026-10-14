package conditional_statement;

public class marks_check {

	public static void main(String[] args) {
		
		int marks = 34;

		switch (marks) {
		case 1:
			System.out.println("pass ... !");
			break;
		case 2:
			System.out.println("Distinction... ! ");
		    break;
		case 3:
			System.out.println("Fail... ! ");
			break;
	
		default:
			System.out.println(" Not Exit ... ! ");
		}



	}

}

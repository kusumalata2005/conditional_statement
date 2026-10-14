package conditional_statement;

public class ageGroup_check {

	public static void main(String[] args) {
		
		
		int age = 30;

		if (age >= 0 && age <= 12) {
			System.out.println("child");
		} else if (age >= 13 && age < 19) {
			System.out.println("teenager");
		} else if (age >= 20 && age < 59) {
			System.out.println("adult");
		}  else {
			System.out.println("senior citizen");
		}

	}

}

package conditional_statement;

public class Menu {

	public static void main(String[] args) {
		
       int menu = 2;

		switch (menu) {
		case 1:
			System.out.println("Login ... !");
			break;
		case 2:
			System.out.println("Resister ... ! ");
		    break;
		case 3:
			System.out.println("profile... ! ");
			break;
		case 4:
			System.out.println("Logout");
			break;
		default:
			System.out.println("Exit ... ! ");
		}

		
	}
}

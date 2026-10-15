package conditional_statement;

public class Season {

	public static void main(String[] args) {
		
		 int season = 11;
			
			switch (season) {
				case 12,1,2:
					System.out.println("winter");
					break;
				case 3,4,5:
					System.out.println("summer");
					break;
				case 6,7,8:
					System.out.println("monsoon");
					break;
			   default:
				   System.out.println("invalid season");
					
			}


	}

}

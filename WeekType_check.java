package conditional_statement;

public class WeekType_check {

	public static void main(String[] args) {
		
		 int week = 6;
		
			switch (week) {
				case 1,2,3,4,5:
					System.out.println(" weekday");
					break;
				case 6,7:
					System.out.println(" weekend");
					break;
			   default:
				   System.out.println("not exit");
					
			}

	}

}

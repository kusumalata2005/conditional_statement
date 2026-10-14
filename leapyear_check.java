package conditional_statement;

public class leapyear_check {
	
	public static void main(String[] args) {
		
		int year = 2000;
		
	if(year % 400 == 0 && ( year % 4 == 0 || year % 100 != 0)) {
		
		System.out.println(year + " it is leap year");
		
	}else{
		
		System.out.println(year + " it is not leap year");
	}

	}

}

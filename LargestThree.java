package conditional_statement;

public class LargestThree {

	public static void main(String[] args) {
		int a = 78;
		int b = 50;
		int c = 30;
		
		if(a>b && a>c) {
			
			System.out.println(a + "  a is largest");
		}else if(b>a && b>c) {
			
			System.out.println(b + "  b is largest");
	
		}else {
			
			System.out.println(c + "  c is largest");
		}
		

	}

}

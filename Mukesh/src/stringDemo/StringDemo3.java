package stringDemo;

public class StringDemo3 {

	public static void main(String[] args) {
		
		String actuals = "welcome to Selenium world";
		
		String expected = "Selenium";
		
		boolean status2 = actuals.contains(expected);
		
		System.out.println("Status is "+status2);
		
		
	}

}

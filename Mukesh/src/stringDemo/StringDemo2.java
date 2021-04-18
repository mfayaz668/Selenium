package stringDemo;

public class StringDemo2 {

	public static void main(String[] args) {
		
		String actuals = "welcome to Selenium world";
		
		String expected = "welcome to Selenium world";
		
		boolean status2 = actuals.equals(expected);
		
		System.out.println("Status is "+status2);

	}

}

//methods we can try
//--------
//contains
//equalsIgnoreCase ....>case letters doesnt matter
//ignorecase
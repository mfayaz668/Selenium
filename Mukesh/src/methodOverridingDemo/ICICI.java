package methodOverridingDemo;

public class ICICI extends RBI {

	public static void main(String[] args) 
	{
		ICICI home = new ICICI();
		home.homeLoanIntRate();//child class is called 
		
	}
	
	public void homeLoanIntRate()
	{
		System.out.println("Home Loan Int rate is 10%");
	}
}


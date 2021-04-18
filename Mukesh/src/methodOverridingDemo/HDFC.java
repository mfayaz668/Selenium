package methodOverridingDemo;

public class HDFC extends RBI {

	public static void main(String[] args) 
	{
		RBI home = new RBI();
		home.homeLoanIntRate();//parent class is called
		
		
	}
	
	public void homeLoanIntRate()
	{
		System.out.println("Home Loan Int rate is 11%");
	}
}


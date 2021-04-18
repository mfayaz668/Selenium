package methodOverridingDemo;

public class SBI extends RBI implements Loan {

	public static void main(String[] args) 
	{
		SBI home = new SBI();
		home.homeLoanIntRate();//child class is called
		
		
	}
	
	public void homeLoanIntRate()
	{
		System.out.println("Home Loan Int rate is 9%");
	}

	
	public void homeLoan() {
		System.out.println("SBI providing home loan");
	}
	

	
	public void carLoan() {
		System.out.println("SBI providing car loan");
	}
		
	
}


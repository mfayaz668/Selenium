package InterfaceDemo;

public class AdvacnceCalc2 implements Calc{

	public static void main(String[] args) 
	{
		
		Calc obj1 = new AdvacnceCalc2(); // you cannot create object of an interface
		
		// you cannot create object of an interface
		//Calc obj1 = new Calc();
		
		//AdvanceCalc obj = new Calc();
		//You cannot create object of an interface cos it has abstract method
		obj1.add();
		obj1.sub();
	}

	public void calculateSin()
	{
		System.out.println("I am in Advance Calc-Sin method");
	}
	
	public void calculateCos()
	
	{
		System.out.println("I am in Advance Calc-Cos method");
	}

	
	public void add() 
	{
		System.out.println("I am in add method");
		
	}

	
	public void sub() 
	{
		System.out.println("I am in sub method");
	}
}

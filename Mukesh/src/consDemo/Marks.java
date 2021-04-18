package consDemo;


public class Marks {
	//This example is for how to initialize values
	
	int result;
	public static void main(String[] args) // making changes after release 1.1
	{
		Marks m= new Marks(60);
		m.displayResult();

	}

	public Marks(int marks)
	{
		result = marks;
	}
	
	

	public void displayResult() 
	{
		System.out.println("Final Marks for student is "+result);
	}

}

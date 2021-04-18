package consDemo;

public class Student {

	int result;
	
	public static void main(String[] args)
	{
		Student obj1 = new Student("DPS", 1);
		obj1.displayResult();
	}

	public Student()
	{
		System.out.println("Hey welcome to school");
	}
	
	public Student(String schoolName) 
	{
		System.out.println("Hey welcome to "+ schoolName +"school");
	} 
	
	public Student(int rank) 
	{
		System.out.println("Hey welcome to school which ranked " + rank);
	} 
	
	public Student(String schoolName,int ranking) 
	{
		System.out.println("Hey welcome to " + schoolName + " who ranked " + ranking);
	} 
	
	public Student(int ranking,String schoolName) 
	{
		System.out.println("Hey welcome to school");
	} 
	
	
	
	public void displayResult() 
	{
		System.out.println("Final Marks for student is "+result);
	}
}

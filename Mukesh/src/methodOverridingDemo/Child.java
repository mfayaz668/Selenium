package methodOverridingDemo;

public class Child extends Parent 
{

	public static void main(String[] args) 
	{
		
		Child obj1 = new Child(); 
		obj1.display(); //Iam in child class display method - child class method will be called 
		
		Parent obj2 = new Parent();
		obj2.display(); //Iam in parent class method - Parent class method will be called 
		
		Parent obj3 = new Child();
		obj3.display();// Iam in child class display method - child class method will be called 
		
		//Child obj4 = new Parent();
		//obj4.display();// child class reference variable cannot hold parent class object


	}

	
	public void display()
	{
		System.out.println("Iam in child class display method");	
	}
	
	public void display(String name)
	{
		System.out.println("Iam in child class display method");	
	}
	
	
}

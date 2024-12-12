package OOPSconcepts;
class Parent
{
	public void job()
	{
		System.out.println("Engineer");
	}	
	public void phone()
	{
		System.out.println("Samsung");
	}		
}
class Child extends Parent
{
	public void job()
	{
		System.out.println("Doctor");
		super.job();
	}	
	public void phone()
	{
		System.out.println("Nokia");
		super.phone();
	}	
}
public class MthOverriding {

	public static void main(String[] args) {
		Child ob= new Child();
		ob.job();
		ob.phone();

	}
}

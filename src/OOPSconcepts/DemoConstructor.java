package OOPSconcepts;

public class DemoConstructor 
{
	int empid;
	String empname;

	public static void main(String[] args)
	{
	    DemoConstructor emp=new DemoConstructor(10, "Nisa");
	    System.out.println(emp.empid);
	    System.out.println(emp.empname);
	    
	    emp.display();
	   
		
	}
		public DemoConstructor(int empid,String empname)
		{
			this.empid=empid;
			this.empname=empname;
		}
		public void display()
		{
			System.out.println("Employee id = "+empid);
			System.out.println("Employee name = "+empname);
			
		}
}

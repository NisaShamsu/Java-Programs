package OOPSconcepts;
public class MthOverloading {

	public static void main(String[] args) {
		MthOverloading ob=new MthOverloading();
		ob.add();
		ob.add(20.6, 5);
		ob.add(8, 45.8);
		ob.add(6, 5);
		

	}

	public void add() 
	{
		int a=10,b=20,c;
		c=a+b;
		System.out.println(c);
		
	}
	
	public void add(int a, int b)
	{
		int c=a+b;
		System.out.println(c);
	}

	public void add(int a, double b)
	{
		double c=a+b;
		System.out.println(c);
	}
	public void add(double a, int b)
	{
		double c=a+b;
		System.out.println(c);
	}
}


package ExceptionHandling;
public class ExcpnPgm {
	public static void main(String[] args)
	{
		//Unchecked Exception Runtime Exception
		try
		{
			int c=5/0;
			System.out.println(c);	
		}
       catch(Exception e)
       {
    	  System.out.println(e.getMessage()); 
       }
			System.out.println("Hello hai");	
			try
			{
				String s=null;
				System.out.println(s.length());	
			}
			catch(NullPointerException e1) {
				System.out.println("Error message");
			}
			try
			{
				int a[]=new int[2];
				a[0]=1;
				a[1]=2;
				System.out.println(a[10]);	
		
			}
			catch(Exception e3)
			{
				System.out.println("Array index out of bound exception");
			}
	}

}

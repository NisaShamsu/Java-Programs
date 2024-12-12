package TASKS;

public class Fibonacci 
{

	public static void main(String[] args) 
	{
		
	   System.out.println("FIBONACCI SERIES UPTO 100\n--------------------------");
	   int a=0,b=1,c;
	   System.out.print(a+"  "+b+"  ");
	   for(int i=1;i<=50;i++)
      {   
	   c=a+b;
	   a=b;
	   b=c;
	   if(c>=100)
		   break;
	   System.out.print(c+"  ");
	   
     }
  }

}

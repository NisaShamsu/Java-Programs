package TASKS;
import java.util.Scanner;
public class Prime 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.out.println("PRIME NUMBER OR NOT\n--------------------");
		System.out.println("Enter a positive number");
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		int temp=0;
		if(x>=0)
		 {
		    for(int i=2;i<=x/2;i++)
		    {
		    	if(x%i==0)
		    	{
		    		temp++;
		    		break;
		    	}
 		    }
		    
		    if(temp==0 && x!=1)
		    {
		    	System.out.println(x+" is a prime");
		    }
		    else
		    {
		    	System.out.println(x+" not a prime");
		    }
		 }
	   else
	   {
		       System.out.println("Entered number is not a positive..please enter a positive number");
	   }
		sc.close();
   }
}

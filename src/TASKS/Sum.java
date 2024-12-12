package TASKS;
import java.util.Scanner;
public class Sum 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		char c;
		do
		{
	    	System.out.println("Addition of two numbers\n----------------------------\nEnter the first number");
	 		int x=sc.nextInt();
	 		System.out.println("Enter the second number");
	 		int y=sc.nextInt();
	 		int z=x+y;
	 		System.out.println("Sum of two numbers "+x+"+"+y+" is "+z);
	 		System.out.println("Do you want to continue....Y/N");
	 	    c=sc.next().charAt(0);	   
		}while((c!='N'&& c=='Y')||(c!='n'&& c=='y'));
		System.out.println("Process over...Exit");
		sc.close();
	}
}

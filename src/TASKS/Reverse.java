package TASKS;
import java.util.Scanner;
public class Reverse 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String as Testing Training Centre");
		String str=sc.nextLine();
		String st[]=str.split(" ");
		System.out.println("String after reverse is\n--------------------------");
		System.out.println("Method 1 output");//Direct printing elements from array
		System.out.println(st[2]+" "+st[1]+" "+st[0]);
		System.out.println("\nMethod 2 ouput");//Print using for loop
		for(int i=st.length-1;i>=0;i--)
		{
			System.out.print(st[i]+" ");
		}
		 
		sc.close();	
	}

}

package OOPSconcepts;
import java.util.Scanner;
public class PalindromeOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("PALINDROME OR NOT\n-------------------\nEnter a number :");
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		int temp=x,rev=0;	
		while(x>0)
		  {
			  int rem=x%10;
			  rev=rev*10+rem;
			  x=x/10;
		  }	
		if(temp==rev)
		{
			System.out.println(temp+" is a palindrome");
		}
		else
		{
			System.out.println(temp+" is not a palindrome");
		}
sc.close();
	}

}

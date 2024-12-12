package StringFunctions;

import java.util.Scanner;

public class StringPalindrome {

	public static void main(String[] args) {
		System.out.println("String Palindrome or not\n-------------------------\nEnter a String");
		Scanner sc=new Scanner(System.in);
		String s,rev="";
		s=sc.nextLine();
		int l=s.length();
		for(int i=l-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
		}
		if(rev.equals(s))
		{
		System.out.println("String Palindrome");
		}
		
		else
		{
			System.out.println("String not Palindrome");
			
		}
		
		
       sc.close();
	}

}
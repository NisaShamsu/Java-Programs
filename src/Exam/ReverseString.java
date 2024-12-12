package Exam;

import java.util.Scanner;
public class ReverseString
{
	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String");
		String str=sc.nextLine();
		char[] ch=str.toCharArray();
		System.out.println("String after reverse is");
		int j=ch.length;
		for(int i=j;i>0;i--)
		{		
		System.out.print(ch[i-1]);
		}
		sc.close();	
	}
}


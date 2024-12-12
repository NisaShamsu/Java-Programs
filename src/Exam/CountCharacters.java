package Exam;

import java.util.Scanner;

public class CountCharacters {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String");
		String str=sc.nextLine();
		int l=str.length();
		System.out.println("Total number of characters in the string is :"+l);		
	}

}

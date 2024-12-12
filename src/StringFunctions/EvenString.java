package StringFunctions;

import java.util.Scanner;

public class EvenString {

	public static void main(String[] args) {
		System.out.println("Even Strings in a line\n---------------------\nEnter a String");
		Scanner sc=new Scanner(System.in);
		String s;
		s=sc.nextLine();
		System.out.println("Entered string is :  "+s);
		System.out.println("Even words in the string is ");
		String st[]=s.split(" ");
		for(String e:st)
		{
			
			if(e.length() % 2==0)
			{
				System.out.println(e);
			}
			
		}
		sc.close();
	}

}

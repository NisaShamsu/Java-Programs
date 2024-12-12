package Methods;

import java.util.Scanner;

public class VowelCount {

	public static void main(String[] args)
	{
		System.out.println("vowels in a word\n-------------------------\nEnter a sentence");
		Scanner sc= new Scanner(System.in);
		String s=sc.next();
		VowelCount v=new VowelCount();
		int count=v.vowel(s);
		System.out.println("Vowel count in the word is : "+count);
		sc.close();
	}
	public int vowel(String s )
	{
		int count=0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'||s.charAt(i)=='s'||
			   s.charAt(i)=='A'||s.charAt(i)=='E'||s.charAt(i)=='I'||s.charAt(i)=='O'||s.charAt(i)=='U'||s.charAt(i)=='S')
			{
				count++;
			}
		}
		return count;
	}

}

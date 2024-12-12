package TASKS;

import java.util.Scanner;

public class NumberCount 
{
	public static void main(String[] args) 
	{
		int countP=0,countN=0,countO=0;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter how many numbers you want to enter");
		int x=sc.nextInt();
		System.out.println("Enter the some numbers (positive/Negative/Zero)");
		int arr[]=new int[x];
		for(int i=0;i<x;i++)
		{
			arr[i]=sc.nextInt();
			if(arr[i]>0)
			{
				countP++;
			}
			else if(arr[i]<0)
			{
				countN++;
			}
			else
			{
				countO++;
			}
			
		}
		System.out.println("Count of Positive numbers  : "+countP);
		System.out.println("Count of Negative numbers  : "+countN);
		System.out.println("Count of Zero numbers  : "+countO);
	}

}

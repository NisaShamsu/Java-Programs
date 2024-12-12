package TASKS;
import java.util.Scanner;
public class LargArray {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array size");
		int x=sc.nextInt();
		int arr[]=new int[x];
		System.out.println("Enter Elements");
		for(int i=0;i<x;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Elements in array are :");
		for(int i=0;i<x;i++)
		{
			System.out.print(arr[i]+" ");
			
		}
		int max = arr[0];
		for(int i=0;i<x;i++)
		{
			
			if(arr[i]>max)
			{
				max=arr[i];
			}
		}
			System.out.println("\nLargest element in array is :"+max);
		
		sc.close();
	}
}

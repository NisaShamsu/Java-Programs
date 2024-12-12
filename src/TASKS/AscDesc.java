package TASKS;
import java.util.Scanner;
public class AscDesc {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[3];
		System.out.println("Enter 3 elements into array");
		for(int i=0;i<3;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Elements in array are :");
		for(int i=0;i<3;i++)
		{
			System.out.print(arr[i]+" ");		
		}
		if((arr[0]>arr[1])&&(arr[1]>arr[2]))
		{
			System.out.println("\nDecreasing");
		}
		else if((arr[0]<arr[1])&&(arr[1]<arr[2]))
		{
			System.out.println("\nIncreasing");
		}
		else
		{
			System.out.println("\nNeither increasing nor decreasing");
		}			
sc.close();
	}

}

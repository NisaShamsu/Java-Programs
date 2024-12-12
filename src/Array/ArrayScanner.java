package Array;
import java.util.Scanner;
public class ArrayScanner {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int sum=0;
		System.out.println("Enter the array size");
		int x=sc.nextInt();
		int arr[]=new int[x];
		System.out.println("Enter Elements");
		for(int i=0;i<x;i++)
		{
			arr[i]=sc.nextInt();
			sum=sum+arr[i];
		}
		System.out.println("Elements in array are :");
		
		for(int i=0;i<x;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println("\nSum of array elements is "+sum);
		System.out.println("Average of array elements is "+sum/x);
        sc.close();
	}

}

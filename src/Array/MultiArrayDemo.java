package Array;
import java.util.Scanner;
public class MultiArrayDemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array row size ");
	    int x=sc.nextInt();
	    System.out.println("Enter array column size");
	    int y=sc.nextInt();
	    int arr[][]=new int[x][y];
	    System.out.println("Enter elements to array");
	    for(int i=0;i<x;i++)
	    {
	    	for(int j=0;j<y;j++)
	    	{
	    		arr[i][j]=sc.nextInt();
	    	}
	    }
	    System.out.print("The elements in array are");
	    for(int i=0;i<x;i++)
		{
	    	System.out.println();
	    	for(int j=0;j<y;j++)		
			System.out.print(arr[i][j]+" ");	    	
		}
	    sc.close();
	}

}

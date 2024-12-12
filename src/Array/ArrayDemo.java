package Array;
public class ArrayDemo 
{
	public static void main(String[] args) 
	{
		int arr[]=new int[3];
		arr[0]=25;
		arr[1]=50;
		arr[2]=75;
		System.out.println("Single dimentional array");
		for(int i=0;i<=2;i++)
		{
			System.out.print(arr[i]+" ");
		}
		
		String name[]= new String[3];
		name[0]="Ansa";
		name[1]="jinsa";
		name[2]="nisa";
		System.out.println();
		for(int i=0;i<=2;i++)
		{
			System.out.print(name[i]+" ");
		}
	
    }

}

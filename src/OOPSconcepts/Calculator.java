package OOPSconcepts;
import java.util.Scanner;
public class Calculator {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Simple Calculator\n-------------------------\n Enter first number : ");
		int x=sc.nextInt();
		System.out.println("Enter second number :");
		int y=sc.nextInt();
		System.out.println("Enter the operation to be performed");
		System.out.println("1.ADDITION 2.SUBTRACTION 3.MULTIPLICATION 4.DIVISION");
		int z=sc.nextInt();
		switch(z)
		{
			case 1:System.out.println("Sum is "+(x+y));
			break;
			case 2:System.out.println("Difference is "+(x-y));
			break;
			case 3:System.out.println("Product is "+(x*y));
			break;
			case 4:System.out.println("Division is "+(x/y));
			break;
			default:System.out.println("INVALID INPUT");
		
		}
		sc.close();
 }

}

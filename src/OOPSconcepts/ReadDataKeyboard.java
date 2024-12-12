package OOPSconcepts;

import java.util.Scanner;

public class ReadDataKeyboard {

	public static void main(String[] args) {
		// Scanner class

		System.out.println("Enter two  numbers : ");
		Scanner scnumber=new Scanner(System.in);
	    int z=scnumber.nextInt();
	    int y=scnumber.nextInt();
	    int c=z+y;
	    System.out.println("sum is : "+c);
	    
	    scnumber.close();
	}
	
}

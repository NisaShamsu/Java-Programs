package Array;

import java.util.Scanner;

public class UsernamePassword {

	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    System.out.println("USERNAME AND PASSWORD IN METRIX FORMAT\n-------------------------------------");
	    System.out.println("Enter how many username you need to enter");
	    int r=sc.nextInt();
	    System.out.println("Enter how many password you need to enter");
	    int c=sc.nextInt();
	    //int arr[][]=new int[r][c];
	    String newArray[][] = new String[c][r];
	    //String[][] newArray = new String[columns][rows];
	    String[] uname = new String[r];
	    System.out.println("Enter usernames ");
	    for(int i=0;i<r;i++)
	    {
	    	uname[i]=sc.nextLine();
	    }
	    String[] pass = new String[c];
	    System.out.println("Enter the passwords");
	    for(int j=0;j<c;j++)
	    {
	    	pass[j]=sc.nextLine();
	    }
	    
	    
	    //insert uname and pass to new array
	   
	    System.out.println("Entered usernames and passwords are");
	    for(int i=0;i<r;i++)
	    {
	    	System.out.println();
	    	for(int j=0;j<c;j++)
	    	{	
	    		
				//System.out.print(newArr[i][j]+" ");
	    	}
	    }   
	    sc.close();
	}

}

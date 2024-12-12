package Luminar;

public class Tasks {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		//1.Program to check if two numbers x and y are equal
		int v=23,w=45;
		System.out.println("Check 23 and 45 are equal :"+(v==w));
		
		//2.Conditional Checking
		int m=55,n=70;
		System.out.println("\nm=55 n=70 Checking Value of m<50 and n<70 is "+((m<50)&&(m<n))+"\n");		
		
		//3.swap without third variable
		System.out.println("Swapping without third varibale\n"+"-----------------------------------");
		int x=20,y=30;
		System.out.println("Value of a before swapping : "+x+"\n"+"Value of b before swapping : "+y);
		x=x+y;
		y=x-y;
		x=x-y;
		System.out.println("Value of a after swapping : "+x+"\n"+"Value of b after swapping :"+y+"\n");
		
		System.out.println("Swapping using third varibale\n"+"-----------------------------------");
		int a=20,b=40,c;
		System.out.println("Value of a before swapping : "+a+"\n"+"Value of b before swapping : "+b);
		c=a;
		a=b;
		b=c;
		System.out.println("Value of a after swapping : "+a+"\n"+"Value of b after swapping :"+b);
		
		//4.Print second digit
		int t=17,r=0;
		r=t%10;
		System.out.println("\nThe second digit of 17 is : " +r);			
	}
}

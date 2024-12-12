package ControllStatements;

public class Amstrong
 {

	public static void main(String[] args) 
	{
		System.out.println("NUMBER AMSTRONG OR NOT(SUM OF CUBE OF DIGITS IS EQUAL TO THE NUMBER ITSELF)\n-----------------------------------------------------------------------------");
		int n=153,sum=0,temp=n;
		while(n!=0)
		{
			int rem=n%10;
			sum=sum+(rem)*(rem)*(rem);
			n=n/10;
		}
	
		System.out.println("Number is "+temp+ " \nSum of cube of digits (1*1*1+5*5*5+3*3*3) is "+sum);
		if(sum==temp)
	       System.out.println(temp +" is an Amstrong number");
		else
			System.out.println(temp +" is not an Amstrong number");
	}
}

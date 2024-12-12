package ControllStatements;

public class Amstrong2 {

	public static void main(String[] args) 
	{
		System.out.println("NUMBER AMSTRONG OR NOT(SUM OF CUBE OF DIGITS IS EQUAL TO THE NUMBER ITSELF)\n-----------------------------------------------------------------------------");
		
		int n=153,sum=0,temp=n;

		//count
		 int num=153,count=0;
		  while(num!=0)
		  {
			  num=num/10;
			  count++;
		
		  }
		  System.out.println(count);
		int digit=count;	
		while(num!=0)
		{
			//int rem=n%10;
						
			for(int i=1;i<=digit;i++)
			{
			sum=sum+(digit)*(digit)*(digit);
			n=n/10;
			System.out.println(i);
			}
		}
	
		System.out.println("Number is "+temp+ " \nSum of cube of digits (1*1*1+5*5*5+3*3*3) is "+sum);
		if(sum==temp)
	       System.out.println(temp +" is an Amstrong number");
		else
			System.out.println(temp +" is not an Amstrong number");

	}

}

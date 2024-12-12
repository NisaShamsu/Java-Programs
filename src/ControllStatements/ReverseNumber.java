package ControllStatements;

public class ReverseNumber
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
	 System.out.println("Number before Reverse is 256");
	  int num=256,rev=0;
	  while(num!=0)
	  {
		  int rem=num%10;
		  rev=rev*10+rem;
		  num=num/10;
	  }
	  System.out.println("Number After Reverse is  "+rev);

	}

}

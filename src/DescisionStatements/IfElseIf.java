package DescisionStatements;

public class IfElseIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=67;
		if(a%5==0)
		{
			if(a%11==0)
			{
				System.out.println(a + " is divisible divisble by 11 and 5");
			}
			else
			{
				System.out.println(a + " is not divisible by 11 But divisible by 5");
			}
		}
		else
		{
			System.out.println(a + " is not divisible by 5 or 11");
		}
		

	}

}

package DescisionStatements;

public class ThreeLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=10,y=20,z=30;
		System.out.println("Largest number amoung 10 20 30 ");
		if(x>y && x>z)
		{
			System.out.println("10 is larger");
		}
		else if(y>x && y>z)
		{ 
			System.out.println("20 is larger");
		}
		else
		{
			System.out.println("30 is larger");
		}

	}

}

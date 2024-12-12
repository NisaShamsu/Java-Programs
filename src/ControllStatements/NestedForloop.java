package ControllStatements;

public class NestedForloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Pattern Printing 1");
		int i,j;
		for(i=1;i<=3;i++)
		{
			for(j=1;j<=3;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("Pattern Printing 2");
		int k,l;
		for(k=1;k<=4;k++)
		{
			for(l=1;l<=k;l++)
			{
			System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("Pattern Printing 3");
		int x,y,z=1;
		for(x=1;x<=4;x++)
		{
			for(y=1;y<=x;y++)
			{
			System.out.print(z+" ");
			z++;
			}
			System.out.println();
		}
		
	}

}

package Luminar;

public class operators1 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
	//ARITHMETIC OPERATORS
		int a=10,b=30;
		System.out.println("SUM OF A+B= "+(a+b));
		System.out.println("DIFFERENCE OF A-B= "+(a-b));
		System.out.println("MULTIPLICATION OF A*B= "+(a*b));
		System.out.println("REMAINDER OF A%B= "+(a%b));
		System.out.println("DIVISION OF A/B= "+(a/b));	
		
	//ASSIGNMENT OPERATOR
		int x=60;
		int y=20;
		x=y;
		System.out.println(x+=y); //x=x+y 20+20=40
		System.out.println(x-=y); //x=x-y 40-20=20
		
	//RELATIONAL OPERATOR TRUE/FALSE
		System.out.println("RELATIONAL OPERATORS");
		int d=50;int e=40;
		System.out.println(d==e); 
		System.out.println(d>e);
		System.out.println(d>=e);
		System.out.println(d<e);
		System.out.println(d<=e);
		System.out.println(d!=e);
		
	//LOGICAL OPERATOR
		System.out.println("LOGICAL OPERATORS");
		String username="nisa";
		String paswd="shinil";
		System.out.println((username=="nisa")&&(paswd=="shinil"));
		System.out.println((username=="shinil")&&(paswd=="nisa"));
		
		System.out.println((paswd=="nisa")||(username=="shinil"));
		System.out.println((paswd=="shinil")||(username=="nisa"));
		
		System.out.println(!(username=="nisa"));
		System.out.println(!(paswd=="nisa"));
		
		System.out.println(!(username=="shinil"));
		System.out.println(!(paswd=="shinil"));
		
	//UNARY OPERATOR
		int z=80;
		// z++ post increment
		// ++z pre increment
		// z-- post decrement
		// --z pre decrement
		
		System.out.println("The value of Z after post increment is");
	    System.out.println(z++);
		System.out.println(z);
		
		System.out.println("The value of Z after pre increment is");
		System.out.println(++z);
		System.out.println(z);
		
		System.out.println("The value of Z after post decrement is");
		System.out.println(z--);
		System.out.println(z);
		
		System.out.println("The value of Z after pre decrement is");
		System.out.println(--z);
		System.out.println(z);
		
	//TERNARY OPERATOR
		//SYNTAX VARIABLE=CONDITION ? EXP1 :EXP 2
		
	int n=10;int m=20;
	String v=m>n?"M is larger than N":"N is larger";
	System.out.println(v);
	
	int k=100;int l=50;
	String r=l>k?"l is larger than k":"k is larger";
	System.out.println(r);
	
	
		
 	}

}

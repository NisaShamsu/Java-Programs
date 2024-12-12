/*package Methods;
import java.util.Scanner;
public class Area 
{
	
	public static void main(String[] args) 
	{ 
		Scanner sc=new Scanner(System.in);
		Area a=new Area();
		
		a.circle();
		
		System.out.println("\nArea of square\n-------------------\nEnter side of a square");
		int s=sc.nextInt();
		a.square(s);
		System.out.println("Area of Square is : "+a.square(s));
	
		
		System.out.println("Area of rectangle : "+a.rectangle());
		
		
		
		System.out.println("Area of triangle\n----------------------------------\nEnter breadth of triangle");
		double b=sc.nextDouble();
		System.out.println("Enter height of triangle");
		double h=sc.nextDouble();
		a.triangle(double b,double h);
		sc.close();
	}

	//Method without return type and without parameters circle()
	public void circle()
	{
		System.out.println("Area of circle\n--------------------\nEnter the radius of circle");
		Scanner sc=new Scanner(System.in);
		double r = sc.nextInt();
		double ar=3.14*r*r;
		System.out.println("Area of circle is : "+ar);
		sc.close();
	}
	
	//Method with return type and with parameters square()
		public int square(int s)
		{
			int sqar=s*s;
			return sqar;
		}
	
	//Method with return type and without parameters rectangle()
	public double rectangle()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Area of Rectangle\n--------------------\nEnter the length of Rectangle");
		double l = sc.nextDouble();
		System.out.println("Enter the breadth of Rectangle");
		double b = sc.nextDouble();
		double area=l*b;
		sc.close();
		return area;

	}
	
	 //Method without return type and with parameters triangle()
	public void triangle(double b,double h)
	{
		double triarea=0.5*b*h;
		return System.out.println("Area of triangle is : "+triarea);
		
	}

}
*/
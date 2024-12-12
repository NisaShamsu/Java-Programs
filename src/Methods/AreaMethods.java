package Methods;
import java.util.Scanner;
public class AreaMethods {
	public static void main(String[] args) 
	{
		AreaMethods a = new AreaMethods();
		a.triangle();
		a.circle(4);
		System.out.println("Area of Rectangle is : "+a.rectarea());
		System.out.println("Area of Square is : "+a.square(4));
	}
	//Method without return type and without parameters Triangle()
	public void triangle()
	{
		double b=60,h=20,Triarea;
		Triarea=0.5*b*h;
		System.out.println("Area of Triangle is : "+Triarea);
	}
	//Method without return type and with parameters Circle()
	public void circle(double r)
	{
		double cirarea=3.14*r*r;
		System.out.println("Area of circle is : "+cirarea);
	}
	//Method with return type and with parameters square()
	public int square(int s)
	{
		int sqar=s*s;
		return sqar;
	}
	//Method with return type and without parameters rectangle()
	public double rectarea()
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Length of rectangle");
		int l=sc.nextInt();
		System.out.println("Enter Breadth of rectangle");
		int b=sc.nextInt();
		int arearect=l*b;
		sc.close();
		return arearect;
	}
}

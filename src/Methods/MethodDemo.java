package Methods;

public class MethodDemo {

	public static void main(String[] args) {
		//Method
		MethodDemo ob=new MethodDemo();
		ob.add();
		System.out.println(ob.sub());
		ob.mul(5, 25);
		System.out.println(ob.div(50, 10));
	}
	//Method without return type and without parameters add()
	public void add()
	{
		int a=50,b=20,c;
		c=a+b;
		System.out.println(c);
	}
	//Method with return type and without parameters sub()
     public int sub()
     {
    	 int a=100,b=80,c;
    	 c=a-b;
    	 return c;
     }
     //Method without return type and with parameters mul()
     public void mul(int a,int b)
     {
    	 int c=a*b;
    	 System.out.println(c);
     }
       //Method with return type and with parameters div()
     public double div(int a,int b)
     {
    	 double d=a/b;
    	 return d;
     }

}

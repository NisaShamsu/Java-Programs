package OOPSconcepts;

abstract class Cars {
	abstract public void acceleration();
	
	public void carEngine()
	{
		System.out.println("Engine Details");
	}
}	
	class Kia extends Cars
	{
		//override
		public void acceleration()
		{
			System.out.println("Kia Acceleration");
		}
	}
public class AbstactionPgm {

	public static void main(String[] args) {
		Kia ob=new Kia();
		ob.acceleration();
		ob.carEngine();

	}

}

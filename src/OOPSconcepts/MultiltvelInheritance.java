package OOPSconcepts;


class Birds
{
	public void birdDetails()
	{
		System.out.println("Bird Details");
		
	}
}

class Hen extends Birds
{
	public void henMthd()
	{
		System.out.println("Hen Details");
	}
}

class Chicken extends Hen
{
	public void chikenMtd()
	{
		System.out.println("Chicken Details");
	}
}
public class MultiltvelInheritance {

	public static void main(String[] args) {
	 Chicken ob= new Chicken();
	 ob.birdDetails();
	 ob.henMthd();
	 ob.chikenMtd();
	}

}

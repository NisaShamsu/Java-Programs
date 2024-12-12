package OOPSconcepts;

class Car
{
	public void displayMethod()
	{
		System.out.println("Car details");
	}
}

class Bmw extends Car
{
	public void bmwDetails()
	{
		System.out.println("BMW CAR DEATILS");
	}
}

public class SingleInheritance {

	public static void main(String[] args) {
		Bmw ob= new Bmw();
		ob.displayMethod();
		ob.bmwDetails();

	}

}

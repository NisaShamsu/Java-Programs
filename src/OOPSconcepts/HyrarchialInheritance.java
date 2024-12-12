package OOPSconcepts;

class Animal
{
	public void animalmth()
	{
		System.out.println("ANIMAL DETAILS");
	}
}

class Tiger extends Animal
{
	public void tigermthd()
	{
		System.out.println("Tiger details");
	}
}
class Deer extends Animal
{
	public void deermth()
	{
		System.out.println("Deer details");
	}
}

public class HyrarchialInheritance {

	public static void main(String[] args) {
	
		Tiger t1= new Tiger();
		t1.animalmth();
		t1.tigermthd();
		Deer d1=new Deer();
		d1.animalmth();
		d1.deermth();

	}

}

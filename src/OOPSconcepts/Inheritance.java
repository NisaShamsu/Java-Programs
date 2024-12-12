package OOPSconcepts;
class Membr
{
	String name,address;
	int age,salary,phno;
	
	public void print()
	{
		System.out.println("Name : "+name);
		System.out.println("Age : "+age);
		System.out.println("Phone : "+phno);
		System.out.println("Address : "+address);
		System.out.println("Salary : "+salary);
	}
}
class emp extends Membr
{ 
	String Dept;
	
}
class man extends Membr
{
	 String Specialisation;
}
public class Inheritance {

	public static void main(String[] args) {
		emp ob= new emp();
		ob.name="Nisa";
		ob.age=23;
		ob.phno=48562653;
		ob.address="Pdannattu house";
		ob.salary=25000;
		System.out.println(ob.Dept="Testing");
		ob.print();
		
		man ob1= new man();
		ob1.name="Shamsu";
		ob1.age=30;
		ob1.phno=253689412;
		ob1.address="Pdannattu house";
		ob1.salary=30000;
		System.out.println(ob1.Specialisation="Automation");
		ob1.print();

	}

}

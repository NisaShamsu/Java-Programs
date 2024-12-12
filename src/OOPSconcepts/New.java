package OOPSconcepts;

class Member
{
	String name;
	int age;
	String phoneno;
	String address;
	double salary;
	
	public void printDetails()
	{
		System.out.println("Salary" +salary);
	}

}

class Employee extends Member
{
	String specialisation;
}

class Manager extends Member
{
	String department;
}

public class New {

	public static void main(String[] args) {
		Employee emp=new Employee();
		emp.name="Nisa";
		emp.age=30;
		emp.specialisation="Automation";
		emp.phoneno="2356142526";
		emp.address="Kakkanad";
		emp.salary=30000;
		
		Manager mgr=new Manager();
		mgr.name="Shamsu";
		mgr.age=35;
		mgr.department="Testing";
		mgr.phoneno="5623845212";
		mgr.address="Ernakulam";
		mgr.salary=600000;
		
		System.out.println("Employee Details \n");
		System.out.println("Name=" +emp.name);
		System.out.println("age=" +emp.age);
		System.out.println("Specialised in " +emp.specialisation);
		System.out.println("Phone Number=" +emp.phoneno);
		System.out.println("Address=" +emp.address);
		emp.printDetails();
		
		System.out.println(" ");
		
		System.out.println("Manager Details \n");
		System.out.println("Name=" +mgr.name);
		System.out.println("age=" +mgr.age);
		System.out.println("Department is " +mgr.department);
		System.out.println("Phone Number=" +mgr.phoneno);
		System.out.println("Address=" +mgr.address);
		emp.printDetails();
	}

}
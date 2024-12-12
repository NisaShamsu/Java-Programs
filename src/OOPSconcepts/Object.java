package OOPSconcepts;

public class Object {

	int empid;
	String empname,empdesig;
	public static void main(String[] args) {
		// object creation
		Object emp1=new Object();
		emp1.empid=101;
		emp1.empname="Nisa";
		emp1.empdesig="Tester";
		//Directly in println System.out.println(emp1.empid=101);
		System.out.println("Employee id : "+emp1.empid); //by passing object
		System.out.println("Employee name : "+emp1.empname);
		System.out.println("Employee Designation : "+emp1.empdesig);
		
		Object emp2=new Object();
		emp2.empid=102;
		emp2.empname="Ansa";
		emp2.empdesig="QA";
		System.out.println("Employee id : "+emp2.empid+"\nEmployee Name : "+emp2.empname+"\nEmployee Designation :"+emp2.empdesig);
		
		Object emp3=new Object();
		emp3.empid=103;
		emp3.empname="Jinsa";
		emp3.empdesig="Software Developer";
		System.out.println("Employee id : "+emp3.empid+"\nEmployee Name : "+emp3.empname+"\nEmployee Designation :"+emp3.empdesig);
	}

}

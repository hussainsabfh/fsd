class Employee
{
	int eid;
	String ename;
	Employee()
	{
		eid=123;
		ename="Indrajith";
	}
	
	Employee(int id,String name)
	{
		eid=id;
		ename=name;
	}
	public void display()
	{
		System.out.println("Employee id is "+eid);
		System.out.println("Employee name is "+ename);
	}
	
	Employee(Employee ee)
	{
		eid=ee.eid;
		ename=ee.ename;
	}
}

public class ConstructorDemo
{
	public static void main(String args[])
	{
		Employee e1=new Employee();
		Employee e2=new Employee(446,"Swamy");
		Employee e3=new Employee(e2);
		e1.display();
		e2.display();
		e3.display();
	}
}
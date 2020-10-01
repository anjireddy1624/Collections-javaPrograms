package Collection;

import java.util.LinkedList;
class Detiles
{
	String name;
	int eid;
	double salary;
	public Detiles(String name,int eid,double salary)
	{
		this.name = name;
		this.eid = eid;
		this.salary = salary;
	}
	public String toString()
	{
		return "Nmae: "+name+","+"Eid: "+eid+","+"Salary: "+salary;
	}
	
}
public class Employee 
{
	public static void main(String ar[])
	{
		LinkedList el = new LinkedList();
		el.add(new Detiles("veeranji",424,23000));
		el.add(new Detiles("anji",24,20000));
		el.add(new Detiles("veera",42,26000));
		show(el);
	}
	
	public static void show(LinkedList ref)
	{
		for(Object obj:ref)
		{
			System.out.println(obj);
		}
	}
	
	
}

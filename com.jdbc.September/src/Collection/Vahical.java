package Collection;

import java.util.ArrayList;
class Bike
{
	String name;
	int bikeModel;
	public Bike(String name,int bikeModel)
	{
		this.name = name;
		this.bikeModel = bikeModel;
	}
	public String toString()
	{
		return "Name"+" "+name+":"+"BikeModel"+" "+bikeModel;
	}
}
class Car
{
	String name;
	int carModel;
	public Car(String name,int carModel)
	{
		this.name = name;
		this.carModel = carModel;
	}
	public String toString()
	{
		return "Name"+" "+name+":"+"CarModel"+" "+carModel;
	}
}
public class Vahical 
{
	public static void main(String []ar)
	{
		ArrayList al = new ArrayList();
		al.add(new Car("maruthi",1990));
		al.add(new Car("Shift",2000));
		al.add(new Bike("yamaha",1900));
		al.add(new Bike("ktm",2000));
		showDetiles(al);
	}
	public static void showDetiles(ArrayList ref)
	{
		for(Object obj:ref)
		{
			System.out.println(obj);
		}
	}
}

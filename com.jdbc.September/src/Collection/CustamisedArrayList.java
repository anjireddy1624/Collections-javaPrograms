package Collection;

import java.util.*;

import com.mysql.fabric.xmlrpc.base.Data;
public class CustamisedArrayList 
{
	int i, n=4;
	class Student
	{
		String name;
		int id;
		long number;
		char grade;
		public Student(String name,int id,long number, char grade2)
		{
			this.name=name;
			this.id = id;
			this.number=number;
			this.grade = grade;
		}
	}
	public static void main(String[] ar)
	{
		String name[] = {"veeranji","kailash","jone","mike"};
		int id[] = {121,123,124,234};
		long number[] = {23432,678543,67897,9087654};
		char grade[] = {'a','d','a','c'};
		
		CustamisedArrayList ca = new CustamisedArrayList();
		ca.addValues(name,id,number,grade);
	}
	public void addValues(String[] name, int[] id, long[] number, char[] grade)
	{
		ArrayList<Data> list = null;
		for(int i=0;i<n;i++)
		{
			//list.add( new Student(name[i], id[i], number[i],grade[i]));
		}
		printValues(list);
	}
	public void printValues(ArrayList<Data> list)
	{
		for(i=0;i<n;i++)
		{
			System.out.println(list.get(i));
		}
	}
}

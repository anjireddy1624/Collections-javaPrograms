package Collection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import java.util.LinkedHashSet;
public class RemoveDuplicatesInArrayList 
{
	public static void main(String ar[])
	{
		ArrayList al = new ArrayList();
		al.add("veranji");
		al.add("kiran");
		al.add("nigi");
		al.add("e");
		al.add("veeanji");
		al.add("kiran");
		al.add("nigi");
		System.out.println("it will print the entire list like an arry");
		System.out.println(al);
		System.out.println("Using For each loop");
		
		for(Object obj: al)
		{
			System.out.println(obj);
		}
		System.out.println("---------------");
		int l = al.size();
		
		for(int i=l-1;i>=0;i--)
		{
			System.out.println(al.get(i));
		}
		/*
		Collections.sort(al);
		Set s = new LinkedHashSet(al);
		al.clear();
		al.add(s);  
		for(Object obj:al)
		{
			System.out.println(obj);
		}*/
		
	}
}

package Collection;

import java.util.LinkedList;
import java.util.ArrayList;
import java.util.Collections;

public class LinkedList1 {

	public static void main(String[] args) 
	{
		LinkedList ll = new LinkedList();
		ll.add(200);
		ll.add(55);
		ll.add(466);
		ll.add("king");
		System.out.println(ll);
		ll.add(0,500);
		System.out.println(ll);
		for(Object onj:ll)
		{
			System.out.println(onj);
		}
		
		ArrayList al = new ArrayList();
		al.add(300);
		al.add("veeranji");
		al.add("king Kong");
		
		ll.addAll(al);
		
		for(Object onj:ll)
		{
			System.out.println(onj);
		}
		//Collections.sort(ll);
		ll.clear();
		System.out.println(ll);
		
	}
}

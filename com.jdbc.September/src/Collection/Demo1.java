package Collection;
import java.util.ArrayList;
public class Demo1 
{
	public static void main(String ar[])
	{
		ArrayList ad = new ArrayList();
		ad.add(24);
		ad.add("veeranji");
		ad.add("ece");
		System.out.println(ad);
		for(Object ob:ad)
		{
			System.out.println(ob);
		}
		System.out.println(ad.size());
		System.out.println(ad.add("hero"));
		ad.add(1,34);
	}
}

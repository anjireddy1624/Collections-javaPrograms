package Collection;

public class Demo 
{
	Object[] obj = new Object[3];
	int i=0;
	
	public boolean add(Object a)
	{
		if(size()==obj.length)
		{
			incress();
		}
		obj[i++]=a;
		return true;
	}
	private void incress()
	{
		Object temp[] = new Object[(obj.length*3/2)+1];
		for(int i=0;i<obj.length;i++)
		{
			temp[i]=obj[i];
		}
		obj = temp;
	}
	public Object get(int i)
	{
		return (obj[i]);
	}
	public int size()
	{
		return i;
	}
}

class Array
{
	public static void main(String[] ar)
	{
		Demo de = new Demo();
		de.add("hello");
		de.add("java");
		de.add("welcome");
		de.add("ila");
		System.out.println(de.get(3));
		
	}
}

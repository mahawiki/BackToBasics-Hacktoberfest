import java.util.*;
class _4_map
{
	public static void main(String args[])
	{
		Hashtable <Integer, String> hm=new Hashtable <Integer, String> ();
		//HashMap <Integer, String> hm=new HashMap <Integer, String> ();
		//LinkedHashMap <Integer, String> hm=new LinkedHashMap <Integer, String> ();
		//TreeMap <Integer, String> hm=new TreeMap <Integer, String> ();
		hm.put(1,"riddhi");
		hm.put(3,"siddhi");
		hm.put(2,"zidhi");
		hm.put(4,"riddhi"); System.out.println(hm);
		hm.put(2,"niddhi");
		System.out.println(hm);

		//to create iterator
		Set s=hm.entrySet();
		Iterator itr=s.iterator();
		while(itr.hasNext())
		{
			Map.Entry m=(Map.Entry) itr.next();
			System.out.println("key : "+m.getKey()+"  &  value : "+m.getValue());
		}

		//for hashtable
		Enumeration e=hm.elements();
		while(e.hasMoreElements())
		{
			System.out.print(e.nextElement()+" ");
		}

		System.out.println("\n"+hm.isEmpty());
		System.out.println(hm.size());
		System.out.println(hm.containsKey(2));
		System.out.println(hm.containsValue("riddhi"));
		System.out.println(hm.get(3));
		System.out.println(hm.remove(4));
		System.out.println(hm.equals(hm)); System.out.println(hm);
		System.out.println(hm.remove(2,"niddhi")); System.out.println(hm);
		System.out.println(hm.replace(1,"riddhi","om")); System.out.println(hm);
		System.out.println(hm.replace(3,"hi"));
		System.out.println(hm);
		hm.clear();
		System.out.println(hm);
		

	}
}
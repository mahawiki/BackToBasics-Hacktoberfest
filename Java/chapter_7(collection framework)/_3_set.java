import java.util.*;
import java.io.*;

class _3_set
{
	public static void main(String args[])
	{
		/* // for treeSet
		TreeSet <Integer> al= new TreeSet <Integer> ();

			al.add(new Integer(100));
			al.add(new Integer(10));
			al.add(new Integer(109));	
		*/
		// LinkedHashSet <Integer> al= new LinkedHashSet <Integer> ();

		HashSet <Integer> al= new HashSet <Integer> ();

		for(int i=0;i<5;i++)
			al.add(new Integer(100+i));	//100 101 102 103 104
		System.out.println(al);
		al.add(new Integer(100));
		System.out.println(al);

		//methods of Collection interface
		System.out.println(al.isEmpty());
		System.out.println(al.size());
		System.out.println(al.contains(102));

		Iterator <Integer> itr=al.iterator();
		while(itr.hasNext())
			System.out.print(itr.next()+"  ");	//100 101 102 104

		HashSet al2= new HashSet ();
		for(int i=1;i<4;i++)
			al2.add(new Integer(100+i));	//101 102 103
		System.out.println("\n"+al.containsAll(al2));
		System.out.println(al.addAll(al2));
		System.out.println(al);
		System.out.println(al.retainAll(al2));
		System.out.println(al);
		System.out.println(al.removeAll(al2));
		System.out.println(al);
		System.out.println(al2.equals(al2));
		System.out.println(al2.equals(102));
		System.out.println(al2.hashCode()+"   "+al.hashCode());
		al2.clear();
		System.out.println(al2);
	}
}
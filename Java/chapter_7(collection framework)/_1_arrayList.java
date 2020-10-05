import java.util.*;
//import java.io.*;

class _1_arrayList
{
	public static void main(String args[])
	{
		ArrayList <Integer> al= new ArrayList <Integer> (15);

		for(int i=0;i<5;i++)
			al.add(new Integer(100+i));	//100 101 102 103 104
		System.out.println(al);

		// specific methods of List
		System.out.println("removed: "+al.remove(3)+" \nremaining are: ");
		System.out.println(al);
		System.out.println(al.get(2));
		System.out.println(al.set(2,1002));
		System.out.println(al.indexOf(1002));

		ListIterator ltr=al.listIterator();
		while(ltr.hasNext())
		{
			System.out.print(ltr.next()+" ");
		}
		// specific methods end

		//methods of Collection interface
		System.out.println("\n"+al.isEmpty());
		System.out.println(al.size());
		System.out.println(al.contains(102));

		Iterator itr=al.iterator();
		while(itr.hasNext())
			System.out.print(itr.next()+"  ");	//100 101 1002 104

		
		ArrayList al2= new ArrayList (15);
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
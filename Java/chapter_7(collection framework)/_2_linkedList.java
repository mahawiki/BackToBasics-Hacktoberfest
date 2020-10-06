import java.util.*;
//import java.io.*;
class _2_linkedList
{
	public static void main(String args[])
	{
		LinkedList <Integer> ll= new LinkedList <Integer> ();


		for(int i=0;i<5;i++)
			ll.add(100+i);	//100 101 102 103 104
		System.out.println(ll);

		// specific methods LinkedList
		ll.addFirst(99);
		ll.addLast(105);
		System.out.println(ll);
		System.out.println(ll.getFirst()+"  "+ll.getLast());
		System.out.println(ll.removeFirst()+"  "+ll.removeLast());
		System.out.println(ll);
		// specific methods LinkedList end

		// specific methods of List
		System.out.println("\nremoved: "+ll.remove(3)+" \nremaining are: ");
		System.out.println(ll);
		System.out.println(ll.get(2));
		System.out.println(ll.set(2,1002));
		System.out.println(ll.indexOf(1002));

		ListIterator ltr=ll.listIterator();
		while(ltr.hasNext())
		{
			System.out.print(ltr.next()+" ");
		}
		// specific methods end

		//methods of Collection interface
		System.out.println("\n"+ll.isEmpty());
		System.out.println(ll.size());
		System.out.println(ll.contains(102));

		Iterator itr=ll.iterator();
		while(itr.hasNext())
			System.out.print(itr.next()+"  ");	//100 101 102 104
		
		LinkedList ll2= new LinkedList ();
		for(int i=1;i<4;i++)
			ll2.add(new Integer(100+i));	//101 102 103
		System.out.println("\n"+ll.containsAll(ll2));
		System.out.println(ll.addAll(ll2));
		System.out.println(ll);
		System.out.println(ll.retainAll(ll2));
		System.out.println(ll);
		System.out.println(ll.removeAll(ll2));
		System.out.println(ll);
		System.out.println(ll2.equals(ll2));
		System.out.println(ll2.equals(102));
		System.out.println(ll2.hashCode()+"   "+ll.hashCode());
		ll2.clear();
		System.out.println(ll2);
	}
}
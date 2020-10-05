import java.util.*;

public class _30_VectorClass 
{
	public static void main(String[] args) 
	{
		Vector v=new Vector(2,2);
		System.out.println("capacity: "+v.capacity()+" size: "+v.size());
		v.addElement(10);
		v.addElement(new Float(20.5));
		
		System.out.println(v.firstElement());
		System.out.println(v.lastElement());
		
		v.insertElementAt(new Character('c'), 1);
		
		System.out.println(v.get(1));
		System.out.println(v);
		System.out.print("\nelements contained in vector are:\n");
		Enumeration venum=v.elements();
		while(venum.hasMoreElements())
		{
			System.out.print(venum.nextElement()+" ");
			System.out.println();
		}
	}
}

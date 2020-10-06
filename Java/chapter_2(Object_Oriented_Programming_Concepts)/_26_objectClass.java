class A10 
{
	int n1=10,n2=20;
}

class B10
{
	int n1=10,n2=20,n3=30;
}

public class _26_objectClass 	//it is default superclass of all classes
{
	public static void main(String[] args)
	{
		A10 o1=new A10();
		B10 o2=new B10();
		System.out.println(o1.equals(o1));
		System.out.println(o1.getClass());
		System.out.println(o1.toString());	//returns strings that describes object
		System.out.println(o2.hashCode());
		//A10 o3=o1.clone();
	}
}

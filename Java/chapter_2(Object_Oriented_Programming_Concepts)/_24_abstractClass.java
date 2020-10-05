abstract class A8
{
	A8()
	{
		System.out.println("in abstract class constructor");
	}
	abstract void show();
	void show1()
	{
		System.out.println("in abstract class concrete method()");
	}
}

class B8 extends A8
{
	void show()
	{
		System.out.println("in B class abstract method show()");
	}
}

public class _24_abstractClass 
{
	public static void main(String[] args)
	{
		B8 obj=new B8();	//or can be stored in A8 reference
		obj.show1();
		obj.show();
	}
}

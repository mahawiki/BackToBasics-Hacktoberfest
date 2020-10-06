class A4
{
	void show()
	{
		System.out.println("in A1");
	}
}

class B4 extends A4
{
	void show()
	{
		System.out.println("in B1");
	}
}

public class _20_methodOverriding 
{
	public static void main(String[] args) 
	{
		B4 obj=new B4();
		obj.show();
		A4 obj1=new A4();
		obj1.show();
	}
}

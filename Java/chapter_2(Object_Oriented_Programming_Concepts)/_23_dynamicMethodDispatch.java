class A7
{
	void show()
	{
		System.out.println("in parent A ");
	}
}

class B7 extends A7
{
	void show()
	{
		System.out.println("in child B ");
	}
}

public class _23_dynamicMethodDispatch 
{
	public static void main(String[] args)
	{
		A7 obj=new A7();
		obj.show();
		   obj=new B7(); //upcasting
		obj.show(); //dynamic method dispatch
	}
}

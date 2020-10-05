class A2
{
	void showA()
	{
		System.out.println("in A1");
	}
}

class B2 extends A2
{
	void showB()
	{
		System.out.println("in B1");
	}
}

class C2 extends B2
{
	void showC()
	{
		System.out.println("in C1");
	}
}

public class _18_multilevel_Inheritance 
{
	public static void main(String[] args) 
	{
		C2 obj=new C2();
		obj.showA();
		obj.showB();
		obj.showC();
	}
}

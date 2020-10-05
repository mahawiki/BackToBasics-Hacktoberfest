class A3
{
	void showA()
	{
		System.out.println("in A1");
	}
	
}

class B3 extends A3
{
	void showB()
	{
		System.out.println("in B1");
	}
}

class C3 extends A3
{
	void showC()
	{
		System.out.println("in C1");
	}
}

public class _19_hierarchical_Inheritance 
{

	public static void main(String[] args) 
	{
		B3 obj=new B3();
		obj.showA();
		obj.showB();
		C3 obj1=new C3();
		obj1.showC();
	}

}

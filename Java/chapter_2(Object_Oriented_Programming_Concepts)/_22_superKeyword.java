class A6
{
	int n1=10;
	A6(int n)
	{
		System.out.println("constructing A1 "+n);
	}
	void show()
	{
		System.out.println("in A1");
	}
	
}
class B6 extends A6
{
	int n1=20;
	B6()
	{	super(5);
		System.out.println("constructing B1");
	}
	void show()
	{
		System.out.println(super.n1);
		System.out.println(n1);
		super.show();
	}
}

public class _22_superKeyword 
{
	public static void main(String[] args) 
	{
		B6 obj=new B6();
		obj.show();
	}
}

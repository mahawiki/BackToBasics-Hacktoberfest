
class A1
{
	void showA()
	{
		System.out.println("in A1");
	}
	
}

class B1 extends A1
{
	void showB()
	{
		System.out.println("in B1");
	}
}

public class _17_singleInheritance 
{
	public static void main(String[] args) 
	{
		B1 obj=new B1();
		obj.showA();
		obj.showB();
	}
}

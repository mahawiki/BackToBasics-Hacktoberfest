
class Outer1
{
	static int n1=10;
	private int n2=20;
	class Inner1
	{
		void show()
		{
			System.out.println(n1+" "+n2);
		}
	}
}

public class _14_nonStaticNestedClass 
{
	public static void main(String[] args) 
	{
		Outer1 o1=new Outer1();
		Outer1.Inner1 o2=o1.new Inner1();
		o2.show();
	}
}


class Outer
{
	private  static int n1=10;
	int n2=20;
	
	static class Inner
	{
		 void show()
		{
			 System.out.println(n1);
			 Outer o1=new Outer();          // if n1 is not static
			System.out.println(o1.n2);
		}
	}
}

public class _13_staticNestedClasses 
{
	public static void main(String[] args) 
	{
		Outer.Inner Iobj=new Outer.Inner();
		Iobj.show();
		//Outer.Inner.show();		//if show() is static
	}
}

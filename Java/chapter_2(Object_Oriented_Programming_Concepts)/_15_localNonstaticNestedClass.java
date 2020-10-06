
class Outer2
{	
	int n2=20;
	void showOut()
	{
	    int n1=10;
		class inner2
		{	int n3=30;
			void showIn()
			{	int n4=40;
				System.out.println(n1+" "+n2+" "+n3+" "+n4);
			}
		}
		inner2 o=new inner2();
		o.showIn();
	}
}

public class _15_localNonstaticNestedClass 
{
	public static void main(String[] args) 
	{
		Outer2 o1=new Outer2();
		o1.showOut();
	}
}

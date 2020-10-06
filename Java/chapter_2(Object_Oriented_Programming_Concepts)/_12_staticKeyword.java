
class StaticDemo
{
	static int n1;
	static void show()
	{
		System.out.println("in show() method : "+n1);
	}

	static 
	{ 
		System.out.println("in static block ");
		n1=10;
	}
}

public class _12_staticKeyword 
{
	public static void main(String[] args) 
	{
		StaticDemo.show();
		System.out.println(StaticDemo.n1);
	}
}

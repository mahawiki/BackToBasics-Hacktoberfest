
class Swap2
{
	int n1,n2;
	Swap2 show()
	{   Swap2 o2=new Swap2();
		o2.n1=10;
		o2.n2=20;
		System.out.println("new object created");
		return o2;
	}
}

public class _9_returningObjects 
{
	public static void main(String[] args)
	{
		Swap2 o1=new Swap2();
		o1=o1.show();
		System.out.println("values of new obj : "+o1.n1+" "+o1.n2);
	}
}

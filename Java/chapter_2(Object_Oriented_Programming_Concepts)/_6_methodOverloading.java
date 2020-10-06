class Add5
{
	void add(int n1,int n2)
	{
		int res=n1+n2;
		System.out.println(res);
	}
	void add(double n1,int n2)
	{
		double res=n1+n2;
		System.out.println(res);
	}
	void add(float n1,float n2)
	{
		float res=n1+n2;
		System.out.println(res);
	}
	void add(long n1,long n2)
	{
		long res=n1+n2;
		System.out.println(res);
	}
}

public class _6_methodOverloading 
{
	public static void main(String[] args)
	{
		Add5 o1=new Add5();
		o1.add(10,20);
		o1.add(10.5,20);
		o1.add(10.4f,20.3f);
		o1.add(10000001,20000001);
	}

}

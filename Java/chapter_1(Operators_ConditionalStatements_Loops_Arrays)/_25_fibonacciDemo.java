
class _25_fibonacciDemo
{
	int limit=5,n1=0,n2=1,n3;
	void demo()
	{	
		System.out.print(n1+" "+n2);
		for(int i=3;i<=limit;i++)
		{
			n3=n1+n2;
			System.out.print(" "+n3);
			n1=n2;
			n2=n3;
		}
	}

	public static void main(String[] args) 
	{
		_25_fibonacciDemo obj=new _25_fibonacciDemo();
		obj.demo();
		//ans 0 1 1 2 3
	}
}

class Add1
{
	int res;
	Add1()
	{
		res=0;
	}
	Add1(int no1)
	{
		res=no1;
	}
	
	void display()
	{
		System.out.println("result = "+res);
	}
}

public class _3_constructorOverloading 
{
	public static void main(String[] args)
	{
		Add1 o1=new Add1();
		o1.display();

			o1=new Add1(10);
		o1.display();
	}
}

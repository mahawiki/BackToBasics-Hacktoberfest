
class _24_factorialDemo
{
	int no,fact=1;
	void factorial()
	{
		for(int i=2;i<=no;i++)
		{
			fact=fact*i;
		}
		System.out.println("factorial of "+no+" is "+fact);
	}

	public static void main(String[] args) 
	{
		_24_factorialDemo obj=new _24_factorialDemo();

		obj.no=Integer.parseInt(args[0]);
		obj.factorial();

		String str=args[1];
		System.out.println(str.substring(2));

	}

}

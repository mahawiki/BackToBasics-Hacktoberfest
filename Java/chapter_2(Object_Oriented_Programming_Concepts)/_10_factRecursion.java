
class _10_factRecursion 
{
	int fact(int n)
	{
		int result;
		if(n==1)
			return 1;
		else
		{
			result= n*fact(n-1);
			return result;
		}
	}

	public static void main(String[] args) 
	{
		_10_factRecursion o=new _10_factRecursion();
		System.out.println("factorial is: "+o.fact(5));
	}
}

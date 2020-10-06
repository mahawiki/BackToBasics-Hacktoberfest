interface outer
{
		interface inner
		{
			int sub(int n1,int n2);
		}
}

class _6_nestedInterface implements outer.inner
{
	public int sub(int n1,int n2)
	{
		return (n1-n2);
	}

	public static void main(String args[])
	{
		_6_nestedInterface obj=new _6_nestedInterface();
		
		int res2=obj.sub(5,2);
		System.out.println(res2);

		outer.inner o1=new _6_nestedInterface();
		int res1=o1.sub(15,2);
		System.out.println(res1);
	}
}
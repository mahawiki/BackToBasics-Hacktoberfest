interface addition
{
	int add(int n1,int n2);
}

interface subtraction extends addition
{
	int sub(int n1,int n2);
}

class _3_extendingInterface implements subtraction
{
	public int add(int n1,int n2)
	{
		return (n1+n2);
	}
	public int sub(int n1,int n2)
	{
		return (n1-n2);
	}

	public static void main(String args[])
	{
		_3_extendingInterface obj=new _3_extendingInterface();
		int res1=obj.add(5,3);
		int res2=obj.sub(5,2);
		System.out.println(res1+" "+res2);
	}
}
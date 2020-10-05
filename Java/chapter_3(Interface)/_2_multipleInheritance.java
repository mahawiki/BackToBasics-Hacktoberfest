interface addition
{
	int add(int n1,int n2);
}

interface subtraction
{
	int sub(int n1,int n2);
}

class _2_multipleInheritance implements addition,subtraction
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
		_2_multipleInheritance obj=new _2_multipleInheritance();
		int res1=obj.add(5,3);
		int res2=obj.sub(5,2);
		System.out.println(res1+" "+res2);
	}
}
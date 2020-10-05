
class Add2
{
	int n1,n2;
	void addition(int n1,int n2)
	{
		this.n1=n1;
		this.n2=n2;

		int res=n1+n2;
		System.out.println("result = "+res);
	}
}

public class _4_thisKeyword 
{
	public static void main(String[] args)
	{
		Add2 o1=new Add2();
		o1.addition(10,20);
	}
}

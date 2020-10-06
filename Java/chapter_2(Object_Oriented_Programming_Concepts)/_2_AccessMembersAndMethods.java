
class Add3
{
	int n1,n2;
	void addition()
	{
		int res=n1+n2;
		System.out.println(res);
	}
}
public class _2_AccessMembersAndMethods 
{

	public static void main(String[] args)
	{
		Add3 o1=new Add3();
		o1.n1=10;
		o1.n2=20;
		o1.addition();

	}

}


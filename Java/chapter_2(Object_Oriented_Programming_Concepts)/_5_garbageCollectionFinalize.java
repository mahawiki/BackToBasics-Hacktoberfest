
class Add4
{
	Add4()
	{
		System.out.println("constructor called");
	}
	protected void finalize()
	{
		System.out.println("finalize called");
	}
}

public class _5_garbageCollectionFinalize
{
	public static void main(String[] args) 
	{
		Add4 o1=new Add4();
		Add4 o2=new Add4();
		o2=null;
		o1=null;
		System.gc();
		
		System.out.println("hi");
	}
}

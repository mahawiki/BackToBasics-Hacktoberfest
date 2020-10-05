class A9
{
	final int n1=10;	//cant change value
	final void show()	//cant override
	{
	 // n1=20;	 //throws error
		System.out.println("in parent A");
	}
}

final class B9 extends A9	//cant inherit
{
 /* void show()	//throws error
	{
		System.out.println("in parent A");
	}
 */
}
/* class C9 extends B9   //throws error
	{
		
	}   */
 
public class _25_finalKeyword 
{
	
}

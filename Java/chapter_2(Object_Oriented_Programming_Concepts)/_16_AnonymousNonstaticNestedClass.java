 /*abstract class Animal
 {
	abstract void show();
 }

public class _16_AnonymousNonstaticNestedClass 
{
	public static void main(String[] args) 
	{
		Animal o=new Animal()
				{
					void show()
					{
						System.out.println("name: Dog , color: brown , pecularity: sincerness");
					}
				};
		o.show();

	}

}

*/
 interface Animal
 {
	 void show();
 }

public class _16_AnonymousNonstaticNestedClass 
{
	public static void main(String[] args) 
	{
		Animal o=new Animal()
				{
					public void show()
					{
						System.out.println("name: Dog , color: brown , pecularity: sincerness");
					}
				};
		o.show();

	}

}



 /*
class Animal
{
	void show()
	{
		System.out.println("name: Cow , color: White , pecularity: gives milk");
	}
}
public class _16_AnonymousNonstaticNestedClass 
{

	public static void main(String[] args) 
	{
		Animal o=new Animal()
				{
					void show()
					{
						System.out.println("name: Dog , color: brown , pecularity: sincerness");
					}
				};
		o.show();
		System.out.println("hi");
		o.show();
		o.show();

	}

}
*/
/*
name: Dog , color: brown , pecularity: sincerness
hi
name: Dog , color: brown , pecularity: sincerness
name: Dog , color: brown , pecularity: sincerness
*/

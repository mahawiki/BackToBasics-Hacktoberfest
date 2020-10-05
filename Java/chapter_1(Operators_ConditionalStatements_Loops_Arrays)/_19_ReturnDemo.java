
class Demo
{
	void display()
	{
		System.out.println("in method");
		if(true)
		return;
		System.out.println("in method wont execute");
	}
}

public class _19_ReturnDemo 
{
	public static void main(String[] args) 
	{
		Demo o=new Demo();
		o.display();
		System.out.println("returned from method");

	}

}

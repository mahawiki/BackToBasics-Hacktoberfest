
class Swap1
{
	int n1,n2;
	void show(Swap1 o1)
	{
		int temp;
		temp=o1.n1;
		o1.n1=o1.n2;
		o1.n2=temp;
		System.out.println("swapping done");
	}
}

public class _8_callByReference 
{
	public static void main(String[] args)
	{
		Swap1 o1=new Swap1();
		o1.n1=10;
		o1.n2=20;
		System.out.println("value before calling of num1= "+o1.n1+" num2= "+o1.n2);
		o1.show(o1);
		System.out.println("value after calling of num1= "+o1.n1+" num2= "+o1.n2);
	}
}

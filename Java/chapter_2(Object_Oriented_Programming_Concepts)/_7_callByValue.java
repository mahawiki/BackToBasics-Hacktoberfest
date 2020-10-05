
class Swap
{
	void show(int n1,int n2)
	{
		int temp;
		temp=n1;
		n1=n2;
		n2=temp;
		System.out.println("swapping done");
	}
}

public class _7_callByValue 
{
	public static void main(String[] args)
	{
		int num1=10,num2=20;
		Swap o1=new Swap();
		System.out.println("value before calling of num1= "+num1+" num2= "+num2);
		o1.show(num1,num2);
		System.out.println("value after calling of num1= "+num1+" num2= "+num2);
	}
}


class Box2
{
	int height=10,width=20,depth=30;
	void calculate()
	{
		int volume=height*width*depth;
		System.out.println("volume is : "+volume);
	}
}

public class _0_BoxClass 
{
	public static void main(String[] args) 
	{
		Box2 b1=new Box2();
		b1.calculate();

	}
}

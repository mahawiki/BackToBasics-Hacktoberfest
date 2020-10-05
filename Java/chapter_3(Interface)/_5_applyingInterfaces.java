interface Area
{
	double pi=3.14,half=0.5;
	void area();
}

class Rectangle implements Area
{
	public void area()
	{
		double temp= half*10*12;
		System.out.println("area of rectangle= "+temp);
	}
}

class Circle implements Area
{
	public void area()
	{
		double temp= pi*10*10;
		System.out.println("area of circle= "+temp);
	}
}

class _5_applyingInterfaces 
{
	public static void main(String args[])
	{
		Area o1=new Rectangle();
		o1.area();

		     o1=new Circle();
		o1.area();

	}
}
